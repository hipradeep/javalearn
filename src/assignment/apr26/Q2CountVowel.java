package assignment.apr26;

import java.util.Scanner;

public class Q2CountVowel {
    // Q2   Write a function
    //   that counts and returns the number of vowels in the string. (For the
    //   purposes of this exercise, we are talking about the standard 5
    //   vowels -- A, E, I, O, U).

    public static void main(String[] args) {
        String str1;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        str1 = sc.nextLine();

        System.out.println("Vowels : " + countVowel(str1));

    }

    private static int  countVowel(String str1) {
        int s = str1.length();
        int countVowels = 0;
        int countConsonants = 0;

        for (int i = 0; i < s; i++) {
            char c = str1.charAt(i);
            if (c == 'a' || c == 'A' || c == 'e' || c == 'E' || c == 'i' || c == 'I' || c == 'o' || c == 'O' || c == 'u' || c == 'U')
                countVowels += 1;
            else countConsonants += 1;
        }
        return countVowels;
    }
}
