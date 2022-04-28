package assignment.apr26;

import java.util.Scanner;

public class Q5AbbreviationForm {

    public static void main(String[] args) {
        System.out.print("Enter a String : ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        abbreviationForm(input);
    }

    private static void abbreviationForm(String input) {
        String[] strgs = input.split(" ");
        StringBuilder sb=new StringBuilder();

        for (String s:strgs  ) {
            sb.append(Character.toUpperCase(s.charAt(0)));
        }

        System.out.println("Abbreviation form : " +sb.toString());
    }
}
