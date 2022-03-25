package assignment.mar24String;

import java.util.Scanner;

public class Q6AddStringMultipleTimes {
    //Write a Java program to add a string with specific number of times

    public static void main(String[] args) {

        String str1;
        int rep;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        str1 = sc.nextLine();

        System.out.print("Enter number of repeat : ");
        rep = sc.nextInt();


        System.out.println("Final String :"+ str1.repeat(Math.max(0, rep)));

        // StringBuilder sb=new StringBuilder();
        // sb.append(String.valueOf(str1).repeat(Math.max(0, rep)));


        // for (int i = 0; i < rep; i++) sb.append(str1);

        //System.out.println("Final String "+sb);



    }
}
