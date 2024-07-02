package dacclass.assignment.apr30FileIO;

import java.io.*;
import java.util.Scanner;

public class Q3EmployeeRecords {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\prade\\IdeaProjects\\javalearn\\src\\advjava\\_7inputoutputstream\\";

        String fileName = "employee.dat";

        Employee employee=new Employee(120, "Prdeep",24,10000, 50000 );

       // employee.input();
        // employee.displayDetails();

        //write this data in employee.dat file
        try{
            FileOutputStream fileOutputStream= new FileOutputStream(path + fileName);
            ObjectOutputStream oi= new ObjectOutputStream(fileOutputStream);

            oi.writeObject(employee);

            oi.close();

            //reading data from employee.dat
            FileInputStream fileInputStream = new FileInputStream(path + fileName);
            ObjectInputStream k= new ObjectInputStream(fileInputStream);

           Employee emp=(Employee) k.readObject();
            emp.displayDetails();
            k.close();

        }catch (Exception e){

        }

    }
}



class Employee implements Serializable {

    private int empNo;
    private String name;
    private int age;
    private int dept ;
    private int salary  ;

    public Employee(int empNo, String name, int age, int dept, int salary) {
        this.empNo = empNo;
        this.name = name;
        this.age = age;
        this.dept = dept;
        this.salary = salary;
    }

    public void input(){

        System.out.println("Enter employee details : ");
        System.out.print("Emp No : ");
        empNo= new Scanner(System.in).nextInt();
        System.out.print("Emp Name : ");
        name = new Scanner(System.in).nextLine();
        System.out.print("Emp Age : ");
        age = new Scanner(System.in).nextInt();
        System.out.print("Emp dept : ");
        dept = new Scanner(System.in).nextInt();

        System.out.print("Emp salary : ");
        salary = new Scanner(System.in).nextInt();
    }



    public void displayDetails(){
        System.out.println("Employee details "+
                "\n EMP No - "+empNo+
                "\n Name - "+name+
                "\n Age - "+age+
                "\n dept - "+dept+
                "\n salary - "+salary

        );
    }

}
