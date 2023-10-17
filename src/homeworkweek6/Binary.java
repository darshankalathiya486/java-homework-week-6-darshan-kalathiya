package homeworkweek6;

import java.util.Scanner;

public class Binary {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Input a Decimal Number: ");
            int decimalNumber = scanner.nextInt();

            scanner.close();

            // Use Integer.toBinaryString to convert decimal to binary
            String binaryNumber = Integer.toBinaryString(decimalNumber);

            System.out.println("Binary Representation: " + binaryNumber);
        }
    }


