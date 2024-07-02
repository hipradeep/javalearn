package dacclass.assignment.apr12.q1;

import java.util.Scanner;

public class Employee extends Person implements PersonInterface {

    private String name, dept_number, code;

    @Override
    void getData() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter employee details");
        System.out.print("Enter employee name : ");
        name=sc.next();
        System.out.print("Enter employee dept number : ");
        dept_number=sc.next();
        System.out.print("Enter employee code : ");
        code=sc.next();
    }

    @Override
    public void displayData() {
        System.out.println("Name : " + name +
                "\n Dept Name : " + dept_number +
                "\n Code : " + code);
    }
}
