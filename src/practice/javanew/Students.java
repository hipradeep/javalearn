package practice.javanew;

public class Students {
    String name;
    int age;

    public Students(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        Students students=new Students("Pradeep", 22);

        System.out.println(students.name +"-"+students.age);
    }
}
