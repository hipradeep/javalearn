package assignment.mar16lab2;

import java.util.Scanner;

public class Lab2Swap {
    public static void main(String[] args) {

        int num1, num2;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number : ");
        num1=sc.nextInt();
        System.out.println("Enter second number : ");
        num2=sc.nextInt();
        System.out.println("Before swap ");
        System.out.println("First : "+ num1+ ", Second :"+num2 );

        num1=num1+num2;
        num2=num1-num2;
        num1=num1-num2;

        System.out.println("After swap ");
        System.out.println("First : "+ num1+ ", Second :"+num2 );


    }


}
