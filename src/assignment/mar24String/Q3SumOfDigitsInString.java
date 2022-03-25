package assignment.mar24String;

import java.util.Scanner;

public class Q3SumOfDigitsInString {
    //Write a Java program to return the sum of the digits present in the given string. If there is no digits the sum return is 0.
    public static void main(String[] args) {

        String str;

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string : ");
        str=sc.nextLine();

        int sSize=str.length();

        int sum=0;
        for (int i = 0; i < sSize; i++) {
            if (Character.isDigit(str.charAt(i)))
                sum=sum+ Character.getNumericValue(str.charAt(i));
        }

        System.out.println("Sum of digits in string :"+sum);

    }
}
