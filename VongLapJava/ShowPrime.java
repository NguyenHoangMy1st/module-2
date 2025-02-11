package VongLapJava;

import java.util.Scanner;

public class ShowPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng số nguyên tố cần in: ");
        int numbers = scanner.nextInt();
        int count = 0;
        int n = 2;

        while (count < numbers) {
            if (isPrime(n)) {
                System.out.print(n + " ");
                count++;
            }
            n++;
        }
        scanner.close();
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


//public class ShowPrime {
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Nhap số luong số nguyên tố cần in: ");
//        int numbers = scanner.nextInt();
//
//        int count = 0;
//        int n = 2;
//
//        while (count < numbers) {
//            boolean isPrime = true;
//            if (n <= 1) {
//                isPrime = false;
//            } else {
//                for (int i = 2; i <= Math.sqrt(n); i++) {
//                    if (n % i == 0) {
//                        isPrime = false;
//                        break;
//                    }
//                }
//            }
//
//            if (isPrime) {
//                System.out.print(n + " ");
//                count++;
//            }
//            n++;
//        }
//        scanner.close();
//    }
//}

