package homeworkweek6;

public class AllMethod {
    static int a = 125;
    static int b = 24;
    // instance method
    public void addition(){
        System.out.println("a= " + a);
        System.out.println("b= " + b);
        System.out.println("a + b = " + (a + b));
    }
    public void subtraction(){
        System.out.println("a= " + a);
        System.out.println("b= " + b);
        System.out.println("a - b = " + (a - b));
    }
    // static method
    public static void multiplication(){
        System.out.println("a= " + a);
        System.out.println("b= " + b);
        System.out.println("a * b = " + (a * b));
    }

    public static void division(){
        System.out.println("a=" + a);
        System.out.println("b= " + b);
        System.out.println("a / b = " + (a / b));

    }

    public static void main(String[] args) {
        AllMethod d = new AllMethod();
        d.addition();
        d.subtraction();
        multiplication();
        division();

    }
}
