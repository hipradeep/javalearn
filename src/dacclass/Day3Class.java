package dacclass;

import java.util.Scanner;

public class Day3Class {
    public static void main(String[] args) {

        String name;
        int marks;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter name : ");
        name=sc.next();
        System.out.println("enter marks : ");
        marks=sc.nextInt();

        if(marks> 80) System.out.println("A Grade");
        else if (marks > 70) System.out.println("B Grade");
        else if (marks > 60) System.out.println("C Grade");
        else System.out.println("D Grade");

    }
}
