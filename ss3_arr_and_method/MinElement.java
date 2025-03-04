package ss3_arr_and_method;

import java.util.Scanner;

public class MinElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập kích thước của mảng: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < size; i++) {
            System.out.print("Phần tử arr[" + i + "]: ");
            arr[i] = sc.nextInt();
        }

        int min = arr[0];
        int minIndex = 0;

        for (int i = 1; i < size; i++) {
            if (arr[i] < min) {
                min = arr[i];
                minIndex = i;
            }
        }

        System.out.println("Giá trị nhỏ nhất trong mảng là: " + min + " tại vị trí: " + minIndex);

        sc.close();
    }
}
