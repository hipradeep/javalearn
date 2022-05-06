package assignment.apr30FileIO;

import java.util.Scanner;

public class Q6CharacterInEachLine {
    //write a program to ask name of person and display name character
    //by character in each line.
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("enter name : ");
        String name = scanner.nextLine();
        char[] charArr = name.toCharArray();
        for (char c : charArr) {
            System.out.println(c);
        }


    }
}
