package ArrayAndMethod;

import java.util.Scanner;
import java.util.Arrays;

public class SumOfColumn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // PHẦN 1: Sử dụng ma trận khởi tạo nhanh (ví dụ)
        System.out.println("PHẦN 1: Tính tổng cột với ma trận khởi tạo sẵn.");
        double[][] matrix = {
                {1.1, 1.3, 3.4},
                {4.5, 2.8, 6.7},
                {7.8, 9.3, 11}
        };

        System.out.println("Ma trận mẫu:");
        printMatrix(matrix);

        System.out.print("Nhập thứ tự của cột cần tính tổng (tính từ 0): ");
        int colIndex = sc.nextInt();

        if (colIndex < 0 || colIndex >= matrix[0].length) {
            System.out.println("Số cột không hợp lệ!");
        } else {
            double sum = 0;
            for (int i = 0; i < matrix.length; i++) {
                sum += matrix[i][colIndex];
            }
            System.out.println("Tổng các phần tử của cột " + colIndex + " là: " + sum);
        }

        // PHẦN 2: Nhập ma trận từ bàn phím và tính tổng cột

        System.out.println("\nPHẦN 2: Nhập ma trận từ bàn phím.");

        System.out.print("Nhập số hàng của ma trận: ");
        int rows = sc.nextInt();
        System.out.print("Nhập số cột của ma trận: ");
        int cols = sc.nextInt();

        double[][] userMatrix = new double[rows][cols];
        System.out.println("Nhập các phần tử cho ma trận:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Phần tử tại [" + i + "][" + j + "]: ");
                userMatrix[i][j] = sc.nextDouble();
            }
        }

        System.out.println("Ma trận bạn đã nhập:");
        printMatrix(userMatrix);

        System.out.print("Nhập thứ tự của cột cần tính tổng (tính từ 0): ");
        int userColIndex = sc.nextInt();
        if (userColIndex < 0 || userColIndex >= cols) {
            System.out.println("Số cột không hợp lệ!");
        } else {
            double userSum = 0;
            for (int i = 0; i < rows; i++) {
                userSum += userMatrix[i][userColIndex];
            }
            System.out.println("Tổng các phần tử của cột " + userColIndex + " là: " + userSum);
        }

        sc.close();
    }

    public static void printMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
}
