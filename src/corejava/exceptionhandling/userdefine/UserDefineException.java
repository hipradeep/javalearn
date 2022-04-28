package corejava.exceptionhandling.userdefine;

public class UserDefineException {


    public static void main(String[] args) {

        try{

            int x=3+4; throw new Example(); // checked,


        }catch (Exception e){
            System.out.println("from catch");
        }finally {

            try{
                int i=3+4; throw new Example1();  //run time, unchecked

            }catch (Exception e){
                System.out.println("from catch1");
            }

        }
    }
}


class Example extends Exception{

    public Example() {
        System.out.println("User define Exception");
    }
}

class Example1 extends RuntimeException{

    public Example1() {
        System.out.println("User define RuntimeException");
    }

}
