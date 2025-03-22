package ss15_ngoai_le_va_debug.illegal_triangle_exception;

import java.util.Scanner;

public class TriangleChecker {
    // Hàm kiểm tra tam giác
    public static void checkTriangle(double a, double b, double c) throws IllegalTriangleException {
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new IllegalTriangleException("Cạnh tam giác không thể nhỏ hơn hoặc bằng 0.");
        }
        if (a + b <= c || a + c <= b || b + c <= a) {
            throw new IllegalTriangleException("Tổng hai cạnh phải lớn hơn cạnh còn lại.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Nhập cạnh a: ");
            double a = scanner.nextDouble();
            System.out.print("Nhập cạnh b: ");
            double b = scanner.nextDouble();
            System.out.print("Nhập cạnh c: ");
            double c = scanner.nextDouble();

            checkTriangle(a, b, c);
            System.out.println("Ba cạnh hợp lệ tạo thành một tam giác.");

        } catch (IllegalTriangleException e) {
            System.out.println("Lỗi: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Lỗi nhập liệu. Vui lòng nhập số hợp lệ.");
        } finally {
            scanner.close();
        }
    }
}
