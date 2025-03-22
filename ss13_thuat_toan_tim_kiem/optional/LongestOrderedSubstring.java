package ss13_thuat_toan_tim_kiem.optional;
import java.util.Scanner;

public class LongestOrderedSubstring {
    public static String findLongestOrderedSubstring(String input) {
        String longestSubstring = "";
        String currentSubstring = "";

        for (int i = 0; i < input.length(); i++) {
            if (currentSubstring.isEmpty() || input.charAt(i) >= currentSubstring.charAt(currentSubstring.length() - 1)) {
                currentSubstring += input.charAt(i);
            } else {
                if (currentSubstring.length() > longestSubstring.length()) {
                    longestSubstring = currentSubstring;
                }
                currentSubstring = "" + input.charAt(i);
            }
        }

        // Kiểm tra lần cuối cùng
        if (currentSubstring.length() > longestSubstring.length()) {
            longestSubstring = currentSubstring;
        }

        return longestSubstring;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập chuỗi từ bàn phím
        System.out.print("Nhập chuỗi ký tự: ");
        String input = scanner.nextLine();

        // Tìm chuỗi con tăng dần có độ dài lớn nhất
        String result = findLongestOrderedSubstring(input);

        // Hiển thị kết quả
        System.out.println("Chuỗi con dài nhất được sắp xếp theo thứ tự: " + result);

        scanner.close();
    }
}
