import java.util.Scanner;

public class NumberChecker4 {

    // ✅ Method 1: Check if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }

    // ✅ Method 2: Check if a number is a Neon number
    // A Neon number is one where sum of digits of its square == number
    public static boolean isNeon(int number) {
        int square = number * number;
        int sum = 0;
        while (square > 0) {
            sum += square % 10;
            square /= 10;
        }
        return sum == number;
    }

    // ✅ Method 3: Check if a number is a Spy number
    // A Spy number has sum of digits == product of digits
    public static boolean isSpy(int number) {
        int sum = 0, product = 1;
        int temp = number;
        while (temp > 0) {
            int digit = temp % 10;
            sum += digit;
            product *= digit;
            temp /= 10;
        }
        return sum == product;
    }

    // ✅ Method 4: Check if a number is an Automorphic number
    // A number whose square ends with the number itself
    public static boolean isAutomorphic(int number) {
        int square = number * number;
        String numStr = String.valueOf(number);
        String squareStr = String.valueOf(square);
        return squareStr.endsWith(numStr);
    }

    // ✅ Method 5: Check if a number is a Buzz number
    // A Buzz number is divisible by 7 or ends with 7
    public static boolean isBuzz(int number) {
        return (number % 7 == 0) || (number % 10 == 7);
    }

    // ✅ MAIN METHOD
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        System.out.println("\nResults for number: " + number);
        System.out.println("Prime Number?        " + isPrime(number));
        System.out.println("Neon Number?         " + isNeon(number));
        System.out.println("Spy Number?          " + isSpy(number));
        System.out.println("Automorphic Number?  " + isAutomorphic(number));
        System.out.println("Buzz Number?         " + isBuzz(number));
    }
}
