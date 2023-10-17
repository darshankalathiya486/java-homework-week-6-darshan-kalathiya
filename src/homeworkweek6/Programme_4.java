package homeworkweek6;

public class Programme_4 {
    // two instance variables
    int a = 10;
    String name = "Darshan";
    // two static variables
    static int b = 10;
    static String surname = "Kalathiya";

    // instance method
    public void dmethod(){
        System.out.println("a= " + a);
        System.out.println("name= " + name);
        System.out.println("b= " + b);
        System.out.println("surname= " + surname);

    }

    // static method
    public static void nmethod(){
        Programme_4 obj = new Programme_4();
        System.out.println("b= " + b);
        System.out.println("surname= " + surname);
        System.out.println("a= " + obj.a);
        System.out.println("name= " + obj.name);

    }

    public static void main(String[] args) {
        Programme_4 exm = new Programme_4();
        exm.dmethod();
        nmethod();
    }
}
