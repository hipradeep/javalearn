package dacclass.april.apr6_2;

public class CoolClass extends FoxClass {
    public CoolClass() {
        super();
    }

    public CoolClass(int x) {
        super(x);
    }

    public static void main(String[] args) {
        CoolClass cc=new CoolClass();
        CoolClass cc1=new CoolClass(2);
    }
}

class FoxClass{
    public FoxClass() {
        System.out.println("Fox Primary Constructor");
    }

    public FoxClass(int x) {
        System.out.println("Fox Secondary Constructor");
    }
}
