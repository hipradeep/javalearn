package assignment.mar25SEvaLab1;

import java.util.Scanner;

public class Q5CheckGrade {
    //Q 5   write a program that ask 5 subject marks of a student .Find average marks by dividing total by 5 . Check if marks less then 40 print fail .
    //if marks between 40 to 60 print c grade
    //if marks between 60 to 80 print B grade
    //else A grade

    public static void main(String[] args) {
        int sub1, sub2, sub3, sub4, sub5;

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Subject 1 Marks : ");
        sub1=sc.nextInt();
        System.out.print("Enter Subject 2 Marks : ");
        sub2=sc.nextInt();
        System.out.print("Enter Subject 3 Marks : ");
        sub3=sc.nextInt();
        System.out.print("Enter Subject 4 Marks : ");
        sub4=sc.nextInt();
        System.out.print("Enter Subject 5 Marks : ");
        sub5=sc.nextInt();

        int sumOfTotal=sub1+sub2+sub3+sub4+sub5;
        float avg=sumOfTotal/5f;
        System.out.println("Average marks : "+avg);

        if (avg>80) System.out.println("Grade A");
        else if (avg> 60) System.out.println("Grade B");
        else if (avg >=40) System.out.println("Grade C");
        else System.out.println("Fail");
    }
}
