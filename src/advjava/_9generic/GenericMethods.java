package advjava._9generic;

public class GenericMethods {
    public static void main(String[] args) {

        printGenMe(11);
        printGenMe("hipradeep");
        printGenMe(1.0);

        System.out.println(returnGenMe("hipradeep"));
        System.out.println(returnGenMe(45));
        System.out.println(returnGenMe(12.2));

    }

    static void printString(String a) {
        System.out.println(a);
    }

    static int returnInt(int a) {
        return a;
    }

    //only extra is     <T>
    static <T> void printGenMe(T value) {
        System.out.println( value);
    }
    static  <T> T returnGenMe(T value){
        return value;
    }
}
