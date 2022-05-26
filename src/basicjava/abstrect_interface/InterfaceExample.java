package basicjava.abstrect_interface;


interface Bag {

    //final and static
    int cout = 10;

    //interface method
    public void interfaceMethod();

    //default method
    default void defaultMethod() {
        //access private method of interface
        gDog();
        pCat();
        System.out.println("default method");
    }

    //static method
    static void doMethod() {
        System.out.println("static method");
    }

    //private method, only access in interface
    private void gDog() {
        System.out.println("private method in interface gDog");
    }

    private static void pCat() {
        System.out.println("private static method in interface pCat");
    }

}

interface Cat extends Bag {
    @Override
    void interfaceMethod();

    void catInterfaceMethod();
}

public class InterfaceExample {
    public static void main(String[] args) {
        Alpha alpha = new Alpha();

        alpha.interfaceMethod();
        alpha.catInterfaceMethod();

        //access interface variable
        System.out.println(Bag.cout);

        //access default method
        alpha.defaultMethod();

        //access static method
        Bag.doMethod();

    }
}

class Alpha implements Bag, Cat {

    @Override
    public void interfaceMethod() {
        System.out.println("bag interface method");
    }

    @Override
    public void catInterfaceMethod() {
        System.out.println("cat interface method");
    }
    class A{

    }
}

