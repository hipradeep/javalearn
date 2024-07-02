package dacclass.assignment.mar25SEvaLab1;

import java.util.Scanner;

public class Q4CheckSum {
    //Q 4 In the above question check if sum of two numers is greater then 100 then print "welcome" else print "sorry".

    public static void main(String[] args) {
        int a, b;

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number : ");
        a=sc.nextInt();
        System.out.print("Enter second number : ");
        b=sc.nextInt();

        System.out.println("Sum : "+(a+b));

        if ((a+b) > 100) System.out.println("Welcome");
        else System.out.println("Sorry!");
    }
}
