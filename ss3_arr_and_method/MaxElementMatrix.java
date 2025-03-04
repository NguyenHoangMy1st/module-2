package ss3_arr_and_method;

import java.util.Scanner;

public class MaxElementMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Tìm phần tử lớn nhất trong ma trận mẫu.");
        double[][] matrix = {
                {1.5, 3.2, -2.0},
                {4.8, 2.2, 9.1},
                {0.0, 7.7, 5.5}
        };

        double max = matrix[0][0];
        int maxRow = 0;
        int maxCol = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                    maxRow = i;
                    maxCol = j;
                }
            }
        }

        System.out.println("Ma trận mẫu:");
        printMatrix(matrix);
        System.out.println("Phần tử lớn nhất là " + max + " tại tọa độ (" + maxRow + ", " + maxCol + ")");


        System.out.println("\nNhập ma trận và tìm phần tử lớn nhất.");

        System.out.print("Nhập số hàng của ma trận: ");
        int rows = sc.nextInt();
        System.out.print("Nhập số cột của ma trận: ");
        int cols = sc.nextInt();

        double[][] userMatrix = new double[rows][cols];

        System.out.println("Nhập các phần tử của ma trận:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Phần tử tại [" + i + "][" + j + "]: ");
                userMatrix[i][j] = sc.nextDouble();
            }
        }

        double maxUser = userMatrix[0][0];
        int maxUserRow = 0;
        int maxUserCol = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (userMatrix[i][j] > maxUser) {
                    maxUser = userMatrix[i][j];
                    maxUserRow = i;
                    maxUserCol = j;
                }
            }
        }

        System.out.println("Ma trận bạn đã nhập:");
        printMatrix(userMatrix);
        System.out.println("Phần tử lớn nhất là " + maxUser + " tại tọa độ (" + maxUserRow + ", " + maxUserCol + ")");

        sc.close();
    }

    public static void printMatrix(double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%8.2f", matrix[i][j]);
            }
            System.out.println();
        }
    }
}
