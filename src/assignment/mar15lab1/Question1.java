package assignment.mar15lab1;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {

        int mark;
        String status;

        Scanner sc =new Scanner(System.in);
        System.out.print("Enter Your Mark : ");
        mark=sc.nextInt();

       status= (mark > 40) ?  "Pass": "Fail";

       System.out.println(status);



    }
}
