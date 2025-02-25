package ClassAndObject;

public class MainFan {
    public static void main(String[] args) {
//        Fan fan1 = new Fan();
//        fan1.setSpeed(Fan.FAST);       // Gán giá trị lớn nhất cho speed
//        fan1.setRadius(10);            // Gán radius là 10
//        fan1.setColor("yellow");       // Gán màu là yellow
//        fan1.setOn(true);              // Quạt đang bật
//
//        // Tạo đối tượng Fan 2
//        Fan fan2 = new Fan();
//        fan2.setSpeed(Fan.MEDIUM);     // Gán giá trị trung bình cho speed
//        fan2.setRadius(5);             // Gán radius là 5
//        fan2.setColor("blue");         // Gán màu là blue
//        fan2.setOn(false);             // Quạt tắt

        Fan fan1 = new Fan(Fan.FAST, true, 10, "yellow");
        Fan fan2 = new Fan(Fan.MEDIUM, false, 5, "blue");

        // In ra thông tin của các quạt
        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
    }
}