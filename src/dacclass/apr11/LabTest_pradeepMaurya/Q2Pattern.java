package dacclass.apr11.LabTest_pradeepMaurya;

public class Q2Pattern {

    //Q 2 write a program to print pattern like given below
    //a)    123456
    //      12345
    //      1234
    //      123
    //      12
    //      1

    //b)    ACEG
    //      ACE
    //      AC
    //      A


    public static void main(String[] args) {
        pattern_a();
        pattern_b();
    }

    private static void pattern_b() {
        System.out.println("pattern (b)");
        char a='A';
        for (int i = 1; i <= 4; i++) {
            a='A';
            for (int j = 1; j <= 4-i+1; j++) {
                System.out.print(a);
                a= (char) (a+2);
            }
            System.out.println();
        }
    }

    private static void pattern_a() {
        System.out.println("pattern (a)");
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 6-i+1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
