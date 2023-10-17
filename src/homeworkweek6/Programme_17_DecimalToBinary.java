package homeworkweek6;

import java.util.Scanner;

public class Programme_17_DecimalToBinary {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Input a Decimal Number: ");
            int decimalNumber = scanner.nextInt();

            scanner.close();

            // Convert decimal to binary using custom method
            String binaryNumber = decimalToBinary(decimalNumber);

            System.out.println("Binary Representation: " + binaryNumber);
        }

        public static String decimalToBinary(int decimalNumber) {
            if (decimalNumber == 0) {
                return "0";  // Special case for decimal 0
            }

            StringBuilder binary = new StringBuilder();
            while (decimalNumber > 0) {
                int remainder = decimalNumber % 2;
                binary.insert(0, remainder);
                decimalNumber /= 2;
            }

            return binary.toString();
        }
    }


