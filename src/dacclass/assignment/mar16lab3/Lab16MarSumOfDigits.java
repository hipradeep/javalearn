package dacclass.assignment.mar16lab3;

import java.util.Scanner;

public class Lab16MarSumOfDigits {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number : ");
        num = sc.nextInt();
        int m=num;
        int sum = 0;
        while (num != 0) {
            sum = sum  + num % 10;
            num /= 10;
        }
        System.out.println("Sum of digits of number '" +m+ "' is " +sum);
    }
}
