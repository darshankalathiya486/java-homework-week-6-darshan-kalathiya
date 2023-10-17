package homeworkweek6;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the radius of the circle= ");
        double radius = scanner.nextDouble();
        scanner.close();

        // Calculate te area of the circle
        double area = Math.PI * radius * radius;
        System.out.println("Thr area of the circle with radius " + radius + " is " + area);


    }
}
