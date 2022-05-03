package practice.terminators;

public class Student2 implements Comparable<Student2>{

    String name;
    int age;
    float cgpa;

    public Student2(String name, int age, float cgpa) {
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
    public int compareTo(Student2 student) {
        return Integer.compare(this.getAge(), student.getAge());
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
