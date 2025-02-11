package IntroductionJava;

import java.util.Scanner;

public class NumberToWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = getNumberFromInput(scanner);

        if (number < 0 || number > 999) {
            System.out.println("out of ability");
        } else {
            System.out.println(readNumber(number));
        }
        scanner.close();
    }

    private static int getNumberFromInput(Scanner scanner) {
        while (true) {
            System.out.print("Enter a number to read (0-999): ");
            if (scanner.hasNextInt()) {
                return scanner.nextInt();
            } else {
                System.out.println("Please enter a valid integer.");
                scanner.next();
            }
        }
    }

    private static String readNumber(int number) {
        if (number < 10) {
            return readOneDigitNumber(number);
        } else if (number < 20) {
            return readTwoDigitNumberLessThan20(number);
        } else if (number < 100) {
            return readTwoDigitNumberGreaterThanOrEqualTo20(number);
        } else {
            return readThreeDigitNumber(number);
        }
    }

    private static String readOneDigitNumber(int number) {
        switch (number) {
            case 0: return "zero";
            case 1: return "one";
            case 2: return "two";
            case 3: return "three";
            case 4: return "four";
            case 5: return "five";
            case 6: return "six";
            case 7: return "seven";
            case 8: return "eight";
            case 9: return "nine";
            default: return "out of ability";
        }
    }

    private static String readTwoDigitNumberLessThan20(int number) {
        switch (number) {
            case 10: return "ten";
            case 11: return "eleven";
            case 12: return "twelve";
            case 13: return "thirteen";
            case 14: return "fourteen";
            case 15: return "fifteen";
            case 16: return "sixteen";
            case 17: return "seventeen";
            case 18: return "eighteen";
            case 19: return "nineteen";
            default: return "out of ability";
        }
    }

    private static String readTwoDigitNumberGreaterThanOrEqualTo20(int number) {
        int tens = number / 10;
        int ones = number % 10;
        return readTens(tens) + " " + readOneDigitNumber(ones);
    }

    private static String readTens(int tens) {
        switch (tens) {
            case 2: return "twenty";
            case 3: return "thirty";
            case 4: return "forty";
            case 5: return "fifty";
            case 6: return "sixty";
            case 7: return "seventy";
            case 8: return "eighty";
            case 9: return "ninety";
            default: return "";
        }
    }

    private static String readThreeDigitNumber(int number) {
        int hundreds = number / 100;
        int remainder = number % 100;
        if (remainder == 0) {
            return readOneDigitNumber(hundreds) + " hundred";
        } else {
            return readOneDigitNumber(hundreds) + " hundred and " + readNumber(remainder);
        }
    }
}