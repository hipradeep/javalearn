package dacclass.assignment.mar17lab4_loop;

import java.util.Scanner;

public class Lab4Fibonacci {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number : ");
        num = sc.nextInt();

        int a = 0;
        int b = 1;

        if (num == 1) System.out.println(a);
        if (num >= 2) {
            System.out.println(a);
            System.out.println(b);
        }
        for (int i = 2; i < num; i++) {
            int t = a;
            a = b;
            b = b + t;
            System.out.println(b);
        }


    }
}
