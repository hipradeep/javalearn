package assignment;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        int number;
        String status;

        Scanner sc =new Scanner(System.in);
        System.out.print("Enter Your Number : ");
        number=sc.nextInt();

        status= (number > 0) ?  "Positive number": "Negative number";

        System.out.println(status);
    }
}
