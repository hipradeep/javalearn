package corejava.exceptionhandling.userdefine;

public class UserDefineException {

    public static void main(String[] args) {

        try{
            int x=3+4; throw new ExceptionClass(); // checked,

        }catch (Exception e){

            System.out.println(e.getMessage());

        }finally {

            try{
                int i=3+4; throw new ExceptionClass2();  //run time, unchecked
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
}


class ExceptionClass extends Exception{

    public ExceptionClass() {
        super("User define Exception");
    }
}

class ExceptionClass2 extends RuntimeException{

    public ExceptionClass2() {
        super("User define RuntimeException");
    }
}
