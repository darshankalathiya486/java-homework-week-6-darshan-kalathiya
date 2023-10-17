package homeworkweek6;

public class Sentence {

    String sen = "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.";

    public void convert(){
        System.out.println("uppercase text = " + sen);
        System.out.println("lowercase text = " + sen.toLowerCase());

    }

    public static void main(String[] args) {
        Sentence obj = new Sentence();
        obj.convert();


    }

}
