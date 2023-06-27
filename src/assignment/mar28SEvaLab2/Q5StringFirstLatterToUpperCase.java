package assignment.mar28SEvaLab2;

import java.util.Arrays;
import java.util.Scanner;

public class Q5StringFirstLatterToUpperCase {
    //Q 5 wap to ask string from user and convert each word to upper case like
    //welcome to java
    //Output
    //Welcome To Java

    public static void main(String[] args) {
        String str;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String : ");
        str=sc.nextLine();
        int l=str.length();

        String[] arrOfStr = str.split(" "); // make an array of strings, and split main.kotlin.main String over space

        StringBuilder sb=new StringBuilder();
        for(int i = 0; i < arrOfStr.length; i++) {
            if(i == (arrOfStr.length-1)) sb.append(arrOfStr[i].substring(0, 1).toUpperCase()).append(arrOfStr[i].substring(1));
            else  sb.append(arrOfStr[i].substring(0, 1).toUpperCase()).append(arrOfStr[i].substring(1)).append(" ");
        }
        System.out.println(sb);
    }
}
