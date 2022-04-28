package assignment.apr26;

import java.util.Arrays;
import java.util.Scanner;

public class Q3StringOperation {


    public static void main(String[] args) {


        int flag = 0;


        while (flag == 0) {
            System.out.println("Choose option to perform operation");
            System.out.println("1 :  Convert string to upper case ");
            System.out.println("2 :  Convert string to lower case ");
            System.out.println("3 :  Display string character by character ");
            System.out.println("4 :  Count occurrence of particular character ");
            System.out.println("5 :  Concatenate two strings ");
            System.out.println("6 :  Print length of string ");
            System.out.println("7 :  Check if string is palindrome or not");
            System.out.println("8 :  Extract and print first three character from string");
            System.out.println("9 :  Replace a character with another character from string");
            System.out.println("10 :  Exit");

            System.out.print("Enter option : ");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    convertToUpperCase();
                    break;
                case 2:
                    convertToLowerCase();
                    break;
                case 3:
                    displayCharBtChar();
                    break;
                case 4:
                    countChar();
                    break;
                case 5:
                    concatenateTwoString();
                    break;
                case 6:
                    stringLength();
                    break;
                case 7:
                    checkPalindrome();
                    break;
                case 8:
                    firstThreeChar();
                    break;
                case 9:
                    replaceInString();
                    break;
                case 10:
                    flag = 1;
                    break;

                default:
                    System.out.println("Enter correct option");


            }


        }


    }

    private static void replaceInString() {
        String str1 = takeInput();
        String str2 = takeInput("replicable string");
        String str3 = takeInput("replaced by");

        String newStr = str1.replace(str2, str3);
        System.out.println("Old String : "+str1);
        System.out.println(str2 +"is replaced by "+ str3+ " in string : "+newStr);


    }

    private static void firstThreeChar() {
        String str = takeInput();
        char[] chArray = str.toCharArray();

        for (int i = 0; i < 3 ; i++) {
            System.out.println(chArray[i]);
        }
    }

    private static void checkPalindrome() {
        String str = takeInput();
        int s = str.length(), i, j, flag = 0;

        for (i = 0, j = s - 1; i < s / 2; i++, j--) {

            if (str.charAt(i) != str.charAt(j)) {
                System.out.println("Not Palindrome");
                flag = 1;
                break;
            }
        }
        if (flag == 0) System.out.println("Palindrome");
    }

    private static void stringLength() {
        String str1 = takeInput();
        System.out.println("String length : " + str1.length());
        System.out.println("========================");
    }

    private static void concatenateTwoString() {
        String str1 = takeInput();
        String str2 = takeInput();

        System.out.println("Concatenated String ");
        System.out.println(str1 + " " + str2);

        System.out.println("========================");

    }

    private static void countChar() {
        String str = takeInput();
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a character : ");
        char ch = sc.next().charAt(0);
        char[] chArray = str.toCharArray();

        int count = 0;
        for (char c : chArray) {
            if (ch == c) count += 1;
        }
        System.out.println("Cahrecter " + ch + " is " + count + " times in string " + str);

        System.out.println("========================");

    }

    private static void displayCharBtChar() {

        String str = takeInput();

        char[] chArray = str.toCharArray();
        System.out.println(Arrays.toString(chArray));
        System.out.println("========================");
    }

    private static void convertToLowerCase() {
        System.out.println("In Upper case : " + takeInput().toUpperCase());
        System.out.println("========================");

    }

    private static void convertToUpperCase() {
        System.out.println("In Lower case : " + takeInput().toLowerCase());
        System.out.println("========================");
    }

    private static String takeInput(String msg) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(msg+" ");
        return scanner.nextLine();
    }

    private static String takeInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter string : ");

        return scanner.nextLine();
    }
}
