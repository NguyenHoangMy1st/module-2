package ss3_arr_and_method;

import java.util.Scanner;

public class RemoveElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số phần tử của mảng: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("Nhập phần tử cần xoá: ");
        int x = scanner.nextInt();

        System.out.println("Chọn cách xoá phần tử:");
        System.out.println("1. Xoá phần tử đầu tiên");
        System.out.println("2. Xoá tất cả các phần tử");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                boolean foundFirst = false;
                for (int i = 0; i < n; i++) {
                    if (arr[i] == x) {
                        for (int j = i; j < n - 1; j++) {
                            arr[j] = arr[j + 1];
                        }
                        n--;
                        foundFirst = true;
                        break;
                    }
                }
                if (foundFirst) {
                    System.out.println("Mảng sau khi xoá phần tử đầu tiên " + x + ":");
                    for (int i = 0; i < n; i++) {
                        System.out.print(arr[i] + " ");
                    }
                    System.out.println();
                } else {
                    System.out.println("Phần tử " + x + " không có trong mảng.");
                }
                break;

            case 2:
                int i = 0;
                while (i < n) {
                    if (arr[i] == x) {
                        for (int j = i; j < n - 1; j++) {
                            arr[j] = arr[j + 1];
                        }
                        n--;
                    } else {
                        i++;
                    }
                }

                if (n == 0) {
                    System.out.println("Mảng đã trở thành rỗng sau khi xoá.");
                } else {
                    System.out.println("Mảng sau khi xoá tất cả các phần tử " + x + ":");
                    for (int j = 0; j < n; j++) {
                        System.out.print(arr[j] + " ");
                    }
                    System.out.println();
                }
                break;

            default:
                System.out.println("Lựa chọn không hợp lệ.");
                break;
        }

        scanner.close();
    }
}
