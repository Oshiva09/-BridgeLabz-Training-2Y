import java.util.Scanner;

public class NumberChecker6 {

    // ✅ Method 1: Find factors of a number and return them as an array
    public static int[] getFactors(int number) {
        int count = 0;

        // First loop → count number of factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0)
                count++;
        }

        int[] factors = new int[count];
        int index = 0;

        // Second loop → store factors in the array
        for (int i = 1; i <= number; i++) {
            if (number % i == 0)
                factors[index++] = i;
        }

        return factors;
    }

    // ✅ Method 2: Find the greatest factor (excluding the number itself or including? -> including)
    public static int getGreatestFactor(int[] factors) {
        int max = factors[0];
        for (int i = 1; i < factors.length; i++) {
            if (factors[i] > max)
                max = factors[i];
        }
        return max;
    }

    // ✅ Method 3: Find the sum of factors
    public static int getSumOfFactors(int[] factors) {
        int sum = 0;
        for (int f : factors)
            sum += f;
        return sum;
    }

    // ✅ Method 4: Find the product of factors
    public static long getProductOfFactors(int[] factors) {
        long product = 1;
        for (int f : factors)
            product *= f;
        return product;
    }

    // ✅ Method 5: Find the product of the cube of factors
    public static double getProductOfCubeOfFactors(int[] factors) {
        double product = 1;
        for (int f : factors)
            product *= Math.pow(f, 3);
        return product;
    }

    // ✅ MAIN METHOD
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int[] factors = getFactors(number);

        System.out.print("\nFactors of " + number + ": ");
        for (int f : factors)
            System.out.print(f + " ");

        System.out.println("\n\nGreatest Factor: " + getGreatestFactor(factors));
        System.out.println("Sum of Factors: " + getSumOfFactors(factors));
        System.out.println("Product of Factors: " + getProductOfFactors(factors));
        System.out.println("Product of Cube of Factors: " + getProductOfCubeOfFactors(factors));
    }
}
