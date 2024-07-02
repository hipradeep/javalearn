package dacclass.assignment.mar17lab4_loop;

import java.util.Scanner;

public class Lab4Factorial {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number : ");
        num = sc.nextInt();
        if (num<0){
            System.out.println("Enter positive number");
            return;
        }
        long p=1;
        if (num==0) System.out.println(p);
        for (int i=1; i<=num; i++){
            p=p*i;
        }
        System.out.println("Factorial of "+num+" is : "+p);
    }
}
