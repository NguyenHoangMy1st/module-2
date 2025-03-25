package ss16_io_text_file;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {

    public List<Integer> readFile(String filePath) {
        List<Integer> numbers = new ArrayList<>();
        File file = new File(filePath);

        // Kiểm tra file có tồn tại không
        if (!file.exists()) {
            System.err.println("Lỗi: File không tồn tại! Đường dẫn: " + file.getAbsolutePath());
            return numbers;
        }

        // Đọc file
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                try {
                    numbers.add(Integer.parseInt(line.trim())); // Xóa khoảng trắng trước khi chuyển số
                } catch (NumberFormatException e) {
                    System.err.println("Lỗi: Dòng '" + line + "' không phải số hợp lệ.");
                }
            }
        } catch (IOException e) {
            System.err.println("Lỗi khi đọc file: " + e.getMessage());
        }

        return numbers;
    }


    public void writeFile(String filePath, int max){
        try {
            FileWriter writer = new FileWriter(filePath, true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.write("Giá trị lớn nhất là: " + max);
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}