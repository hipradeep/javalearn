package assignment.mar23String;

import java.util.Scanner;

public class StringPalindrome {

    // wap to check if string is palindrome or not

    public static void main(String[] args) {

        String str1;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        str1 = sc.nextLine();

       // checkPalindrome1(str1);  // using StringBuffer
        checkPalindrome2(str1);  // using two pointer

    }

    private static void checkPalindrome2(String str) {
        int s = str.length(), i, j, flag = 0;

        for (i = 0, j = s - 1; i < s / 2; i++, j--) {
            if (str.charAt(i) != str.charAt(j)) {
                System.out.println("Not Palindrome");
                flag = 1;
                break;
            }
        }
        if (flag == 0) System.out.println("Palindrome");

    }

    private static void checkPalindrome1(String str) {
        // using StringBuffer
        int s = str.length();

        StringBuilder sb = new StringBuilder();
        for (int i = s - 1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }

        if (str.equals(sb.toString()))
            System.out.println("Strings is Palindrome");
        else
            System.out.println("Strings is Not Palindrome");
    }


}
