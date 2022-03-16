package assignment.mar16lab3;

import java.util.Locale;
import java.util.Scanner;

public class Lab16MarCheckVowelOrConsonant {

    public static void main(String[] args) {
        char c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character : ");
        c = sc.next().charAt(0);
        //c = sc.next().toLowerCase(Locale.ROOT).charAt(0);

        // if (c == 97 || c == 65 || c == 101 || c == 69 || c == 105 || c == 73 || c == 111 || c == 79 || c == 117 || c == 85) {
        if (c == 'a' || c == 'A' || c == 'e' || c == 'E' || c == 'i' || c == 'I' || c == 'o' || c == 'O' || c == 'u' || c == 'U') {
            System.out.println(c + " is vowel");
        } else {
            System.out.println(c + " is consonant");
        }
    }

}
