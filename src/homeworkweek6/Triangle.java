package homeworkweek6;

import java.util.Scanner;

public class Triangle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Enter the base and height of triangle
        System.out.println("Enter the base of the triangle = ");
        double base = scanner.nextDouble();
        System.out.println("Enter the height of the triangle = ");
        double height = scanner.nextDouble();
        scanner.close();

        // Calculate the area of the triangle
        double area = 0.5 * base * height;
        System.out.println("The area of the triangle is = " + area);

    }
}
