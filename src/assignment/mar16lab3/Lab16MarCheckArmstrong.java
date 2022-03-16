package assignment.mar16lab3;

import java.util.Scanner;

public class Lab16MarCheckArmstrong {
    public static void main(String[] args) {

        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number : ");
        num = sc.nextInt();

        int m = num; // copy in m
        int sum = 0;

        while (num != 0) {
            sum = (int) (sum + Math.pow(num % 10, 3));
            num /= 10;
        }
        if (sum == m) {
            System.out.println(m + " is Armstrong");
        } else {
            System.out.println(m + " is Not Armstrong");
        }


    }
}
