package assignment.mar15lab1;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
         String name;
         int age;
         float salary;

        Scanner sc =new Scanner(System.in);

        System.out.print("Enter Employee Name : ");
        name=sc.nextLine();
        System.out.print("Enter Employee Age : ");
        age=sc.nextInt();
        System.out.print("Enter Employee Salary : ");
        salary=sc.nextFloat();

        System.out.println("Employee Details : ");
        System.out.println("Name : "+ name);
        System.out.println("Age : "+ age);
        System.out.println("Salary : "+ salary);

    }
}
