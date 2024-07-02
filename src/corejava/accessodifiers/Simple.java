package corejava.accessodifiers;

public class Simple extends Abc {

    public static void main(String[] args) {
        Simple simple=new Simple();
        String name= simple.name;
       // int age= simple.age;
        int roll= simple.roll;
        int pin= simple.pin;

        Abc abc=new Abc();
        String name1= abc.name;
        // int age1= abc.age;
        int roll1= abc.roll;
        int pin1= abc.pin;
    }
}
class Abc{
    String name = "pradeep";
    private int age = 25;
    public int roll = 12012;
    protected int pin = 226021;
}
