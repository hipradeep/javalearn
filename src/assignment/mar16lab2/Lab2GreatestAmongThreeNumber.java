package assignment.mar16lab2;

import java.util.Scanner;

public class Lab2GreatestAmongThreeNumber {

    public static void main(String[] args) {
        int num1, num2, num3;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number : ");
        num1=sc.nextInt();
        System.out.println("Enter second number : ");
        num2=sc.nextInt();
        System.out.println("Enter three number : ");
        num3=sc.nextInt();

        if (num1 >=num2 && num1 >= num3){
            System.out.println("Greatest number is "+num1);
        }
        if (num2 >=num1 && num2 >= num3){
            System.out.println("Greatest number is "+num2);
        }
        if (num3 >=num2 && num3 >= num1){
            System.out.println("Greatest number is "+num3);
        }
    }

}
