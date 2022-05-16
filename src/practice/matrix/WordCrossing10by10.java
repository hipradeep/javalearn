package practice.matrix;

import java.util.Scanner;

public class WordCrossing10by10 {
    static String vString;
    static String hString;
    static String firstCommonChar;
    static int pInVerString;
    static int pInHorString;

    public static void main(String[] args) {
        String[][] a = new String[10][10];
        for (int i = 0; i < 10; i++) { //col
            for (int j = 0; j < 10; j++) { //row
                a[i][j] = "*";
            }
        }
        // printMatrix(a);
        takeInput();

        firstCommonChar();

        if (firstCommonChar !=null)
            fillingString(a);
        else System.out.println("No common character");

        printMatrix(a);


    }

    private static void fillingString(String[][] a) {
        char[] vChars = vString.toCharArray();
        char[] hChars = hString.toCharArray();

        //vertical filling
        for (int i = 0; i < 10; i++) { //col
            for (int j = pInHorString; j < pInHorString + 1; j++) { //row
                if (i < vChars.length)
                    a[i][j] = vChars[i] + "";
                else a[i][j] = "*";
            }
        }
        //horizontal filling
        for (int i = pInVerString; i < pInVerString + 1; i++) { //col
            for (int j = 0; j < 10; j++) { //row
                if (j < hChars.length)
                    a[i][j] = hChars[j] + "";
                else a[i][j] = "*";
            }
        }
    }

    private static void firstCommonChar() {

        char[] vChars = vString.toCharArray();
        char[] hChars = hString.toCharArray();
        for (int i = 0; i < vChars.length; i++) {
            for (int j = 0; j < hChars.length; j++) {

                if (vChars[i] == hChars[j]) {
                    firstCommonChar = vChars[i] + "";
                    pInVerString = i;
                    pInHorString = j;
                    return;
                }

            }

        }

    }

    private static void takeInput() {
        System.out.print("Enter Vertical String : ");
        vString = (new Scanner(System.in)).nextLine();
        System.out.print("Enter Horizontal String : ");
        hString = (new Scanner(System.in)).nextLine();

        System.out.println("Vertical String : " + vString);
        System.out.println("Horizontal String : " + hString);
    }

    private static void printMatrix(String[][] arr) {
        int rows = arr.length;
        int column = arr[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < column; j++) {
                if (String.valueOf(arr[i][j]).length() == 1)
                    System.out.print(arr[i][j] + "   ");
                else System.out.print(arr[i][j] + "  ");
            }
            System.out.println(" ");
        }
    }
}
