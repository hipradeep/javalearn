package dacclass.assignment.apr27Exception.lab2;

public class Q1ErrorRange120 {

    public static void main(String[] args) {

        //enter arge
        try {

            int a=Integer.parseInt(args[0]);

            if (a< 0 || a> 20) throw new NumberRangeException("NumberRangeException");

            System.out.println(a);
        }catch (NumberRangeException e){
            System.out.println(e.getMessage());
        }

    }
}

class NumberRangeException extends Exception{

    public NumberRangeException(String msg){
        super(msg);
    }
}