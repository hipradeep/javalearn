package practice.test;

public class DefaultConstructures {

    public static void main(String[] args){
       // A a1 = new A(101,202,303,404);
        A a=new A(7);
    }
}

class A{
    A(){
        System.out.println("Default Constructor in A class");
    }
    A(int a){
        this();
        System.out.println("A(int a) in A class");
    }
    A(int a, int b){
        this(101);
        System.out.println("A(int a, int b) in A class");
    }
    A(int a, int b, int c){
        this(101,202);
        System.out.println("A(int a, int b, int c) in A class");
    }
    A(int a, int b, int c, int d){
        this(101,202,303);
        System.out.println("A(int a, int b, int c, int d) in A class");
    }
}
