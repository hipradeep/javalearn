package practice.java42q;

import java.util.Scanner;

public class SumUsingWhileLoop {
    //10.Write a do-while loop that asks the user to enter twonumbers.
    // The numbers should be added and the sumdisplayed. Theloopshould ask the user whether he or she wishes to
    // performtheoperation again. If so, the loop should repeat; otherwise it should terminate.
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int flag=1;
        while (flag==1){
            System.out.println("Enter choice : ");
            System.out.println("1. Sum");
            System.out.println("2. Exit");
            System.out.print("Enter here : ");
            int choice= sc.nextInt();
            switch (choice){
                case 1:{
                    System.out.print("Enter first number : ");
                    int a=sc.nextInt();
                    System.out.print("Enter second number : ");
                    int b=sc.nextInt();
                    System.out.println("Sum : "+ (a+b));
                    break;
                }
                case 2:{
                    flag=0;
                    break;
                }
                default:
                    System.out.println("Wrong choice");
            }
        }
    }
}
