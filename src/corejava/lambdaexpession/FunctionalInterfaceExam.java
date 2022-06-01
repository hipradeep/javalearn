package corejava.lambdaexpession;

public class FunctionalInterfaceExam {
    public static void main(String[] args) {
        int a = 5;

        // lambda expression to define the calculate method
        Square s = (int x) -> x * x;
        // parameter passed and return type must be
        int ans = s.calculate(a);

        System.out.println(ans);
    }
}

@FunctionalInterface
interface Square {
    int calculate(int x);
}

/*

    ###Functional Interfaces in Java###
    > java8
    > A functional interface is an interface that contains only one abstract method.
    >  lambda expressions can be used to represent the instance of a functional interface
    > Single Abstract Method Interfaces(SAM interfaces)
    >  Runnable, ActionListener, Comparable are some examples of functional interfaces
    >Functional interfaces are used and executed by representing the interface with an annotation called @FunctionalInterface.
    > by default, the method defined inside the interface is abstract only, so no need to use abstract keyword
























* */