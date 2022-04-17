package practice;

public class StaticVarMethodBlocks {
    //11.Write a program to demonstrate static variables, methods, and blocks.
    static int CONST=10;

    static{
        System.out.println("I'm static block");
    }

    public static void main(String[] args) {
        System.out.println(CONST);
        staticMethod();
    }

    private static void staticMethod() {
        System.out.println("Im static method");
    }
}
