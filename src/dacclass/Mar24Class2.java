package dacclass;

public class Mar24Class2 {

    public static void main(String[] args) {

        pattern7();

    }

    static void pattern7() {

        /*

         A
         B A
         C B A
         D C B A
         E D C B A
         F E D C B A

        * */

        char a = 'A';
        int row=9;
        for (int i = 0; i <=5; i++) {

            for (int j = 0; j <=(row/2) - i; j++) {
                System.out.print(a++);
            }
            for (int j = 0; j < i+2; j++) {
                System.out.print("_");
            }
            for (int j = 0; j <=(row/2) -i; j++) {
                System.out.print(--a);
            }
            System.out.println();
        }

    }
    static void pattern6() {

        /*

         A
         B A
         C B A
         D C B A
         E D C B A
         F E D C B A

        * */

        char a = 'E';
        for (int i = 0; i <5; i++) {
            a = (char) ('E' - 5 + i);
            for (int j = 0; j <= 5 - i; j++) {
                System.out.print(" " + (a--));
            }
            System.out.println();
        }

    }

    static void pattern5() {
        /*

         A
         B B
         C C C
         D D D D
         E E E E E

        * */

        char a = 'A';
        for (int i = 0; i < 5; i++) {
            //a = 'A';
            for (int j = 0; j <= i; j++) {
                System.out.print(" " + a);
            }
            System.out.println();
            a++;

        }

    }

    static void pattern4() {

        /*

         A
         A B
         A B C
         A B C D
         A B C D E

        * */

        char a = 'A';
        for (int i = 0; i < 5; i++) {
            a = 'A';
            for (int j = 0; j <= i; j++) {
                System.out.print(" " + a++);
            }
            System.out.println();
        }

    }

    static void pattern3() {
        /*

         A
         B C
         D E F
         G H I J
         K L M N O

        * */

        char a = 'A';
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" " + a++);
            }
            System.out.println();
        }

    }

    static void pattern2() {

        /*

         *
         * *
         * * *
         * * * *
         * * * * *

         * */

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }

    }

    static void pattern1() {

        /*
         *

         * * * * *
         * * * * *
         * * * * *
         * * * * *
         * * * * *

         * */

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }

    }
}
