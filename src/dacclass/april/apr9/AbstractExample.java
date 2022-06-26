package dacclass.april.apr9;

public class AbstractExample {

    public static void main(String[] args) {
        Koki k = new Koki(200, "prdep");
        k.junk();
        k.show();
        k.kokiMethod();
        k.matchFinal();

        Popo p = new Koki(400, "klo");
        p.junk();
        p.show();
        //    p.kokiMethod();  //error
        p.matchFinal();
        Popo.match();
    }

}

class Koki extends Popo {

    public Koki(int anInt, String anString) {
        super(anInt, anString);
    }

    @Override
    void junk() {
        System.out.println("Junk in AE");
    }

    void kokiMethod() {
        System.out.println("Koki Method");
    }

}

abstract class Popo {
    int anInt;
    String anString;

    abstract void junk();

    void show() {
        System.out.println("Int : " + anInt + " String : " + anString);
    }

    public Popo(int anInt, String anString) {
        this.anInt = anInt;
        this.anString = anString;
    }

    public static void match() {
        System.out.println("Static method");
    }

    public final void matchFinal() {
        System.out.println("Static method");
    }
}