package practice.java13q;

import java.lang.reflect.Method;

public class ReflectionExample {
    public static void main(String[] args) {
        Student e = new Student("Durgesh", 23);
        try{

            Method privateMethod = Student.class.getDeclaredMethod("getAge");
            privateMethod.setAccessible(true);

            int age = (int)privateMethod.invoke(e);
            System.out.println("Age of Student: " + age);


        }catch (Exception e1){

        }
    }
}

class Student{
    private String name;
    private int age;

    public Student(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
