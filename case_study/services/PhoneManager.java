package case_study.services;

import case_study.models.PhoneBook;

import java.io.*;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;

public class PhoneManager {
    private List<PhoneBook> phoneBooks = new ArrayList<>();
    private final String filename = "E:\\LearningJava\\Java\\src\\case_study\\data\\phonebook.csv";

    public void addPhoneBook(PhoneBook pb) {
        if (pb.getPhoneNumber().equals("Không hợp lệ")){
            System.out.println("Không thể thêm số điện thoại không hợp lệ.");
        } else {
            phoneBooks.add(pb);
            saveToFile();
        }
    }

    public boolean updatePhoneBook(String phoneNumber, PhoneBook newPhoneBook) {
        for (int i = 0; i < phoneBooks.size(); i++) {
            if (phoneBooks.get(i).getPhoneNumber().equals(phoneNumber)) {
                try{
                    phoneBooks.set(i, newPhoneBook);
                    saveToFile();
                    return true;
                }catch (IllegalArgumentException e){
                    System.out.println("Lỗi khi cập nhật danh bạ: " + e.getMessage());
                    return false;
                }
            }
        }
        return false;
    }

    public boolean deletePhoneBook(String phoneNumber) {
        for (int i = 0; i < phoneBooks.size(); i++) {
            if (phoneBooks.get(i).getPhoneNumber().equals(phoneNumber)) {
                phoneBooks.remove(i);
                saveToFile();
                return true;
            }
        }
        return false;
    }

    public List<PhoneBook> searchPhoneBooks(String query) {
        List<PhoneBook> results = new ArrayList<>();
        for (PhoneBook pb : phoneBooks) {
            if (pb.getPhoneNumber().contains(query) || pb.getName().toLowerCase().contains(query.toLowerCase())) {
                results.add(pb);
            }
        }
        return results;
    }

    public void sortPhoneBooks() {
            Collator collator = Collator.getInstance(new Locale("vi", "VN")); // Tạo Collator cho tiếng Việt
            phoneBooks.sort(Comparator.comparing(PhoneBook::getName, collator)); // Sử dụng Collator để so sánh tên
    }

    public void saveToFile() {
        File file = new File(filename);

        if (!file.getParentFile().exists()) {
            file.getParentFile().mkdirs();
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filename))) {
            System.out.println("Đang ghi file...");
            for (PhoneBook pb : phoneBooks) {
                String data = pb.toCSV();
                System.out.println("Ghi dòng: " + data);
                bw.write(data);
                bw.newLine();
            }
            System.out.println("Dữ liệu đã được ghi vào file: " + filename);
        } catch (IOException e) {
            System.out.println("Lỗi khi ghi file: " + e.getMessage());
        }
    }

    public void readFromFile() {
        phoneBooks.clear();
        File file = new File(filename);

        if (!file.exists()) {
            System.out.println("File không tồn tại: " + filename);
            return;
        }

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            System.out.println("Đang đọc file...");
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println("Đọc dòng: " + line);
                PhoneBook pb = PhoneBook.fromCSV(line);
                if (pb != null) {
                    phoneBooks.add(pb);
                }
            }
            System.out.println("Đã tải danh bạ từ file.");
        } catch (IOException e) {
            System.out.println("Lỗi khi đọc file: " + e.getMessage());
        }
    }
}