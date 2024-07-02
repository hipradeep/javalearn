package dacclass.assignment.mar23String;

import java.util.Scanner;

public class CountWordsInString {
    // wap to count number of words in given string

    public static void main(String[] args) {
        String str1;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        str1 = sc.nextLine().trim();

        int s = str1.length();

        int countSpace = 1;
        for (int i = 0; i < s; i++) {
            char c = str1.charAt(i);
            if (c == ' ') //equating with space
                countSpace += 1;
        }
        System.out.println("Words  : " + countSpace);

    }
}
