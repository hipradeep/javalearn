package dacclass.april.apr30;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Q3Employee {

    public static void main(String[] args) {
        Employee employee = new Employee("Pradeep", 1245, 24, 50000, 3000);
        try {

            File file = new  File("C:\\Users\\prade\\IdeaProjects\\javalearn\\src\\dacclass\\apr30\\Employee.txt");

            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("Employee Details \n");
            bw.write("\nName : "+ employee.getName());
            bw.write("\nAge : "+ employee.getAge());
            bw.write("\nEmp No : "+ employee.getEmpno());
            bw.write("\nSalary : "+ employee.getSalary());
            bw.write("\nDept : "+ employee.getDept());
            bw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class Employee {
    String name;
    int empno, age, salary, dept;

    public Employee(String name, int empno, int age, int salary, int dept) {
        this.name = name;
        this.empno = empno;
        this.age = age;
        this.salary = salary;
        this.dept = dept;
    }

    public String getName() {
        return name;
    }

    public int getEmpno() {
        return empno;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    public int getDept() {
        return dept;
    }
}