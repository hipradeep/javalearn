package dacclass.assignment.apr7BankSysytem;


public class BankRecord {

  public static void main(String[] args) {
    Bank bank = new Bank();
    bank.input();
    bank.display();
    System.out.println("==========================================");
    System.out.println("Deposit -  1000");
    bank.deposit(1000);
    bank.display();
    System.out.println("==========================================");
    System.out.println("Withdraw - 2000");
    bank.withdraw(2000);
    bank.display();

    System.out.println("==========================================");
    System.out.println("Checking OverDraft");
    OverDraft ov = new OverDraft();
    ov.input();
    ov.display();
    ov.deposit(600);
    ov.withdraw(4000);


  }
}
