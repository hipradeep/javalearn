package corejava.lambdaexpession;

import java.util.function.*;

public class FunctionalInterfaceExam {
    public static void main(String[] args) {
        int a = 5;

        // lambda expression to define the calculate method
        Square s = (int x) -> x * x;
        // parameter passed and return type must be
        int ans = s.calculate(a);
        System.out.println(ans);

        //predicate functional interface - predefine
        Predicate<String> checkEmpty = (str) -> str.isEmpty();
        Predicate<String> checkEmpty2 = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.isEmpty();
            }
        };
        System.out.println(" == "+checkEmpty.test("pradeep") );
        System.out.println(" == "+checkEmpty2.test("pradeep") );

        //predicate functional interface - Custom
        CustPredicate<Integer> ckOdd=(i) -> i%2!=0;
        System.out.println(ckOdd.checkOdd(5));

        //Consumer functional interface - predefine
        Consumer<String> pt=(k) -> System.out.println(k);
        //Consumer functional interface - custom
        CustConsumer<Integer> cPt=(l)-> {System.out.println(l);};
        cPt.printMe(90);

        //Fuction functional interface - predefine
        Function<String, String> con=(k) -> k+"/"+k;
        System.out.println( con.apply("Pradeep"));
        //Consumer functional interface - custom
        CustFunction<Integer, Integer> cFun=(l)-> l*l;
        System.out.println(cFun.test(90));

        //Suppler functional interface - predefine
        Supplier<String> supp= () -> "Pradeep";
        System.out.println( supp.get());
        //Suppler functional interface - custom
        CustSupplier<String> cSupp=()-> "I am the Supplier";
        System.out.println(cSupp.test());


        //BiFunction functional interface - predefine
        BiFunction<String, String, String> biF= (t, q) -> t+"--"+q;
        System.out.println( biF.apply("Pradeep ", "Maurya"));
        //BiFunction functional interface - custom
        CustBiFunction<String, String, String> cbiF= (t, q) -> t+"-/-"+q;
        System.out.println(cbiF.test("Xoxo", "Kevin"));


    }
}

@FunctionalInterface
interface Square {
    int calculate(int x);
}


//predicate - represents a predicate (boolean-valued function) of one argument.
interface CustPredicate<T>{
    boolean checkOdd(T i);
}

//consumer - accepts a single input argument and returns no result.
interface CustConsumer<T>{
    void printMe(T i);
}


//Function - accepts a single input argument and returns a result.
interface CustFunction<T, K>{
    K test(T i);
}

//Supplier - A Supplier is a functional interface that represents a supplier of results.
interface CustSupplier<T>{
    T test();
}


//BiFunction-- accepts two arguments and produces a result.
interface CustBiFunction<T, K, P>{
    P test(T t, K k);
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