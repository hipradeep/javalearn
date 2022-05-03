package practice.terminators;

import java.util.Comparator;

public class Student  implements Comparable<Student>{

    String name;
    int age;
    float cgpa;

    public Student(String name, int age, float cgpa) {
        this.name = name;
        this.age = age;
        this.cgpa = cgpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getCgpa() {
        return cgpa;
    }

    public void setCgpa(float cgpa) {
        this.cgpa = cgpa;
    }

    @Override
    public int compareTo(Student student) {
        return CharSequence.compare(this.getName(), student.getName());
    }
    class byage implements Comparator<Student> {

        // Method
        // Used for sorting in ascending order of
        // roll number
        public int compare(Student a, Student b)
        {
            return a.getAge() - b.getAge();
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", cgpa=" + cgpa +
                '}';
    }
}
