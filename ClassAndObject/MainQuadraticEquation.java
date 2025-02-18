package ClassAndObject;

import java.util.Scanner;

public class MainQuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter b: ");
        double b = scanner.nextDouble();

        System.out.print("Enter c: ");
        double c = scanner.nextDouble();

        QuadraticEquation equation = new QuadraticEquation(a, b, c);

        System.out.println("The quadratic equation is: ");
        System.out.println(a + "x^2 + " + b + "x + " + c + " = 0");

        double delta = equation.getDiscriminant();
        System.out.println("Delta (Δ) = b^2 - 4ac = " + b + "^2 - 4*" + a + "*" + c);
        System.out.println("Delta = " + delta);

        if (delta > 0) {
            System.out.println("The roots are " + equation.getRoot1() + " and " + equation.getRoot2());
        } else if (delta == 0) {
            System.out.println("The root is " + equation.getRoot1());
        } else {
            System.out.println("The equation has no roots");
        }

        scanner.close();
    }
}
