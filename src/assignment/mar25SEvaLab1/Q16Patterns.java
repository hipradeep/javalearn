package assignment.mar25SEvaLab1;

public class Q16Patterns {

    //Q 16 Using for loop draw pattern like given below

    public static void main(String[] args) {
        pattern1();
        pattern2();
        pattern3();
        pattern4();
    }

    private static void pattern4() {
        /*
        *
             D C B A
             D C B
             D C
             D
        * 
        * */
        System.out.println("\nD\n");
        char a='D';
        for (int i = 4; i >=1; i--) {
            a='D';
            for (int j = 1; j <=i; j++) {
                System.out.print(" "+a--);
            }
            System.out.println("");
            
        }
    }
    private static void pattern3() {
        /*
        *
           1
           2 3
           4 5 6
           7 8 9 10
        *
        * */
        System.out.println("\nC\n");
        int a=1;
        for (int i = 1; i <=4; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(" "+a++);
            }
            System.out.println("");

        }
    }
    private static void pattern2() {
        /*
        *
           12345
           1234
           123
           12
           1
        *
        * */
        System.out.println("\nB\n");
        for (int i = 5; i >=1; i--) {
            for (int j = 1; j <=i; j++) {
                System.out.print(j);
            }
            System.out.println("");
        }
    }
    private static void pattern1() {
        /*
        * 1
          12
          123
          1234
          12345
        *
        * */

        System.out.println("\nA\n");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(j);
            }
            System.out.println("");
        }
    }
}
