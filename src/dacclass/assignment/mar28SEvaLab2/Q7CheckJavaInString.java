package dacclass.assignment.mar28SEvaLab2;

import java.util.Scanner;

public class Q7CheckJavaInString {
    //Q7 wap to check if given string starts with "java"  return true otherwise return false.
    public static void main(String[] args) {
        String str;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string : ");

        str = sc.nextLine();

        System.out.println("java is present in string : "+ checkJavaContain(str));

    }
    static boolean checkJavaContain(String s){
        //    (str.substring(0, 4).equals("java"))
        return s.startsWith("java");
    }
}
