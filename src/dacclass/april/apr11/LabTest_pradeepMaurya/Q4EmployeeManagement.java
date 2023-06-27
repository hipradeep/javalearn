package dacclass.april.apr11.LabTest_pradeepMaurya;

import java.util.Scanner;

public class Q4EmployeeManagement {
    //Q 4 Design an application for Employee management system .Design class Employee having fields like Empid,ename,salary,age
    //a) create getEmployee method that initialize class variable by using scanner method and asking value from user
    //b create showEmployee that display employee record
    //c) create addbonus() method that add 5000 Rs. to employee salary with age above 40 and 1000 to employee below age 40.
    //d) In main.kotlin.main method ask 3 employee record from user and call above methods

    public static void main(String[] args) {
        Employee emp1=new Employee();
        emp1.getEmployee();

        Employee emp2=new Employee();
        emp2.getEmployee();

        Employee emp3=new Employee();
        emp3.getEmployee();

        emp1.showEmployee();
        emp1.addBonus();

        emp2.showEmployee();
        emp2.addBonus();

        emp3.showEmployee();
        emp3.addBonus();

    }

}

class Employee{
    int empId, eSalary, eAge;
    String eName;

    public void getEmployee(){
        System.out.println("Enter employee details");
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter employee id : ");
        empId=sc.nextInt();
        System.out.print("Enter employee name : ");
        eName=sc.next();
        System.out.print("Enter employee age : ");
        eAge=sc.nextInt();
        System.out.print("Enter employee salary : ");
        eSalary=sc.nextInt();

    }

    public void showEmployee(){
        System.out.println("Employee details  : "+
                "\n Employee ID - "+empId+
                "\n Employee Name - "+eName+
                "\n Employee Age - "+eAge+
                "\n Employee Salary - "+eSalary
        );
    }

    public void addBonus(){
        if (eAge>= 40)
            eSalary=eSalary+5000;
        else eSalary=eSalary+1000;
        System.out.println("After apply bonus");
        showEmployee();
    }

}
