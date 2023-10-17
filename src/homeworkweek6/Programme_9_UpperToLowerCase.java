package homeworkweek6;

import java.util.Scanner;

public class Programme_9_UpperToLowerCase {

    public static void convert(String text){
        System.out.println("uppercase text = " + text);
        System.out.println("lowercase text = " + text.toLowerCase());

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Print uppercase text = ");
        String text = scanner.next();
        convert(text);
        scanner.close();


    }

}
