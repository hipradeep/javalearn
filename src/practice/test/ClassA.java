package practice.test;

public class ClassA {
    public static void main(String[] args) {
        ClassB objB = new ClassB();
        ClassB objB2 = new ClassB();

        objB.name="PRadeep";
        objB.phone="123467522";

        objB2.name="Abd";
        objB2.phone="25488";
        ClassB objB3 = new ClassB("CDE", "45782852");



    }

    void fun(){
        System.out.println("Hi");
    }

}

class ClassB{
    String name;
    String phone;

    public ClassB() {
    }

    public ClassB(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }
    
}
class ClassC{
    String name;
    int phone;
    int age;
}

