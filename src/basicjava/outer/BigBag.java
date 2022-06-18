package basicjava.outer;

public interface BigBag {

    //final and static
    int cout = 10;

    //interface method
    public void interfaceMethod();

    //default method
    default  void defaultMethod() {
        //access private method of interface
        gDog();
        pCat();
        System.out.println("default method");
    }

    //static method
    static void staticMethod() {
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
