package practice.java42q;

import java.util.Scanner;

public  class Employee extends Person {
    //22. Modify program 21 to define a parametrized constructor and finalizer in each class.
    //De    monstrate calling the constructor of the base class from the constructor of the derived class.
    //-Create objects of person and employee classes to showtheorder of invocation of constructors.
    int salary;
    String id;

    public Employee(String name, int age, int salary, String id) {
        super(name, age);
        this.salary = salary;
        this.id = id;
    }

    @Override
    void getData() {
        super.getData();
        System.out.println("Id - " + id);
        System.out.println("Salary - " + salary);
    }

    public static void main(String[] args) {
        System.out.print("Enter name : ");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.print("Enter age : ");
        int age = sc.nextInt();
        System.out.print("Enter Id : ");

        String id = sc.next();
        System.out.print("Enter salary : ");
        int salary = sc.nextInt();

        System.out.println("Employee");
        Employee e = new Employee(name, age, salary, id);
        e.getData();

        System.out.println("Person");
        Person p=new Person(name,age);
        p.getData();
    }

}

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void getData() {
        System.out.println("Name - " + name);
        System.out.println("Age - " + age);
    }
}

/*

public class Employee extends Person{
    //21. Define a base class person and a derived class employee with single inheritance.
    //-Define SetData() member functions in each of the class with different signatures to set the
    // data members and demonstrate overloading of member functions.
    //-Define GetData() member functions in each of the class withsame signatures to display data and
    //demonstrate overriding of member functions.
    int salary;
    String id;

    @Override
    void setData() {
        super.setData();
        System.out.print("Enter Id : ");
        Scanner sc=new Scanner(System.in);
        id=sc.next();
        System.out.print("Enter salary : ");
        salary=sc.nextInt();
    }

    @Override
    void getData() {
        super.getData();
        System.out.println("Id - "+id);
        System.out.println("Salary - "+salary);
    }

    public static void main(String[] args) {
        Employee e=new Employee();
        e.setData();
        e.getData();

    }

}

class Person {
    String name;
    int age;

    void setData(){
        System.out.print("Enter name : ");
        Scanner sc=new Scanner(System.in);
        name=sc.next();
        System.out.print("Enter age : ");
        age=sc.nextInt();
    }
    void getData(){
        System.out.println("Name - "+name);
        System.out.println("Age - "+age);
    }
}

*/
