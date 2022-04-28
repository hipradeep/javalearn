package assignment.apr26;

import java.util.Scanner;

public class Q7DeleteFirstChar {

    public static void main(String[] args) {
        System.out.print("Enter a String : ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        System.out.println(deleteFirstChar(input));

    }

    private static String deleteFirstChar(String input) {

        StringBuilder sb = new StringBuilder();
        sb.append(input.substring(1));

        return sb.toString();
    }
}
