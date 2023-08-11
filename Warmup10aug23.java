import java.util.Scanner;

public class Warmup10aug23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter three integers
        System.out.println("Enter the first integer:");
        int num1 = scanner.nextInt();

        System.out.println("Enter the second integer:");
        int num2 = scanner.nextInt();

        System.out.println("Enter the third integer:");
        int num3 = scanner.nextInt();

        // Find the largest number using nested if statements
        int LargestNumber = num1; // Assume the first number is the largest

        if (num2 > LargestNumber) {
            LargestNumber = num2;
        }

        if (num3 > LargestNumber) {
            LargestNumber = num3;
        }

        //Output the largest number
        System.out.println("The Largest number is: " + LargestNumber);

        //Close the scanner to release resources
        scanner.close();
    }
}
