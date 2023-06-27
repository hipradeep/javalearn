package assignment.apr7constructorandstatic;

public class Q10StaticBlock {
    //Q 10 Can a static block exist without a main.kotlin.main() method?
    //No. You cannot have a static block alone in the class without a main.kotlin.main method.
    //
    //This behavior was a valid one in Java 6,

    static {
        System.out.println("im static block");
    }

    public static void main(String[] args) {
        Beta beta=new Beta();
    }

}

class Beta{
    static {
        System.out.println("im beta static block");
    }
}
