package basicjava.abstrect_interface;

public class AbstractClassExample {
    public static void main(String[] args) {
        Men m=new Men(12);
        m.hardware();

        WorkType.staticMethod();
    }

}

class Men extends WorkType{

    public Men(int open) {
        super(open);
    }

    @Override
    void hardware() {
        System.out.println("abstract method");
    }
}

abstract class WorkType{
    //final static variable
    final static int MAX_VALUE=10;
    private int open;

    //abstract method
    abstract void hardware();

    //constructor
    public WorkType(int open) {
        this.open = open;
    }

    //static method
    public  static void staticMethod(){
        System.out.println("Static method in Abstract class");
    }

    public int getOpen() {
        return open;
    }

    public void setOpen(int open) {
        this.open = open;
    }
    abstract class InnerClass {
        abstract void myAbstractMethod();
    }
}
