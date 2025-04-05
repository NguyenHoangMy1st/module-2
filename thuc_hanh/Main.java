package thuc_hanh;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QuanLyDienThoai manager = new QuanLyDienThoai();

        while (true) {
            System.out.println("\n===============================");
            System.out.println("1. Thêm mới điện thoại");
            System.out.println("2. Xóa điện thoại");
            System.out.println("3. Xem danh sách điện thoại");
            System.out.println("4. Tìm kiếm điện thoại");
            System.out.println("5. Thoát");
            System.out.print("Chọn chức năng: ");
            int chucNang = Integer.parseInt(scanner.nextLine());

            if (chucNang == 1) {
                manager.themDienThoai();
            } else if (chucNang == 2) {
                manager.xoaDienThoai();
            } else if (chucNang == 3) {
                manager.hienThiDanhSach();
            } else if (chucNang == 4) {
                manager.timKiemDienThoai();
            } else if (chucNang == 5) {
                System.out.println("Thoát chương trình.");
                break;
            } else {
                System.out.println("Lựa chọn không hợp lệ, vui lòng thử lại.");
            }
        }

        scanner.close();
    }
}