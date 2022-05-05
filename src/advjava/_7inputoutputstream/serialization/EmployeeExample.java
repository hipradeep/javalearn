package advjava._7inputoutputstream.serialization;

import java.io.*;
import java.util.Scanner;

public class EmployeeExample {

    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\prade\\IdeaProjects\\javalearn\\src\\advjava\\_7inputoutputstream\\";
        String fileName = "employee.txt";
        String fileName2 = "employee.dat";
        Employee employee=new Employee();

        employee.input();
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
    private String address;

   public void input(){

        System.out.println("Enter employee details : ");
        System.out.print("Emp No : ");
        empNo= new Scanner(System.in).nextInt();
        System.out.print("Emp Name : ");
       name = new Scanner(System.in).nextLine();
        System.out.print("Emp Address : ");
       address = new Scanner(System.in).nextLine();
    }



   public void displayDetails(){
        System.out.println("Employee details "+
                "\n EMP No - "+empNo+
                "\n Name - "+name+
                "\n Address - "+address

                );
    }
}