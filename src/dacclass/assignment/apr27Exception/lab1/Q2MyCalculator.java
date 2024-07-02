package dacclass.assignment.apr27Exception.lab1;

import java.util.Scanner;

public class Q2MyCalculator extends Exception{

    public Q2MyCalculator(String m) {
        super(m);
      //  System.out.println(m);
    }



    public static void main(String[] args) {

        try{
            System.out.print("Enter first number : ");
            Scanner sc=new Scanner(System.in);
            int x=sc.nextInt();
            System.out.print("Enter second number : ");
            int y=sc.nextInt();

            System.out.println("x^y = : "+  calculatorPower(x, y));


        }catch (Exception e){
            System.out.println(e.getMessage());
        }


    }

    private static int  calculatorPower(int x, int y) throws Q2MyCalculator {
        if (x==0 || y==0) throw new Q2MyCalculator("x or y can not be zero");
        if (x<0 || y< 0) throw new Q2MyCalculator("x or y can not be negative");
        return (int) Math.pow(x, y);
    }
}
