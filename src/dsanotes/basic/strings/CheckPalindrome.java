package dsanotes.basic.strings;

import java.util.Scanner;

public class CheckPalindrome {

    public static void main(String[] args) {

        String str1;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        str1 = sc.nextLine();
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
}
