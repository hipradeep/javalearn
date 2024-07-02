package dacclass.assignment.mar23String;

import java.util.Scanner;

public class StringEqualOrNot {
    //wap to ask two string values from user and check if they are equal or not

    public static void main(String[] args) {
        String str1, str2;

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first String : ");
        str1=sc.nextLine();

        System.out.print("Enter second String : ");
        str2=sc.nextLine();

        if (str1.equals(str2))
            System.out.println("Both strings are SAME");
        else
            System.out.println("Both strings are Not SAME");

    }
}
