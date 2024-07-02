package dacclass.assignment.june12;

import java.util.Scanner;

public class Q1Anagrams {
    //Q 1  Two strings, are called anagrams if
    //they contain all the same characters in the same frequencies. For this
    //challenge, the test is not case-sensitive. For example, the anagrams of CAT are CAT, ACT, tac, TCA, aTC, and CtA.
    public static void main(String[] args) {

        System.out.print("Enter first string : ");
        String str1=(new Scanner(System.in)).nextLine().toLowerCase();
        System.out.print("Enter second string : ");
        String str2 = (new Scanner(System.in)).nextLine().toLowerCase();

        checkAnagrams(str1, str2);
    }

    private static void checkAnagrams(String str1, String str2) {

        char[] s1Arr=str1.toCharArray();
        StringBuilder s2SB=new StringBuilder(str2);
        for (char c : s1Arr) {
            int p = s2SB.indexOf(String.valueOf(c));
            if (p == -1) {
                break;
            } else {
                s2SB.deleteCharAt(p);
            }
        }
        if (s2SB.length() == 0)   System.out.println("Anagram Strings!");
        else System.out.println("Not a Anagram Strings!");
    }
}
