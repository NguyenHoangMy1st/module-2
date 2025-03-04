package ss4_class_and_object;

public class QuadraticEquation {
    // Các trường dữ liệu
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    // Delta
    public double getDiscriminant() {
        return Math.pow(b, 2) - 4 * a * c;
    }

    // Phương thức tính nghiệm thứ nhất
    public double getRoot1() {
        double delta = getDiscriminant();
        if (delta >= 0) {
            return (-b + Math.sqrt(delta)) / (2 * a);
        } else {
            return 0; // Không có nghiệm thực
        }
    }

    // Phương thức tính nghiệm thứ hai
    public double getRoot2() {
        double delta = getDiscriminant();
        if (delta >= 0) {
            return (-b - Math.sqrt(delta)) / (2 * a);
        } else {
            return 0; // Không có nghiệm thực
        }
    }
}

