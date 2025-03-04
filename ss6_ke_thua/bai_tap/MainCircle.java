package ss6_ke_thua.bai_tap;

public class MainCircle {
    public static void main(String[] args) {
        Circle circle = new Circle(3.0, "blue");
        System.out.println(circle);

        Cylinder cylinder = new Cylinder(3.0, "green", 5.0);
        System.out.println(cylinder);
    }

}
        /*
        +----------------+
                |    Circle      |
        +----------------+
        | - radius: double |
        | - color: String  |
        +----------------+
        | + Circle()       |
        | + Circle(radius, color) |
        | + getRadius(): double  |
        | + setRadius(radius: double) |
        | + getColor(): String |
        | + setColor(color: String) |
        | + getArea(): double |
        | + toString(): String |
        +----------------+
                ▲
                │
                │ (Kế thừa)
                │
        +----------------+
        |    Cylinder    |
        +----------------+
        | - height: double |
        +----------------+
        | + Cylinder()    |
        | + Cylinder(radius, color, height) |
        | + getHeight(): double |
        | + setHeight(height: double) |
        | + getVolume(): double |
        | + toString(): String |
        +----------------+

         */
