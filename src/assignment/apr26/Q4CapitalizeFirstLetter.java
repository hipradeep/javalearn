package assignment.apr26;

import java.util.Scanner;

public class Q4CapitalizeFirstLetter {

    public static void main(String[] args) {

        System.out.print("Enter a String : ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        capitalizeFirstLetter(input);
    }

    private static void capitalizeFirstLetter(String input) {
        String s1 = Character.toUpperCase(input.charAt(0)) + input.substring(1);
        System.out.println(s1);
    }
}
