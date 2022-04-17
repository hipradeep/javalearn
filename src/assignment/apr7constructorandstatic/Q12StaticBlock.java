package assignment.apr7constructorandstatic;

public class Q12StaticBlock {
    //Q 12 Can we have multiple static blocks in our code?
    //Yes, we can have more than one static block in our code. It will be executed in the same order it is written.
    static int val;
    static {
        val = 100;
    }

    static {
        System.out.println("im static block");
    }

    static {
        System.out.println("im 2nd static block");
    }
}
