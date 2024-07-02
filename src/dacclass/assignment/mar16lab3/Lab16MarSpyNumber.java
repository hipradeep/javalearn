package dacclass.assignment.mar16lab3;

import java.util.Scanner;

public class Lab16MarSpyNumber {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number : ");
        num = sc.nextInt();
        int m = num;
        int sNum = num;

        int sumOfDigits = 0;
        int productOfDigits = 1;
        while (sNum != 0) {
            sumOfDigits = sumOfDigits + sNum % 10;
            productOfDigits = productOfDigits * sNum % 10;
            sNum /= 10;
        }

        if (productOfDigits == sumOfDigits) {
            System.out.println(m + " is Spy Number");
        } else {
            System.out.println(m + " is Not Spy Number");
        }
    }
}
//ex 1124
