package homeworkweek6;

import java.util.Scanner;

public class Programme_16_Binary {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Input first binary number: ");
            String binary1 = scanner.next();

            System.out.print("Input second binary number: ");
            String binary2 = scanner.next();

            scanner.close();

            // Convert binary strings to integers
            int number1 = Integer.parseInt(binary1, 2);
            int number2 = Integer.parseInt(binary2, 2);

            // Add the binary numbers
            int sum = number1 + number2;

            // Convert the sum back to binary
            String binarySum = Integer.toBinaryString(sum);

            System.out.println("Sum of binary numbers: " + binarySum);
        }
    }




