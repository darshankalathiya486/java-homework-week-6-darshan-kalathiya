package homeworkweek6;

public class Programme_2 {
    // static variable
    static int a = 10;
    static String name = "Darshan";

    // call static variable
    public static void dmethod() {
        System.out.println("a = " + a);
        System.out.println("name = " + name);
    }

    // call static method
    public static void main(String[] args) {
        dmethod();
    }
}
