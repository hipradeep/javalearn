package assignment.mar23String;

import java.util.Scanner;

public class PrintCharString {
    //wap to print string character by character

    public static void main(String[] args) {
        String str1;

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a String : ");
        str1=sc.nextLine();

        int s=str1.length();

        for (int i = 0; i < s ; i++) {
            System.out.println(str1.charAt(i));
        }


    }

}
