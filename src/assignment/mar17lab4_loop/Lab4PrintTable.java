package assignment.mar17lab4_loop;

import java.util.Scanner;

public class Lab4PrintTable {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number : ");
        num = sc.nextInt();

        for (int i=1; i<=10; i++)
            System.out.println(num+" * "+i+" = "+num*i);
    }
}
