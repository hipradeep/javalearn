package assignment.apr7constructorandstatic;

public class Q7StaticKeyword {
    // Q 7  What is static keyword in Java?

    //Static is a Non-Access Modifier. Static can be applied to variable, method, nested class and initialization blocks (static block).

    static String PHONE="123456891";
    static {
        System.out.println("im static block");
    }
    public static void meth(){
        System.out.println("Im from static method");
    }
    public static void main(String[] args) {

        System.out.println(Q7StaticKeyword.PHONE);
        Q7StaticKeyword.meth();
    }
}
