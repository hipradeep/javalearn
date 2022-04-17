package assignment.apr7constructorandstatic;

public class Q11StaticBlock {
    //Q 11 What is a static block?
    //A static block is a block of code inside a Java class that will be executed when a class is first loaded into the JVM. Mostly the static block will be used for initializing the variables.
    //The static block will be called only one while loading and it cannot have any return type, or any keywords (this or super).


    static int val;

    static {
        val = 100;
    }



}
