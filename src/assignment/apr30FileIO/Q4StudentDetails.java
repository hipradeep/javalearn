package assignment.apr30FileIO;

import java.util.Scanner;

public class Q4StudentDetails {
    public static void main(String[] args) {

        System.out.println("Enter Student details");

        Student student = new Student();
        try {

            System.out.print("Name : ");
            String name = (new Scanner(System.in)).nextLine();
            if (checkName(name)) {
                student.setName(name);
            }


            System.out.print("Roll No : ");
            int roll = (new Scanner(System.in)).nextInt();
            if (checkRoll(roll)) student.setRollNo(roll);

            System.out.print("Age : ");
            int age = (new Scanner(System.in)).nextInt();
            if (checkAge(age)) student.setAge(age);

            student.displayDetails();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }

    static boolean checkName(String str) throws NameException {
        char[] chars = str.toCharArray();

        for (char c : chars) {
            if (Character.isDigit(c)) {
                throw new NameException();
            }

        }
        return true;
    }

    static boolean checkRoll(int roll) throws RollNoException {

        if (roll < 0 || roll > 50)
            throw new RollNoException();
        return true;
    }

    static boolean checkAge(int age) throws AgeException {
        if (age < 0)
            throw new AgeException();
        return true;
    }


}

class AgeException extends Exception {
    public AgeException() {
        super("Age Exception - Age cant be negative");
    }
}

class RollNoException extends Exception {
    public RollNoException() {
        super("Roll No Exception - Roll No. must be in 0 to 50");
    }
}

class NameException extends Exception {
    public NameException() {
        super("Name Exception - Name Contain Digits");
    }
}

class Student {
    private int rollNo;
    private int age;
    private String name;

    public Student(int rollNo, int age, String name) {
        this.rollNo = rollNo;
        this.age = age;
        this.name = name;
    }

    public Student() {
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void displayDetails() {
        System.out.println("Student details " +
                "\n Roll No - " + rollNo +
                "\n Name - " + name +
                "\n Age - " + age
        );
    }
}
