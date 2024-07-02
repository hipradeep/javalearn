package dacclass.assignment.mar16lab2;

import java.util.Scanner;

public class Lab2GradeCheck {
    public static void main(String[] args) {
        int mark;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Marks : ");
        mark = sc.nextInt();

            if (mark >= 80) System.out.println("Grade A");
            else if (mark >= 60) System.out.println("Grade B");
            else if (mark >= 50) System.out.println("Grade C");
            else if (mark >= 45) System.out.println("Grade D");
            else if (mark >= 25) System.out.println("Grade E");
            else System.out.println("Grade F");



    }
}
