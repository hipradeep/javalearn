package dacclass.assignment.mar24String;

import java.util.Scanner;

public class Q1GetCharAtIndex {
    //Write a Java program to get the character at the given index within the String
    public static void main(String[] args) {

        String str;
        int index;

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string : ");
        str=sc.nextLine();

        System.out.print("Enter index : ");
        index=sc.nextInt();

        int lStr=str.length();

        if (index > lStr) {
            System.out.println("Out of Range");
        }else {
            char ch=str.charAt(index);
            System.out.println("Character at Index "+index+ " is "+ch);
        }


    }
}
