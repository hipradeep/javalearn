package assignment.mar28SEvaLab2;

import java.util.Scanner;

public class Q6ReverseString {

    //Q 6 wap to reverse given string without using any reverse method

    public static void main(String[] args) {
        String str;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");

        str = sc.nextLine();

        char[] arr = str.toCharArray();
        int i, j, l = arr.length;

        for (i = 0, j = l - 1; i < j; i++, j--) {
            char t = arr[i];
            arr[i] = arr[j];
            arr[j] = t;
        }
        StringBuilder sb = new StringBuilder();
        for (char a : arr) {
            sb.append(a);
        }

        System.out.println(sb);
    }
}
