package ss11_stack_queue.dao_nguoc_chuoi_sdung_stack;

import java.util.Stack;

public class ReverseArrayUsingStack {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        // Khởi tạo Stack
        Stack<Integer> stack = new Stack<>();

        // Đưa các phần tử vào Stack
        for (int num : arr) {
            stack.push(num);
        }

        // Lấy phần tử từ Stack ra và gán lại cho mảng
        for (int i = 0; i < arr.length; i++) {
            arr[i] = stack.pop();
        }

        // In ra mảng đã đảo ngược
        System.out.println("Mảng sau khi đảo ngược:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

}
