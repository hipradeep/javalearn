package practice.test;

import java.util.Arrays;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        ITStudent itStudent = new ITStudent();
        System.out.println("Enter Details for IT Student");
        itStudent.input();
        System.out.println("Student Details : ");
        System.out.println(itStudent.details());
        itStudent.findResult();
        System.out.println("Placement Percentage : "+itStudent.placementPercentage() );

        MathStudent mathStudent = new MathStudent();
        System.out.println("Enter Details for Math Student");
        mathStudent.input();
        System.out.println("Student Details : ");
        System.out.println(mathStudent.details());
        mathStudent.findResult();
        System.out.println("Placement Percentage : "+mathStudent.placementPercentage() );
    }
}


abstract class Student {
    public int sid;
    public String name;
    public String address;
    public int age;
    public String collageName;
    public String course_name;

    abstract void findResult();

}

interface StudentInterface {
    int placementPercentage();
}

class ITStudent extends Student implements StudentInterface {

    String[] sub = {"Java", "Python", "CPP"};
    int[] marks = new int[3];
    int PLACEMNTPER = 60;


    void input(){
        System.out.println("Enter Student ID");
       sid = (new Scanner(System.in)).nextInt();

        System.out.println("Enter Student Name");
     name = (new Scanner(System.in)).nextLine();

        System.out.println("Enter Student Address");
        address = (new Scanner(System.in)).nextLine();

        System.out.println("Enter Student Age");
        age = (new Scanner(System.in)).nextInt();

        System.out.println("Enter Student Collage Name");
        collageName = (new Scanner(System.in)).nextLine();

        System.out.println("Enter Student Course name");
        course_name = (new Scanner(System.in)).nextLine();

        System.out.println("Enter marks of subjects");

        for (int i = 0; i < sub.length; i++) {
            System.out.print(sub[i]);
            System.out.println(" mark : ");
            int m = (new Scanner(System.in)).nextInt();
            marks[i] = m;
        }
    }

    @Override
    void findResult() {

        System.out.println(Arrays.toString(sub));
        System.out.println(Arrays.toString(marks));
        System.out.println("Total Marks : " + findTotal()+"/300");
        System.out.println("Percentage  : " + calculatePercentage());
    }

    int findTotal() {
        int s = 0;
        for (int i = 0; i < marks.length; i++) {
            s = s + marks[i];
        }
        return s;
    }

    double calculatePercentage() {
        return (findTotal() / (float) marks.length);
    }

    public String details() {
        return "Student Details {" +
                "sid=" + sid +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                ", collageName='" + collageName + '\'' +
                ", course_name='" + course_name + '\'' +
                '}';
    }

    @Override
    public int placementPercentage() {
        return PLACEMNTPER;
    }
}

class MathStudent extends Student implements StudentInterface {

    String[] sub = new String[3];
    int[] marks = new int[3];
    int PLACEMNTPER = 70;

    void input(){
        System.out.println("Enter Student ID");
        sid = (new Scanner(System.in)).nextInt();

        System.out.println("Enter Student Name");
        name = (new Scanner(System.in)).nextLine();

        System.out.println("Enter Student Address");
        address = (new Scanner(System.in)).nextLine();

        System.out.println("Enter Student Age");
        age = (new Scanner(System.in)).nextInt();

        System.out.println("Enter Student Collage Name");
        collageName = (new Scanner(System.in)).nextLine();

        System.out.println("Enter Student Course name");
        course_name = (new Scanner(System.in)).nextLine();

        System.out.println("Enter marks of subjects");

        for (int i = 0; i < sub.length; i++) {
            System.out.print(sub[i]);
            System.out.println(" mark : ");
            int m = (new Scanner(System.in)).nextInt();
            marks[i] = m;
        }
    }

    @Override
    void findResult() {

        System.out.println(Arrays.toString(sub));
        System.out.println(Arrays.toString(marks));
        System.out.println("Total Marks : " + findTotal()+"/300");
        System.out.println("Percentage  : " + calculatePercentage());
    }

    int findTotal() {
        int s = 0;
        for (int i = 0; i < marks.length; i++) {
            s = s + marks[i];
        }
        return s;
    }

    double calculatePercentage() {
        return (findTotal() / (float) marks.length);
    }

    @Override
    public int placementPercentage() {
        return PLACEMNTPER;
    }

    public String details() {
        return "Student Details {" +
                "sid=" + sid +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                ", collageName='" + collageName + '\'' +
                ", course_name='" + course_name + '\'' +
                '}';
    }
}