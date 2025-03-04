package ss3_arr_and_method;

import java.util.Arrays;
import java.util.Scanner;

public class InsertElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {4, 12, 7, 8, 1, 6, 9};
        System.out.println("Mảng hiện tại là: " + Arrays.toString(arr));

        System.out.print("Nhập số cần chèn (X): ");
        int X = sc.nextInt();

        System.out.print("Nhập vị trí index cần chèn X: ");
        int index = sc.nextInt();

        if (index < 0 || index > arr.length) {
            System.out.println("Không chèn được phần tử vào mảng vì vị trí không hợp lệ.");
        } else {
            int[] newArr = new int[arr.length + 1];

            for (int i = 0; i < index; i++) {
                newArr[i] = arr[i];
            }

            newArr[index] = X;

            for (int i = index; i < arr.length; i++) {
                newArr[i + 1] = arr[i];
            }

            System.out.println("Mảng sau khi chèn phần tử " + X + " vào vị trí " + index + " là: ");
            System.out.println(Arrays.toString(newArr));
        }

        sc.close();
    }
}
