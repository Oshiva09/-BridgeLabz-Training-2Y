import java.util.Scanner;

public class MTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a number (6 to 9): ");
        int number = sc.nextInt();

        // Check if input is valid
        if (number < 6 || number > 9) {
            System.out.println("Please enter a number between 6 and 9.");
            return;
        }

        // Define an integer array to store multiplication results
        int[] multiplicationResult = new int[10];

        // Calculate multiplication table using loop
        for (int i = 1; i <= 10; i++) {
            multiplicationResult[i - 1] = number * i;
        }

        // Display the results
        System.out.println("Multiplication Table of " + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + multiplicationResult[i - 1]);
        }
    }
}
