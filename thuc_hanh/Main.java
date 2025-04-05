package thuc_hanh;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QuanLyDienThoai manager = new QuanLyDienThoai();

        boolean isExit = false;
        while (!isExit) {
            System.out.println("=====================================");
            System.out.println("Quản lý điện thoại");
            System.out.println("1. Hiển thị danh sách điện thoại");
            System.out.println("2. Thêm mới điện thoại");
            System.out.println("3. Xóa điện thoại");
            System.out.println("4. Tìm kiếm điện thoại");
            System.out.println("0. Thoát");
            System.out.println("=====================================");

            int choice;
            while (true) {
                System.out.print("Nhập lựa chọn của bạn: ");
                try {
                    choice = Integer.parseInt(scanner.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Nhập không hợp lệ, vui lòng thử lại.");
                }
            }

            switch (choice) {
                case 1:
                    manager.hienThiDanhSach();
                    break;
                case 2:
                    manager.themDienThoai();
                    break;
                case 3:
                    manager.xoaDienThoai();
                    break;
                case 4:
                    manager.timKiemDienThoai();
                    break;
                case 0:
                    System.out.println("Thoát chương trình.");
                    isExit = true;
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        }

        scanner.close();
    }
}