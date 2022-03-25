package assignment.mar24String;

import java.util.Scanner;

public class Q5RepeatCharOfString {

    //Write a Java program to create a new string repeating every character twice of a given string.

    public static void main(String[] args) {

        String str1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        str1 = sc.nextLine();

        int m=str1.length();

        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < m; i++) {
            sb.append(str1.charAt(i));
            sb.append(str1.charAt(i));
        }

        System.out.println("Final String : "+sb);

    }
}
