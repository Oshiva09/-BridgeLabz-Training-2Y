import java.util.Scanner;

public class StoreNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Array of 10 elements
        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;

        // Infinite loop to take input
        while (true) {
            System.out.print("Enter a number (0 or negative to stop): ");
            double input = sc.nextDouble();

            // Stop if user enters 0 or negative
            if (input <= 0) {
                break;
            }

            // Stop if array is full
            if (index == 10) {
                System.out.println("Array is full (max 10 numbers).");
                break;
            }

            // Store the number and increment index
            numbers[index] = input;
            index++;
        }

        // Calculate sum of stored numbers
        for (int i = 0; i < index; i++) {
            total += numbers[i];
        }

        // Display stored numbers
        System.out.println("\nStored numbers:");
        for (int i = 0; i < index; i++) {
            System.out.print(numbers[i] + " ");
        }

        // Display total
        System.out.println("\nSum of numbers = " + total);

        sc.close();
    }
}
