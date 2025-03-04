package ss1_introduction_java;

import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        final double EXCHANGE_RATE = 25540.0;

        Scanner scanner = new Scanner(System.in);
        char continueLoop = 'y';

        while (continueLoop == 'y' || continueLoop == 'Y') {
            System.out.print("Enter amount in USD: ");
            double usd = scanner.nextDouble();

            double vnd = usd * EXCHANGE_RATE;

            System.out.printf("Equivalent amount in VND: %.2f VND%n", vnd);

            System.out.print("Do you want to convert another amount? (y/n): ");
            continueLoop = scanner.next().charAt(0);
        }

        System.out.println("Program finished.");
        scanner.close();
    }
}