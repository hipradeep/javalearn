package assignment.mar23String;

import java.util.Scanner;

public class CountVowelsConsonants { //wap to count number of vowels and consonants in string
    public static void main(String[] args) {
        String str1;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        str1 = sc.nextLine();

        int s = str1.length();
        int countVowels = 0;
        int countConsonants = 0;

        for (int i = 0; i < s; i++) {
            char c = str1.charAt(i);
            if (c == 'a' || c == 'A' || c == 'e' || c == 'E' || c == 'i' || c == 'I' || c == 'o' || c == 'O' || c == 'u' || c == 'U')
                countVowels += 1;
            else countConsonants += 1;
        }

        System.out.println("Vowels : " + countVowels);
        System.out.println("Consonants : " + countConsonants);
    }
}
