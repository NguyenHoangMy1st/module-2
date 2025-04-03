package case_study;

import case_study.models.PhoneBook;
import case_study.services.PhoneManager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PhoneManager manager = new PhoneManager();


        while (true) {
            System.out.println("\n===============================================================");
            System.out.println("1. Xem danh bạ\n2. Thêm mới\n3. Cập nhật\n4. Xóa\n5. Tìm kiếm\n6. Sắp xếp\n7. Đọc từ file\n8. Thoát");
            System.out.print("Chọn chức năng: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    manager.sortPhoneBooks();
                    manager.searchPhoneBooks("").forEach(System.out::println);
                    break;
                case 2:
                    System.out.print("Số điện thoại: ");
                    String phone = scanner.nextLine();
                    System.out.print("Nhóm: ");
                    String group = scanner.nextLine();
                    System.out.print("Họ tên: ");
                    String name = scanner.nextLine();
                    System.out.print("Giới tính: ");
                    String gender = scanner.nextLine();
                    System.out.print("Địa chỉ: ");
                    String address = scanner.nextLine();
                    manager.addPhoneBook(new PhoneBook(phone, group, name, gender, address));
//                    System.out.println("Thêm mới danh bạ thành công");
                    break;
                case 3:
                    System.out.print("Nhập số điện thoại cần cập nhật: ");
                    String updatePhone = scanner.nextLine();
                    System.out.print("Nhóm mới: ");
                    String newGroup = scanner.nextLine();
                    System.out.print("Họ tên mới: ");
                    String newName = scanner.nextLine();
                    System.out.print("Giới tính mới: ");
                    String newGender = scanner.nextLine();
                    System.out.print("Địa chỉ mới: ");
                    String newAddress = scanner.nextLine();

                    if (manager.updatePhoneBook(updatePhone, new PhoneBook(updatePhone, newGroup, newName, newGender, newAddress))) {
                        System.out.println("Cập nhật thành công.");
                    } else {
                        System.out.println("Không tìm thấy số điện thoại.");
                    }
                    break;
                case 4:
                    System.out.print("Nhập số điện thoại cần xóa: ");
                    String deletePhone = scanner.nextLine();
                    if (manager.deletePhoneBook(deletePhone)) {
                        System.out.println("Xóa thành công.");
                    } else {
                        System.out.println("Không tìm thấy số điện thoại.");
                    }
                    break;
                case 5:
                    System.out.print("Nhập số điện thoại hoặc tên để tìm kiếm: ");
                    String searchQuery = scanner.nextLine();
                    var results = manager.searchPhoneBooks(searchQuery);
                    results.forEach(System.out::println);
                    break;
                case 6:
                    manager.sortPhoneBooks();
                    System.out.println("Danh bạ sau khi sắp xếp:");
                    manager.searchPhoneBooks("").forEach(System.out::println);
                    break;
                case 7:
                    manager.readFromFile();
                    System.out.println("Đọc dữ liệu từ file thành công.");
                    break;
                case 8:
                    scanner.close();
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        }
    }
}
