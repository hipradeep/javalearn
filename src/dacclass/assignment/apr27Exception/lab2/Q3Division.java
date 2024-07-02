package dacclass.assignment.apr27Exception.lab2;

import java.util.Scanner;

public class Q3Division {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number : ");
        int i=sc.nextInt();

        System.out.print("Enter second number : ");
        int z=sc.nextInt();

        try{
            int p=i/z;

            System.out.println(p);

        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
