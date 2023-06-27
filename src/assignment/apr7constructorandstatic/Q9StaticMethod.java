package assignment.apr7constructorandstatic;

public class Q9StaticMethod {
    //Q 9  What is a static method?
    //A static method belongs to the class rather than an object. It can be called directly by using the class name
    // “<<ClassName>>.<<MethodName>>”
    //A static method can access static variables directly and it cannot access non-static variables and can
    // only call a static method directly and it cannot call a non-static method from it.
    //Only the main.kotlin.main() method which is static will be called by the
    // JVM automatically, Not all the static method will be called automatically.

    public static void main(String[] args) {

        Q9StaticMethod.meth();
    }

    public static void meth() {
        System.out.println("Im from static method");
    }
}
