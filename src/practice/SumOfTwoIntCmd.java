package practice;

import java.util.Scanner;

public class SumOfTwoIntCmd {
    //7.Write a JAVA program which computes sumof two objects by accepting the data from command prompt.
    public static void main(String[] args) {

        System.out.print("Enter first number : ");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.print("enter second number : ");
        int b=sc.nextInt();
        System.out.println("Sum of entered numbers : "+(a+b));

    }
}
