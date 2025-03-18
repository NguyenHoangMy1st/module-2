package ss11_stack_queue.dao_nguoc_chuoi_sdung_stack;

import java.util.Stack;

public class ReverseStringUsingStack {
    public static void main(String[] args) {
        String input = "Hello World this is Java";
        System.out.println("Chuỗi ban đầu: " + input);

        // Gọi hàm đảo ngược chuỗi
        String reversed = reverseWords(input);
        System.out.println("Chuỗi sau khi đảo ngược từ: " + reversed);
    }

    public static String reverseWords(String str) {
        Stack<String> wStack = new Stack<>();
        String[] words = str.split(" "); // Tách chuỗi thành các từ

        // Đưa từng từ vào Stack
        for (String word : words) {
            wStack.push(word);
        }

        // Lấy từ ra khỏi Stack để tạo chuỗi đảo ngược
        StringBuilder output = new StringBuilder();
        while (!wStack.isEmpty()) {
            output.append(wStack.pop()).append(" ");
        }

        return output.toString().trim(); // Xóa khoảng trắng cuối cùng
    }
}
