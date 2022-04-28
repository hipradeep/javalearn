package assignment.apr27Exception.lab1;

public class Q7Admission {

    public static void main(String[] args) {

        Student s = new Student();
        s.addStudent();
    }
}

interface Admission {
    void registration();
}


class Student {

    void addStudent() {
        class Mtech implements Admission {
            @Override
            public void registration() {
                System.out.println("registration method in Mtech local class");
            }
        }

        Mtech mtech = new Mtech();
        mtech.registration();

        new Admission() {
            @Override
            public void registration() {
                System.out.println("Anonymous call  method in method addStudent() ");
            }
        }.registration();


    }

}