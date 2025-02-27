package KeThua.QLNV;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ManagerEmploy managerEmploy = new ManagerEmploy(10);
        while (true) {
            System.out.println("-------------Quan ly nhan vien ----------------");
            System.out.println("1: Hien thi danh sach nhan vien: ");
            System.out.println("2: Them nhan vien moi: ");
            System.out.println("3: Tim kiem nhan vien theo ten: ");
            System.out.println("4: Cap nhat thong tin nhan vien: ");
            System.out.println("5: Xoa nhan vien: ");
            System.out.println("6: Tong luong cua tat ca nhan vien: ");
            System.out.println("0: Thoat:");
            System.out.println("Nhap lua chon de thuc hien chuc nang: ");
            System.out.println("------------------------------------------------");
            int choice = Integer.parseInt(scanner.nextLine());
            if (choice == 0) {
                break;
            }
            switch (choice) {
                case 1:
                    managerEmploy.displayEmployee();
                    break;
                case 2:
                    managerEmploy.addEmployee();
                    break;
                case 3:
                    // Tim kiem nhan vien theo ten
                    break;
                case 4:
                    // Cap nhat thong tin nhan vien
                    break;
                case 5:
                    // Xoa nhan vien
                    break;
                case 6:
                    // Tong luong cua tat ca nhan vien
                    break;
                default:
                    System.out.println("Lua chon khong hop le!");
            }
        }
    }
}
