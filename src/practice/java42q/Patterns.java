package practice.java42q;

public class Patterns {
    //2. Write a Java Program for Star Patterns
    //a.Square Star Pattern
    //  ****
    //  ****
    //  ****
    //  ****
    //b.Triangle Star Pattern
    //  *
    //  **
    //  ***
    //  ****
    //c.Inverted Pyramid
    //  *******
    //  *****
    //  ***
    //  *

    public static void main(String[] args) {
        a_pattern();
        b_pattern();
        c_pattern();
    }

    private static void c_pattern() {
        System.out.println("Pattern C");
        for (int i = 0; i < 9; i=i+2) {
            for (int j = 0; j < i; j=j+2) {
                System.out.print("  ");
            }
            for (int j = 0; j < 9-(i+2); j++) {
                System.out.print(" *");
            }
            System.out.println();
        }

    }

    private static void b_pattern() {
        System.out.println("Pattern B");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }


}
