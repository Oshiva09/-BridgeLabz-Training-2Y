import java.util.Scanner;

public class NumberChecker {

    // ✅ Method 1: Find the count of digits in the number
    public static int countDigits(int number) {
        return String.valueOf(Math.abs(number)).length();
    }

    // ✅ Method 2: Store digits of the number in an array
    public static int[] getDigitsArray(int number) {
        String numStr = String.valueOf(Math.abs(number));
        int[] digits = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = Character.getNumericValue(numStr.charAt(i));
        }
        return digits;
    }

    // ✅ Method 3: Find the sum of digits
    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int d : digits) {
            sum += d;
        }
        return sum;
    }

    // ✅ Method 4: Find the sum of squares of digits using Math.pow()
    public static int sumOfSquares(int[] digits) {
        int sum = 0;
        for (int d : digits) {
            sum += Math.pow(d, 2);
        }
        return sum;
    }

    // ✅ Method 5: Check if the number is a Harshad number
    // (A Harshad number is divisible by the sum of its digits)
    public static boolean isHarshad(int number, int[] digits) {
        int sum = sumOfDigits(digits);
        return sum != 0 && number % sum == 0;
    }

    // ✅ Method 6: Find frequency of each digit using a 2D array
    public static int[][] findDigitFrequency(int[] digits) {
        int[][] freq = new int[10][2]; // [digit][frequency]
        for (int i = 0; i < 10; i++) {
            freq[i][0] = i; // store digit
            freq[i][1] = 0; // initialize frequency
        }
        for (int d : digits) {
            freq[d][1]++;
        }
        return freq;
    }

    // ✅ MAIN METHOD
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int count = countDigits(number);
        int[] digits = getDigitsArray(number);

        System.out.println("\nNumber of digits: " + count);
        System.out.print("Digits: ");
        for (int d : digits) System.out.print(d + " ");
        System.out.println();

        System.out.println("Sum of digits: " + sumOfDigits(digits));
        System.out.println("Sum of squares of digits: " + sumOfSquares(digits));
        System.out.println("Is Harshad number? " + isHarshad(number, digits));

        System.out.println("\nDigit Frequencies:");
        int[][] freq = findDigitFrequency(digits);
        for (int i = 0; i < freq.length; i++) {
            if (freq[i][1] > 0)
                System.out.println("Digit " + freq[i][0] + " → " + freq[i][1] + " times");
        }
    }
}
