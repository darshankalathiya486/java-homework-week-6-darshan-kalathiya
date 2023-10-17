package homeworkweek6;

import java.util.Scanner;

public class MultiplicationTable {

        public static void main(String[] args) {
            // Create a Scanner object to read user input
            Scanner scanner = new Scanner(System.in);

            // Prompt the user to enter a number
            System.out.print("Input a number: ");

            // Read the number from the user
            int number = scanner.nextInt();

            // Close the scanner to prevent resource leaks
            scanner.close();

            // Print the multiplication table up to 10
            System.out.println("Multiplication table for " + number + ":");
            for (int i = 1; i <= 10; i++) {
                int result = number * i;
                System.out.println(number + " x " + i + " = " + result);
            }
        }
    }


