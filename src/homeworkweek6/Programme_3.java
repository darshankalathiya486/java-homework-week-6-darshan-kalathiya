package homeworkweek6;

public class Programme_3 {
    // instance variable
    int a = 10;
    // static variable
    static String name = "Darshan";

    // instance method
    public void dmethod(){
        System.out.println("a = " + a);
        System.out.println("name = " + name);
    }
    // static method
    public static void nmethod(){
        Programme_3 obj = new Programme_3();
        System.out.println("a = " + obj.a);
        System.out.println("name = " + name);
    }
    // main method
    public static void main(String[] args) {
        Programme_3 d = new Programme_3();
        d.dmethod();
        nmethod();
    }
}
