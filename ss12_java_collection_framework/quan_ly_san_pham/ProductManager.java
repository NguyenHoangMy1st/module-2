package ss12_java_collection_framework.quan_ly_san_pham;

import java.io.*;
import java.util.*;

public class ProductManager {
    private List<Product> products;
    private final String FILE_NAME = "products.csv"; // Định nghĩa tên file cố định

    public ProductManager() {
        this.products = new ArrayList<>();
        loadFromCSV(FILE_NAME);
    }

    // Đọc dữ liệu từ file CSV
    private void loadFromCSV(String filename) {
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            boolean firstLine = true; // Bỏ qua dòng tiêu đề
            while ((line = br.readLine()) != null) {
                if (firstLine) {
                    firstLine = false;
                    continue;
                }
                String[] data = line.split(",", 5); // Giới hạn split để tránh lỗi cắt dữ liệu
                if (data.length < 5) continue; // Bỏ qua dòng không hợp lệ

                int id = Integer.parseInt(data[0]);
                String name = data[1];
                double price = Double.parseDouble(data[2]);
                String description = data[3];
                String category = data[4];

                products.add(new Product(id, name, price, description, category));
            }
            System.out.println("Dữ liệu đã được nạp từ file CSV.");
        } catch (IOException e) {
            System.err.println("Lỗi khi đọc file CSV: " + e.getMessage());
        }
    }

    // Ghi danh sách sản phẩm vào CSV
    private void saveToCSV() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_NAME))) {
            bw.write("id,name,price,description,category\n");
            for (Product p : products) {
                // Tránh lỗi dấu phẩy trong mô tả sản phẩm bằng cách bao trong dấu ngoặc kép
                bw.write(p.getId() + "," + p.getName() + "," + p.getPrice() + ",\"" + p.getDescription() + "\"," + p.getCategory() + "\n");
            }
            System.out.println("Dữ liệu đã được lưu vào file CSV.");
        } catch (IOException e) {
            System.err.println("Lỗi khi ghi file CSV: " + e.getMessage());
        }
    }

    // Thêm sản phẩm
    public void addProduct(Product product) {
        products.add(product);
        saveToCSV();
    }

    // Cập nhật sản phẩm
    public boolean updateProduct(int id, String name, double price, String description, String category) {
        for (Product p : products) {
            if (p.getId() == id) {
                p.setName(name);
                p.setPrice(price);
                p.setDescription(description);
                p.setCategory(category);
                saveToCSV();
                System.out.println("Đã cập nhật sản phẩm có ID: " + id);
                return true;
            }
        }
        System.err.println("Không tìm thấy sản phẩm có ID: " + id);
        return false;
    }

    // Xóa sản phẩm
    public boolean removeProduct(int id) {
        boolean removed = products.removeIf(p -> p.getId() == id);
        if (removed) {
            saveToCSV();
            System.out.println("Đã xoá sản phẩm có ID: " + id);
        } else {
            System.err.println("Không tìm thấy sản phẩm có ID: " + id);
        }
        return removed;
    }

    // Hiển thị danh sách sản phẩm
    public void displayProducts() {
        if (products.isEmpty()) {
            System.out.println("⚠Danh sách sản phẩm trống.");
        } else {
            for (Product p : products) {
                System.out.println(p);
            }
        }
    }

    // Tìm kiếm sản phẩm theo tên
    public List<Product> searchProductByName(String keyword) {
        List<Product> result = new ArrayList<>();
        for (Product p : products) {
            if (p.getName().toLowerCase().contains(keyword.toLowerCase())) {
                result.add(p);
            }
        }
        return result;
    }

    // Sắp xếp sản phẩm theo giá tăng dần
    public void sortByPriceAscending() {
        products.sort(Comparator.comparingDouble(Product::getPrice));
        System.out.println("Đã sắp xếp sản phẩm theo giá tăng dần.");
    }

    // Sắp xếp sản phẩm theo giá giảm dần
    public void sortByPriceDescending() {
        products.sort(Comparator.comparingDouble(Product::getPrice).reversed());
        System.out.println("Đã sắp xếp sản phẩm theo giá giảm dần.");
    }
}
