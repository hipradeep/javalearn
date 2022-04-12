package assignment.apr7BankSysytem;

import java.util.Scanner;

public class OverDraft extends Bank {

    String pan;
    final int minAmount=1000;
    @Override
    void deposit(int d) {
        if (d> 50000){
            System.out.println("Deposit amount is more tha 5000, please provide PAN Number");
            System.out.print("Enter your pan number : ");
            Scanner scanner=new Scanner(System.in);
            pan=scanner.nextLine();
            amount=amount+d;
            System.out.println("Deposit amount is : "+d);
            System.out.println("Total amount is : "+amount);
        }else {
            amount=amount+d;
            System.out.println("Deposit amount is : "+d);
            System.out.println("Total amount is : "+amount);
        }
    }

    @Override
    void withdraw(int w) {

        if((amount-w) <minAmount){
            System.out.println("Withdraw not allowed");
        }else {
            amount=amount-w;
            System.out.println("Withdraw amount is :"+w);
            System.out.println("Total amount is : "+amount);
        }
    }
}