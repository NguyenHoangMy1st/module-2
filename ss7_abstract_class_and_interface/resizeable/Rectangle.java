package ss7_abstract_class_and_interface.resizeable;

public class Rectangle extends Shape implements Resizeable {
    private double width = 1.0;
    private double length = 1.0;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return width * length;
    }

    public double getPerimeter() {
        return 2 * (width + length);
    }

    @Override
    public void resize(double percent) {
        width += width * percent / 100;
        length += length * percent / 100;
    }

    @Override
    public String toString() {
        return "A Rectangle with width="
                + getWidth()
                + ", length="
                + getLength()
                + ", area="
                + getArea()
                + ", which is a subclass of "
                + super.toString();
    }
}
