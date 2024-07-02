package corejava.abstrection.abstrectclass;

public class AbstractClassExample {

    public static void main(String[] args) {

        Hiring hiring = new Hiring(12);

        System.out.println(hiring.position); // Manager
        int maxValue = hiring.MAX_VALUE;
        int maxValue2 = WorkType.MAX_VALUE;

        System.out.println(hiring.getOpen()); // 12

        hiring.abstractMethod(); //-> In Hiring

        hiring.finalNonAbstractMethod(); //-> In WorkType

        hiring.staticMethod(); //-> In WorkType
        WorkType.staticMethod(); //-> In WorkType

        hiring.nonAbstractMethod(); //-> In Hiring

        WorkType wt = new Hiring(13);

        //can't access position of Hiring
        // wt.position;

        wt.abstractMethod(); //-> In Hiring
        //in Hiring Override and modify nonAbstractMethod();
        wt.nonAbstractMethod(); //-> In Hiring

        System.out.println(wt.getOpen()); // 13
        wt.finalNonAbstractMethod(); //-> In WorkType
        int maxValue1 = wt.MAX_VALUE;

        Jobs jb=new Jobs(20);
        jb.abstractMethod(); //In Jobs
        jb.nonAbstractMethod(); //In WorkType
        jb.finalNonAbstractMethod(); //In WorkType

        WorkType jwt = new Jobs(10);

        jwt.abstractMethod(); //-> In Jobs
        //in Jobs, we do not override and modify nonAbstractMethod
        jwt.nonAbstractMethod(); //-> In WorkType
    }
}

class Jobs extends WorkType {

    String jobName = "IT";

    public Jobs(int open) {
        super(open);
    }

    @Override
    void abstractMethod() {
        System.out.println("In Jobs");
    }

}

class Hiring extends WorkType {

    String position = "Manager";

    //super constructor
    public Hiring(int open) {
        super(open);
    }

    //override abstract method
    @Override
    void abstractMethod() {
        System.out.println("In Hiring");
    }

    //override Non-Abstract method and modify it
    @Override
    void nonAbstractMethod() {
        System.out.println("In Hiring ");
    }

    //final non-abstract method can't be override
    //void finalNonAbstractMethod(){  }

}

abstract class WorkType {
    //final static variable
    final static int MAX_VALUE = 10;
    private int open;

    //constructor
    public WorkType(int open) {
        this.open = open;
    }

    //abstract method, it can be public, protected and default type,
    // but it can't be private or final
    abstract void abstractMethod();

    //non-abstract method, it can be private, protected, public and default type
    void nonAbstractMethod() {
        System.out.println("In WorkType");
    }

    final void finalNonAbstractMethod() {
        System.out.println("In WorkType");
    }

    public int getOpen() {
        return open;
    }

    //static method
    public static void staticMethod() {
        System.out.println("In WorkType");
    }

    abstract class InnerClass {
        abstract void myAbstractMethod();
    }

}
