package corejava.singultonclas;

public class SingletonClassExample {

    public static void main(String[] args) {

        //singleton object of Student having same reference
        Student st1 = Student.getStudentObj();
        Student st2 = Student.getStudentObj();


        System.out.println(st1.toString());
        System.out.println(st2.toString());

        //multiple object of Person, having different reference
        Person n = new Person();
        Person n2 = new Person();
        Person n3 = new Person();

        System.out.println(n.toString());
        System.out.println(n2.toString());
        System.out.println(n3.toString());
    }


}

class Student {
    static Student s = new Student();
    // constructor
    private Student() {
    }

    static Student getStudentObj() {
        return s;
    }
}

class Person {
    String name;
}

