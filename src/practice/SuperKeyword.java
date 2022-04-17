package practice;

public class SuperKeyword {
    //20. Demonstrate the use of ‘super’ keyword.
    //a) To refer to a member of super class.
    //b) To call super class constructor from sub class constructor.
    public static void main(String[] args) {
        Cat c=new Cat(5);
    }
}

class Animal{
    int a;

    public Animal(int a) {
        this.a = a;
        System.out.println("Animal");
    }
}
class Cat extends Animal{

    public Cat(int a) {
        super(a);
        System.out.println("Cat");
    }
}
