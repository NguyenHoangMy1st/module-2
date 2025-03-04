package ss7_abstract_class_and_interface.colorable;

import java.util.Random;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle(3.5, "indigo", false);
        System.out.println("Trước khi resize: " + circle);

        // Tạo số ngẫu nhiên từ 1-100 để thay đổi kích thước
        Random random = new Random();
        double percent = 1 + random.nextInt(100); // Giá trị ngẫu nhiên từ 1 đến 100

        // Thay đổi kích thước
        circle.resize(percent);
        System.out.println("Sau khi resize (" + percent + "%): " + circle);
    }
}
