package homeworkweek6;

import java.util.Scanner;

public class Programme_5_Calculator {
    // instance method
    public void addition(int a, int b){
        System.out.println("a= " + a);
        System.out.println("b= " + b);
        System.out.println("a + b = " + (a + b));
    }
    public void subtraction(int a, int b){
        System.out.println("a= " + a);
        System.out.println("b= " + b);
        System.out.println("a - b = " + (a - b));
    }
    // static method
    public static void multiplication(int a, int b){
        System.out.println("a= " + a);
        System.out.println("b= " + b);
        System.out.println("a * b = " + (a * b));
    }

    public static void division(int a, int b){
        System.out.println("a=" + a);
        System.out.println("b= " + b);
        System.out.println("a / b = " + (a / b));

    }

    public static void main(String[] args) {
        Programme_5_Calculator d = new Programme_5_Calculator();
        Scanner sc = new Scanner(System.in);
        System.out.println("Print first number");
        int a = sc.nextInt();
        System.out.println("Print second number");
        int b = sc.nextInt();
        d.addition(a,b);
        d.subtraction(a,b);
        multiplication(a,b);
        division(a,b);
        sc.close();


    }




}
