package VongLapJava;

import java.util.Scanner;

public class ShowPrimeLess100 {
    public static void main(String[] args) {
        int n = 2;

        while (n < 100) {
            if (isPrime(n)) {
                System.out.print(n + " ");
            }
            n++;
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}


