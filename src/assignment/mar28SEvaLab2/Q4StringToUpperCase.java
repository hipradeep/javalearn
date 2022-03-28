package assignment.mar28SEvaLab2;

import java.util.Scanner;

public class Q4StringToUpperCase {
    //Q4 wap to ask string from user and convert each letter to upper case
    public static void main(String[] args) {
        String str;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");

        str = sc.nextLine();

        System.out.println(str.toUpperCase());
    }
}
