package ss6_ke_thua.quan_ly_nhan_vien;


import java.util.Scanner;

public class ManagerEmploy {
    private final Employee[] listEmploy;
    private int count = 0;
    private final Scanner scanner;
    public ManagerEmploy(int size) {
        listEmploy = new Employee[size];
        scanner = new Scanner(System.in);
    }

    public void addEmployee() {
        if (this.count == listEmploy.length) {
            System.out.println("Khong the them moi nhan vien vao danh sach");
        } else {
            System.out.println("Nhap ten nhan vien: ");
            String name = scanner.nextLine();
            System.out.println("Nhap ID nhan vien: ");
            String id = scanner.nextLine();
            System.out.println("Nhap luong nhan vien: ");
            double salary = Double.parseDouble(scanner.nextLine());
            System.out.println("Chon loai nhan vien them moi: 1 - Developer , 2 - Manager");
            int choice = Integer.parseInt(scanner.nextLine());
            if (choice == 1) {
                System.out.println("Nhap ngon ngu lap trinh cua nhan vien: ");
                String programmingLanguage = scanner.nextLine();
                Employee employee = new Developer(name, id, salary, programmingLanguage);
                listEmploy[count] = employee;
            }else {
                System.out.println("Nhap so tien bonus: ");
                double bonus = Double.parseDouble(scanner.nextLine());
                Employee employee = new Manager(name, id, salary, bonus);
                listEmploy[count] = employee;
            }
            count++;
        }
    }

    public void displayEmployee() {
        if (count == 0) {
            System.out.println("Khong co nhan vien nao");
        } else {
            System.out.println("--------Danh sach nhan vien---------");
            for (Employee employee : listEmploy) {
                if (employee == null) {
                    break;
                }
                System.out.println(employee);
            }
        }

    }
}