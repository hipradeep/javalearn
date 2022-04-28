package assignment.apr27Exception.lab1;

import java.util.Scanner;

public class Q3Mark {


    public static void main(String[] args) {


        try {
            System.out.print("Enter internal mark : ");
            Scanner sc=new Scanner(System.in);
            int x=sc.nextInt();
            System.out.print("Enter external mark : ");
            int y=sc.nextInt();

            if (x> 40) throw new InternalException("internal mark is exceed");
            if (y> 60) throw new ExternalException("external marks is exceed,");

        }catch (Exception e){
            System.out.println(e.getMessage());
        }


    }


}
class InternalException extends Exception{
    public InternalException(String msg) {
        super(msg);
    }
}
class ExternalException extends Exception{
    public ExternalException(String msg) {
        super(msg);
    }
}
