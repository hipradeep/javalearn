package dacclass.assignment.apr27Exception.lab1;

import java.util.Scanner;

public class Q1DivideByZero {

    public static void main(String[] args) {


        try{
            System.out.print("Enter first number : ");
            Scanner sc=new Scanner(System.in);
            int x=sc.nextInt();
            System.out.print("Enter second number : ");
            int y=sc.nextInt();
            int z=x/y;
            System.out.println(""+z);

        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }catch (Exception e){

            System.out.println(e.getMessage());
        }


    }
}
