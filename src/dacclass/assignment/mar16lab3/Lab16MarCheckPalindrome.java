package dacclass.assignment.mar16lab3;

import java.util.Scanner;

public class Lab16MarCheckPalindrome {


    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number : ");
        num = sc.nextInt();
        int m = num;
        int sum = 0;
        while (num != 0) {
            sum = sum * 10 + num % 10;
            num /= 10;
        }
        if (sum == m) {
            System.out.println(m + " is Palindrome");
        } else {
            System.out.println(m + " is Not Palindrome");
        }
    }
}
