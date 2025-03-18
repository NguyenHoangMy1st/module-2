package ss12_java_collection_framework.quan_ly_san_pham;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProductManager manager = new ProductManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Quản lý sản phẩm ---");
            System.out.println("1. Thêm sản phẩm");
            System.out.println("2. Sửa sản phẩm");
            System.out.println("3. Xoá sản phẩm");
            System.out.println("4. Hiển thị danh sách sản phẩm");
            System.out.println("5. Tìm kiếm sản phẩm theo tên");
            System.out.println("6. Sắp xếp giá tăng dần");
            System.out.println("7. Sắp xếp giá giảm dần");
            System.out.println("0. Thoát");
            System.out.print("Chọn chức năng: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Nhập ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nhập tên: ");
                    String name = scanner.nextLine();
                    System.out.print("Nhập giá: ");
                    double price = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Nhập mô tả: ");
                    String description = scanner.nextLine();
                    System.out.print("Nhập danh mục: ");
                    String category = scanner.nextLine();
                    manager.addProduct(new Product(id, name, price, description, category));
                    break;

                case 2:
                    System.out.print("Nhập ID sản phẩm cần sửa: ");
                    int updateId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nhập tên mới: ");
                    String newName = scanner.nextLine();
                    System.out.print("Nhập giá mới: ");
                    double newPrice = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Nhập mô tả mới: ");
                    String newDescription = scanner.nextLine();
                    System.out.print("Nhập danh mục mới: ");
                    String newCategory = scanner.nextLine();
                    if (manager.updateProduct(updateId, newName, newPrice, newDescription, newCategory)) {
                        System.out.println("Cập nhật thành công.");
                    } else {
                        System.out.println("Không tìm thấy sản phẩm.");
                    }
                    break;

                case 3:
                    System.out.print("Nhập ID sản phẩm cần xoá: ");
                    int deleteId = scanner.nextInt();
                    if (manager.removeProduct(deleteId)) {
                        System.out.println("Xoá thành công.");
                    } else {
                        System.out.println("Không tìm thấy sản phẩm.");
                    }
                    break;

                case 4:
                    manager.displayProducts();
                    break;

                case 5:
                    System.out.print("Nhập tên sản phẩm cần tìm: ");
                    String keyword = scanner.nextLine();
                    manager.searchProductByName(keyword).forEach(System.out::println);
                    break;

                case 6:
                    manager.sortByPriceAscending();
                    System.out.println("Đã sắp xếp tăng dần.");
                    break;

                case 7:
                    manager.sortByPriceDescending();
                    System.out.println("Đã sắp xếp giảm dần.");
                    break;

                case 0:
                    System.out.println("Thoát chương trình.");
                    return;

                default:
                    System.out.println("Chức năng không hợp lệ.");
            }
        }
    }
}
