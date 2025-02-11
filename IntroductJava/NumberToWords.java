import java.util.Scanner;

public class NumberToWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number (0 to 999): ");
        int number = scanner.nextInt();

        if (number < 0 || number > 999) {
            System.out.println("Out of ability");
        } else {
            System.out.println(convertNumberToWords(number));
        }

        scanner.close();
    }

    public static String convertNumberToWords(int number) {
        if (number == 0) {
            return "zero";
        }

        String[] ones = {
                "", "one", "two", "three", "four", "five",
                "six", "seven", "eight", "nine", "ten",
                "eleven", "twelve", "thirteen", "fourteen",
                "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"
        };

        String[] tens = {
                "", "", "twenty", "thirty", "forty", "fifty",
                "sixty", "seventy", "eighty", "ninety"
        };

        StringBuilder words = new StringBuilder();

        if (number >= 100) {
            int hundreds = number / 100;
            words.append(ones[hundreds]).append(" hundred");
            number %= 100;
            if (number != 0) {
                words.append(" and ");
            }
        }

        if (number < 20) {
            words.append(ones[number]);
        } else {
            int tensPlace = number / 10;
            int onesPlace = number % 10;

            words.append(tens[tensPlace]);
            if (onesPlace != 0) {
                words.append(" ").append(ones[onesPlace]);
            }
        }

        return words.toString();
    }
}
