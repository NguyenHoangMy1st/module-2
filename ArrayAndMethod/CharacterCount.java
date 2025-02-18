package ArrayAndMethod;

import java.util.Scanner;


public class CharacterCount {
    public static void main(String[] args) {
        String str = "hello world, how are you?";
        System.out.println("Chuỗi của bạn là: " + str);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập kí tự cần đếm: ");
        char ch = scanner.next().charAt(0);

        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }

        System.out.println("Ký tự '" + ch + "' có " + count + " lần đếm trong chuỗi này");
    }
}
