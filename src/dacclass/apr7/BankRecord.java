package dacclass.apr7;

public class BankRecord {


    public static void main(String[] args) {

        Bank b=new Bank();
        b.input();
        b.display();

        OverDraft od=new OverDraft();
        od.deposit(100);
      //  od.withdraw(100);


//        Saving sv=new Saving();
//        sv.deposit(100);
//        sv.withdraw(500);

    }
}
