package dacclass.apr7;

public class OverDraft extends Bank{
    String pan;

     void deposit(int x) {
       // super.deposit(x);
        if (x<50000) {
            System.out.println("Account numberq : "+account);
            System.out.println("Available balance : "+(amount+x));
        }else  System.out.println("Pan Card Details Required");

    }


     void withdraw(int z) {
        //super.withdraw(z);
        if (z<200) {
            System.out.println("Min amount is 200");
        }else {
            System.out.println("Withdraw"+(amount-z));
        }

    }
}
