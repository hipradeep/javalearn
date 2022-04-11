package dacclass.apr7;

import java.util.Scanner;

public class Bank {

    String name, account;
     int amount;

     void input(){
        System.out.println("Enter details");
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter person name : ");
        name=sc.nextLine();
        System.out.print("Enter account number : ");
        account=sc.nextLine();
        System.out.print("Enter amount : ");
        amount=sc.nextInt();
    }
     void deposit(int x){
        amount=amount+x;
    }

     void withdraw(int z){

        if (z> amount){
            System.out.println("Cant Withdraw");
        }else {
            amount=amount-z;
            System.out.println("Withdraw amount : "+z);
            System.out.println("Available balance : "+amount);
        }
    }

     void display(){
        System.out.println("Name : "+name);
        System.out.println("Account number : "+account);
        System.out.println("Available balance : "+amount);
    }
}
