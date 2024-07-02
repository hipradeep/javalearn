package dacclass.assignment.mar24String;

import java.util.Scanner;

public class Q2ConcatenateString {
    //Write a Java program to concatenate a given string to the end of another string

    public static void main(String[] args) {
        String str1, str2;

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first string : ");
        str1=sc.nextLine();

        System.out.print("Enter second string : ");
        str2=sc.nextLine();

        System.out.println("Concatenated string");
        System.out.println(str1+str2);

    }
}
