package assignment.mar28SEvaLab2;

import java.util.Scanner;

public class Q8CheckCharacters {
    //Q8 wap to  check a given string contains 2 to 4 number of a specified chatrcter
    //example
    //checkchar("javajava" ,"a")   a comes 2 to 4 times return true else false

    public static void main(String[] args) {
        String str, checkChar;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string : ");
        str = sc.nextLine();
        System.out.print("Check character : ");
        checkChar = sc.nextLine();

        System.out.println(checkChar + " is comes 2 to 4 times : " + checkCharContain(str, checkChar));


    }

    private static boolean checkCharContain(String str, String checkChar) {
        int l = str.length(), cl = checkChar.length(), count = 0;

        for (int i = 0; i < l - cl; i++) {
            if (checkChar.equals(str.substring(i, i + cl)))
                count = count + 1;
        }
        return (count >= 2 && count <= 4);
    }
}
