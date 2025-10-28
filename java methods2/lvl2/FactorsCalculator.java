import java.util.Scanner;

public class FactorsCalculator {

    public static int[] findFactors(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) if (n % i == 0) count++;

        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= n; i++)
            if (n % i == 0) factors[index++] = i;

        return factors;
    }

    public static int findSum(int[] arr) {
        int sum = 0;
        for (int num : arr) sum += num;
        return sum;
    }

    public static long findProduct(int[] arr) {
        long product = 1;
        for (int num : arr) product *= num;
        return product;
    }

    public static double findSumOfSquares(int[] arr) {
        double sum = 0;
        for (int num : arr) sum += Math.pow(num, 2);
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int[] factors = findFactors(n);

        System.out.print("Factors: ");
        for (int f : factors) System.out.print(f + " ");

        System.out.println("\nSum of factors: " + findSum(factors));
        System.out.println("Sum of squares: " + findSumOfSquares(factors));
        System.out.println("Product of factors: " + findProduct(factors));
    }
}
