package homeworkweek6;

public class Programme_19_Sentence {

    String sen = "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.";

    public void convert(){
        System.out.println("uppercase text = " + sen);
        System.out.println("lowercase text = " + sen.toLowerCase());

    }

    public static void main(String[] args) {
        Programme_19_Sentence obj = new Programme_19_Sentence();
        obj.convert();


    }

}
