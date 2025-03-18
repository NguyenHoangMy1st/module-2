package ss11_stack_queue.tree_map;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class WordFrequencyCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập văn bản:");
        String text = scanner.nextLine();

        // Gọi hàm xử lý
        countWordFrequency(text);

        scanner.close();
    }

    public static void countWordFrequency(String text) {
        // Sử dụng TreeMap để tự động sắp xếp theo bảng chữ cái
        TreeMap<String, Integer> wordCountMap = new TreeMap<>();

        // Chuyển tất cả thành chữ thường, loại bỏ dấu câu và tách từ
        String[] words = text.toLowerCase().replaceAll("[^a-zA-Z0-9 ]", "").split("\\s+");

        // Duyệt từng từ trong mảng
        for (String word : words) {
            if (!word.isEmpty()) {
                // Nếu từ đã tồn tại trong map, tăng số lần xuất hiện
                wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
            }
        }

        // Hiển thị kết quả
        System.out.println("\nTần suất xuất hiện của từng từ:");
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}