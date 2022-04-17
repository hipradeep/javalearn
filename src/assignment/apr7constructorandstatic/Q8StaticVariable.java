package assignment.apr7constructorandstatic;

public class Q8StaticVariable {
    //Q 8 What is a static variable?
    //A Static variable gets memory allocated only once during the time of class loading.
    //All the instance of the class share the same copy of the variable, a static variable can be accessed directly by calling “<<ClassName>>.<<VariableName>>” without need to create an instance for the class.
    //value of a static variable will be common for all instances

    static String PHONE = "123456891";

    public static void main(String[] args) {
        System.out.println(Q8StaticVariable.PHONE);

    }
}
