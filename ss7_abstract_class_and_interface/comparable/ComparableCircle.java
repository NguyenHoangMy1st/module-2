package ss7_abstract_class_and_interface.comparable;


//lớp ComparableCircle kế thừa lớp Circle và triển khai interface Comparable<ComparableCircle>
public class ComparableCircle extends Circle
        implements Comparable<ComparableCircle> {

    public ComparableCircle() {
    }

    public ComparableCircle(double radius) {
        super(radius);
    }

    public ComparableCircle(double radius, String color, boolean filled) {
        super(radius, color, filled);
    }


    //Phương thức compareTo() được viết lại để so sánh bán kính (radius) giữa hai ComparableCircle
    @Override
    public int compareTo(ComparableCircle o) {
        if (getRadius() > o.getRadius()) return 1;
        else if (getRadius() < o.getRadius()) return -1;
        else return 0;
    }
}