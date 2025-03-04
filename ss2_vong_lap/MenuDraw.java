package ss2_vong_lap;

import java.util.Scanner;

public class MenuDraw {
    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);

        while (choice != 0) {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle (4 types)");
            System.out.println("3. Print isosceles triangle");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    drawRectangle(input);
                    break;
                case 2:
                    drawSquareTriangle(input);
                    break;
                case 3:
                    drawIsoscelesTriangle(input);
                    break;
                case 0:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice, please try again!");
            }
        }
        input.close();
    }


    public static void drawRectangle(Scanner input) {
        System.out.print("Enter width: ");
        int width = input.nextInt();
        System.out.print("Enter height: ");
        int height = input.nextInt();

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void drawSquareTriangle(Scanner input) {
        System.out.println("Choose triangle type:");
        System.out.println("1. Bottom-left");
        System.out.println("2. Top-left");
        System.out.println("3. Bottom-right");
        System.out.println("4. Top-right");
        int type = input.nextInt();
        System.out.print("Enter height: ");
        int height = input.nextInt();

        switch (type) {
            case 1:
                for (int i = 1; i <= height; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                break;
            case 2:
                for (int i = height; i >= 1; i--) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                break;
            case 3:
                for (int i = 1; i <= height; i++) {
                    for (int j = 1; j <= height - i; j++) {
                        System.out.print("  ");
                    }
                    for (int j = 1; j <= i; j++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                break;
            case 4:
                for (int i = height; i >= 1; i--) {
                    for (int j = 1; j <= height - i; j++) {
                        System.out.print("  ");
                    }
                    for (int j = 1; j <= i; j++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                break;
            default:
                System.out.println("Invalid type!");
        }
    }

    public static void drawIsoscelesTriangle(Scanner input) {
        System.out.print("Enter height: ");
        int height = input.nextInt();

        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= height - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
