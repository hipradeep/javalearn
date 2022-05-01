package corejava.exceptionhandling.userdefine;

public class UseOfThrows {

    public static void main(String[] args) {

        try{

            exceptionContainingFun();

        }catch (MyExceptionClass e){
            System.out.println(e.getMessage());
        }

        exceptionContainingFunHandlingItself();
    }

    //this method throw an Exception, who ever use this method must handel the Exception
    static void exceptionContainingFun() throws MyExceptionClass{

        throw new MyExceptionClass();

    }

    //this method throw an Exception, and also Handle its Exception,
    // so there is no need to use 'throws'
    static void exceptionContainingFunHandlingItself() {

        try{
            throw new MyExceptionClass();
        }catch (MyExceptionClass e){
            System.out.println(e.getMessage());
        }
    }
}

class MyExceptionClass extends Exception{
    public MyExceptionClass() {
        super("My exception message");
    }
}
