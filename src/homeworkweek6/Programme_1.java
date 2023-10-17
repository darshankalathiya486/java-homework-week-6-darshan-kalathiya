package homeworkweek6;

public class Programme_1 {
    // two instance variable
    int a = 10;
    String name = "Darshan";

    // call instance variable
    public void dmethod() {
        System.out.println("a = " + a);
        System.out.println("name = " + name);

    }

    // main method
    public static void main(String[] args) {
        Programme_1 obj = new Programme_1();
        obj.dmethod();
    }
}


