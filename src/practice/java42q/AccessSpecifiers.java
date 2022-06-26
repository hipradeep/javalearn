package practice.java42q;

//import dacclass.april.apr12.Hello;

public class AccessSpecifiers {
    //8. Write a JAVA program which illustrates the concept of accessspecifiers.
    public static void main(String[] args) {
//        SumClass sumClass=new SumClass(5, 6);
//       // sumClass.a=6; // not accessible due to private member of Class SumClass, only accessible within SumClass
//        sumClass.sum(); // accessible due to public method of Class SumClass
//        sumClass.x=9;

        Hello hello=new Hello();
        int protected_var = hello.PROTECTED_VAR;  // showing error, not accessible due to protected member of Class Hello(outside practice package)
        System.out.println(protected_var);
        hello.protectedMethod(); //

    }

}
class SumClass{
    private int a;
    private int b;
    protected int x; // The methods or data members declared as protected can be accessed from: Within the same class.
    // Subclasses of same packages. Different classes of same packages

    public SumClass(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public void sum(){
        System.out.println("Sum : "+(a+b));
    }
}
