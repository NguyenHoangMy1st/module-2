package ss13_thuat_toan_tim_kiem.optional;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchRecursive {
    // Hàm tìm kiếm nhị phân bằng đệ quy
    public static int binarySearch(int[] array, int left, int right, int value) {
        if (left > right) {
            return -1; // Không tìm thấy phần tử
        }

        int middle = left + (right - left) / 2; // Tránh tràn số khi cộng

        if (array[middle] == value) {
            return middle;
        } else if (array[middle] < value) {
            return binarySearch(array, middle + 1, right, value);
        } else {
            return binarySearch(array, left, middle - 1, value);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Bước 1: Nhập mảng từ bàn phím
        System.out.print("Nhập số lượng phần tử của mảng: ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // Bước 2: Sắp xếp mảng tăng dần
        Arrays.sort(array);
        System.out.println("Mảng sau khi sắp xếp: " + Arrays.toString(array));

        // Nhập giá trị cần tìm
        System.out.print("Nhập giá trị cần tìm: ");
        int value = scanner.nextInt();

        // Bước 3-8: Thực hiện tìm kiếm nhị phân
        int index = binarySearch(array, 0, n - 1, value);

        // Kết quả
        if (index != -1) {
            System.out.println("Giá trị " + value + " được tìm thấy tại vị trí: " + index);
        } else {
            System.out.println("Giá trị " + value + " không có trong mảng.");
        }

        scanner.close();
    }
}