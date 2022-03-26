package assignment.mar25SEvaLab1;

import java.util.Scanner;

public class Q15SwapFunction {
    //Q 15 create a function that accept two integer and print swapped value .

    public static void main(String[] args) {

        swap();
    }

    private static void swap() {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        a = sc.nextInt();

        System.out.print("Enter second number : ");
        b = sc.nextInt();
        System.out.println("Input value : a = " + a + " b = " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("Swapped value : a = " + a + " b = " + b);


    }
}
