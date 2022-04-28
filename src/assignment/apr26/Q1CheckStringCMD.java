package assignment.apr26;

import java.util.Scanner;

public class Q1CheckStringCMD {
    //Q 1   Write a java
    //   program to ask a String from user     Using
    //   command line argument           Another
    //   string is asked from user using Scanner object       Pass both the
    //   Strings to a function check which return true if both strings are
    //   having same value and false otherwise .
    public static void main(String[] args) {

        System.out.print("Enter a String : ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        StringBuilder a = new StringBuilder();
        for (String s : args) {
            a.append(s);
        }
        System.out.println("is both Strings are equal : " + checkString(a.toString(), input));

    }

    private static boolean checkString(String args, String input) {
        return args.equals(input);
    }
}
