package ss14_thuat_toan_sap_xep;

import java.util.Scanner;

public class InsertionSortVisualization {
    // Hàm sắp xếp chèn và hiển thị từng bước
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        System.out.println("Mảng ban đầu: ");
        printArray(arr);

        for (int i = 1; i < n; i++) {
            int key = arr[i]; // Lấy phần tử hiện tại
            int j = i - 1;

            // Di chuyển các phần tử lớn hơn key sang phải
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;

            // In trạng thái mảng sau mỗi bước
            System.out.println("Bước " + i + ": Chèn " + key);
            printArray(arr);
        }
    }

    // In mảng
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println("\n");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        insertionSort(arr);

        System.out.println("Mảng sau khi sắp xếp:");
        printArray(arr);

        scanner.close();
    }
}
