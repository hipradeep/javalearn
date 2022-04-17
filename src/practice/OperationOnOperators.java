package practice;

public class OperationOnOperators {
    //1) Increment and decrement operators.
    //2) Bitwise Complement Operator.
    //3) Arithmetic operator.
    //4) Relational Operator
    //5) Bitwise operator.
    //6) Conditional Operator
    public static void main(String[] args) {
        int a = 5, b = 3;

        //increment/decrement
        System.out.println("increment on a : " + (a++));
        System.out.println("increment on a : " + (++a));

        System.out.println("decrement on a : " + (a--));
        System.out.println("decrement on a : " + (--a));


        System.out.println("a= "+a+" b= "+b);
        // bitwise complement of b
        int result = ~b;
        System.out.println(result);

        //Arithmetic
        System.out.println((a+b)+" "+(a*b)+" "+(a-b)+" "+(a/b));

        //Relational
        if (a>b) System.out.println("a is greater than b");
        if (a>=b) System.out.println("a is greater than or equal to b");
        if (a<b) System.out.println("b is greater than a");
        if (a<=b) System.out.println("b is greater than or equal to a");
        if (a==b) System.out.println("a is equal to b");
        if (a!=b) System.out.println("a is not equal to b");

        //Bitwise operators
        // bitwise and
        System.out.println("a&b = " + (a & b));
        // bitwise or
        System.out.println("a|b = " + (a | b));
        // bitwise xor
        System.out.println("a^b = " + (a ^ b));
        // bitwise not
        System.out.println("~a = " + ~a);

        //Conditional Operator
        String str  = (a >= b) ? "Head" : "Tails";
        System.out.println(str);

    }
}
