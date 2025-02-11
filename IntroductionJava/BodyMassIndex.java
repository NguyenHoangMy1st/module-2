package IntroductionJava;

import java.util.Scanner;

public class BodyMassIndex {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char continueLoop = 'y';

        while (continueLoop == 'y' || continueLoop == 'Y') {
            double weight, height, bmi;

            System.out.print("Your weight (in kilogram): ");
            weight = scanner.nextDouble();

            System.out.print("Your height (in meter): ");
            height = scanner.nextDouble();

            bmi = weight / Math.pow(height, 2);

            System.out.printf("%-20s%s", "bmi", "Interpretation\n");

            if (bmi < 18)
                System.out.printf("%-20.2f%s", bmi, "Underweight");
            else if (bmi < 25.0)
                System.out.printf("%-20.2f%s", bmi, "Normal");
            else if (bmi < 30.0)
                System.out.printf("%-20.2f%s", bmi, "Overweight");
            else
                System.out.printf("%-20.2f%s", bmi, "Obese");

            System.out.println();

            System.out.print("Do you want to calculate another BMI? (y/n): ");
            continueLoop = scanner.next().charAt(0);
        }

        System.out.println("Program finished.");
        scanner.close();
    }
}