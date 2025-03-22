package ss14_thuat_toan_sap_xep;

public class InsertionSort {
    public static void insertionSort(int[] list) {
        int n = list.length;
        for (int i = 1; i < n; i++) {
            int key = list[i]; // Lấy phần tử hiện tại
            int j = i - 1;

            // Di chuyển các phần tử lớn hơn key sang phải
            while (j >= 0 && list[j] > key) {
                list[j + 1] = list[j];
                j--;
            }
            list[j + 1] = key; // Chèn key vào đúng vị trí
        }
    }

    // Hàm hiển thị mảng
    public static void printArray(int[] list) {
        for (int num : list) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] list = {7, 3, 8, 2, 5};
        System.out.println("Mảng ban đầu:");
        printArray(list);

        insertionSort(list);

        System.out.println("Mảng sau khi sắp xếp:");
        printArray(list);
    }
}
