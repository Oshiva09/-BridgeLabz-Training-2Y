import java.util.Scanner;

public class NumberChecker5 {

    // ✅ Method 1: Check if a number is a Perfect number
    // A number equal to the sum of its proper divisors
    public static boolean isPerfect(int number) {
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0)
                sum += i;
        }
        return sum == number;
    }

    // ✅ Method 2: Check if a number is an Abundant number
    // Sum of proper divisors > number
    public static boolean isAbundant(int number) {
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0)
                sum += i;
        }
        return sum > number;
    }

    // ✅ Method 3: Check if a number is a Deficient number
    // Sum of proper divisors < number
    public static boolean isDeficient(int number) {
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0)
                sum += i;
        }
        return sum < number;
    }

    // ✅ Method 4: Check if a number is a Strong number
    // A number is strong if sum of factorials of its digits = number itself
    public static boolean isStrong(int number) {
        int temp = number;
        int sum = 0;

        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }
        return sum == number;
    }

    // Helper method to calculate factorial
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++)
            fact *= i;
        return fact;
    }

    // ✅ MAIN METHOD
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        System.out.println("\nResults for number: " + number);
        System.out.println("Perfect Number?    " + isPerfect(number));
        System.out.println("Abundant Number?   " + isAbundant(number));
        System.out.println("Deficient Number?  " + isDeficient(number));
        System.out.println("Strong Number?     " + isStrong(number));
    }
}
