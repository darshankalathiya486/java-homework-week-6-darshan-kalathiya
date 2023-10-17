package homeworkweek6;

import java.util.Scanner;

public class Programme_7_Temperature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter temperature in Fahrenheit = ");
        double fahrenheit = scanner.nextDouble();
        scanner.close();
        double celsius = (fahrenheit - 32) * 5/9;
        System.out.println(fahrenheit + "F is equal to " + celsius + "C");


    }
}
