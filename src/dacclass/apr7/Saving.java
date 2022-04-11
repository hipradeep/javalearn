package dacclass.apr7;

public class Saving extends Bank {

    @Override
    public void deposit(int x) {
        super.deposit(x);
        if (x<100) System.out.println("Deposit");
        else System.out.println("not deposit");
    }

    @Override
    public void withdraw(int z) {
        super.withdraw(z);
        if (z<300) System.out.println("withdraw");
        else System.out.println("not withdraw");
    }

}
