package dacclass.assignment.apr26;

import java.util.Scanner;

public class Q8InsertCharInString {


    public static void main(String[] args) {

        System.out.print("Enter a String : ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.print("Enter a char : ");
        char inChar = sc.next().charAt(0);
        int position = 0;
        int strLength = input.length();
        int flag = 0;
        while (flag == 0) {
            System.out.print("Enter position : ");
            position = sc.nextInt();
            if (position <= strLength) {
                flag = 1;
            }else {
                System.out.println("Position must be less then the string size");
                System.out.println("String length : "+strLength);
            }
        }

        System.out.println(  insetChar(input, inChar, position));

    }

    private static String  insetChar(String input, char inChar, int position) {
        char[] chArray = input.toCharArray();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < chArray.length; i++) {

            if (i == position -1) sb.append(inChar);
            sb.append(chArray[i]);
        }
        return sb.toString();
    }
}
