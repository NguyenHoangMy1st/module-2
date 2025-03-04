package ss0_student_management.Controller;
import ss0_student_management.Model.StudentManager;

import java.util.Scanner;

public class Controller {
    public static void main(String[] args) {
        displayMenu();
    }

    public static void displayMenu(){
        StudentManager studentManager = new StudentManager();
        boolean isExit = true;
        while(isExit){
            System.out.println("Chuong trinh quan ly sinh vien");
            System.out.println("1. Them sinh vien" +
                "\n2. Hien thi sinh vien" +
                "\n3. Sua sinh vien" +
                "\n4. Thoat");
            Scanner scanner = new Scanner(System.in);

            int choice = Integer.parseInt(scanner.nextLine());
                switch(choice){
                    case 1:
                        System.out.println("1. Them sinh vien");
                        break;
                    case 2:
                        System.out.println("2. Hien thi sinh vien");
                        studentManager.display();
                        break;
                    case 3:
                        System.out.println("3. Sua sinh vien");
                        break;
                    default:
                        isExit = false;
            }
        }
    }
}
