package ss6_ke_thua.bai_tap;

public class MainMovable {
    public static void main(String[] args) {
        // Kiểm thử lớp Point
        Point p1 = new Point(3, 4);
        System.out.println("Point p1: " + p1);

        p1.setXY(5, 6);
        System.out.println("Updated p1: " + p1);

        // Kiểm thử lớp MovablePoint
        MovablePoint mp1 = new MovablePoint(2, 3, 1, 1);
        System.out.println("MovablePoint mp1: " + mp1);

        mp1.move();
        System.out.println("After move mp1: " + mp1);
    }
}
