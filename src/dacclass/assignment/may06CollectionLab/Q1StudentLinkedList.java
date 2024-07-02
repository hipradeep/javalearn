package dacclass.assignment.may06CollectionLab;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Q1StudentLinkedList {
    //Q 1 Write a program that ask student name ,rollno and marks from user .
    //     Initilaize value of class using constructor.
    //     define to string method in class
    //     create Studentmain class to call all class function
    //     Ask 5 record from user and store then in LinkedList and display all data
    public static void main(String[] args) {
        LinkedList<Student> students=new LinkedList<>();

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter name of "+(i+1)+" student : ");
            String name=(new Scanner(System.in)).nextLine();
            System.out.print("Enter roll number of "+(i+1)+" student : ");
            int roll=(new Scanner(System.in)).nextInt();
            System.out.print("Enter marks of "+(i+1)+" student : ");
            int mark=(new Scanner(System.in)).nextInt();
            students.offer(new Student(name, roll, mark));
        }



        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());
    }
}

class Student{
    private String name;
    private int rollNumber;
    private int marks;

    public Student(String name, int rollNumber, int marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNumber=" + rollNumber +
                ", marks=" + marks +
                '}';
    }
}