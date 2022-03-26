package assignment.mar25SEvaLab1;

import java.util.Scanner;

public class Q9FibonacciSeries {
    //Q 9 wap to print  fibonacci series of given number

    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        num = sc.nextInt();
        int a = 0, b = 1;

        if (num >= 1)
            System.out.print(a + ", ");

        if (num >= 2)
            System.out.print(b + ", ");

        for (int i = 2; i < num; i++) {
            int t = a;
            a = b;
            b = t + b;
            System.out.print(b + ", ");

        }

    }

}
