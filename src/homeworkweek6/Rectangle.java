package homeworkweek6;

import java.util.Scanner;

public class Rectangle {

    public static void area (double W , double H) {
        System.out.println("W = " + W);
        System.out.println("H = " + H);
        System.out.println("Area is 5.5 * 8.5 = " + (W * H));
        System.out.println("Perimeter is 2 * (5.5 + 8.5) = " + 2 * (W + H));

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Width = ");
        double W = scanner.nextDouble();
        System.out.println("Height = ");
        double H = scanner.nextDouble();
        area(W , H);
        scanner.close();
    }
}
