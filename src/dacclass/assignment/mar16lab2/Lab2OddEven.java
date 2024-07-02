package dacclass.assignment.mar16lab2;

import java.util.Scanner;

public class Lab2OddEven {
    public static void main(String[] args) {

        int num1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number : ");
        num1=sc.nextInt();

        if (num1%2==0) System.out.println("Even");
        else System.out.println("Odd");

    }
}
