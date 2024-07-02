package dacclass.assignment.mar25SEvaLab1;

import java.util.Scanner;

public class Q3SumOf2NumScannerClass {
    //Q 3 write a program to ask two number from user and print their sum.(using scanner class)

    public static void main(String[] args) {
        int a, b;

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number : ");
        a=sc.nextInt();
        System.out.print("Enter second number : ");
        b=sc.nextInt();

        System.out.println("Sum : "+(a+b));
    }
}
