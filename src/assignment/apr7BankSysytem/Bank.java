package assignment.apr7BankSysytem;

import java.util.Scanner;

public class Bank {

    String name;
    String bankName;
    int amount;

    void input(){
        System.out.println("Enter Your details ");
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your name : ");
        name=sc.nextLine();
        System.out.print("Enter bank name : ");
        bankName=sc.nextLine();
        System.out.print("Enter amount : ");
        amount=sc.nextInt();
    }
    void display(){
        System.out.print("Your  account details :"+
                "\nName - "+name+
                "\nBank name - "+bankName+
                "\nBalance - "+amount+"\n");
    }
    void deposit(int d){
        amount=amount+d;
    }
    void withdraw(int w){
        amount=amount-w;
    }

}