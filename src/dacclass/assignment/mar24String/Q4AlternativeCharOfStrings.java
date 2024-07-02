package dacclass.assignment.mar24String;

import java.util.Scanner;

public class Q4AlternativeCharOfStrings {
    //Write a Java program to make a new string from two given string in such a way that, each character of two string will come respectively
    public static void main(String[] args) {

        String str1, str2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string : ");
        str1 = sc.nextLine();

        System.out.print("Enter second string : ");
        str2 = sc.nextLine();

        int m = str1.length();
        int n = str2.length();
        int i = 0, j = 0;
        StringBuilder sb = new StringBuilder();

        while (i < m && j < n) {
            sb.append(str1.charAt(i++));
            sb.append(str2.charAt(j++));
        }
        for (; i < m; i++)
            sb.append(str1.charAt(i));

        for (; j < n; j++)
            sb.append(str2.charAt(j));

        System.out.println("Final String : " + sb);

    }
}
