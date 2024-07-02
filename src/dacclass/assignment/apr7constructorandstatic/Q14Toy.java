package dacclass.assignment.apr7constructorandstatic;

public class Q14Toy {
    public static void main(String[] args) {
        Toy.madein = "india";
        Toy toy = new Toy("Car", "₹25");
        ElectronicToy electronicToy = new ElectronicToy("XS12", toy);
        electronicToy.printAll();
    }
}


class Toy {
    String toyname, price;
    static String madein;

    public Toy(String toyname, String price) {
        this.toyname = toyname;
        this.price = price;
    }

    public Toy() {
    }

    void display() {
        System.out.println("toy name - " + toyname);
        System.out.println("toy price - " + price);
    }

    static void staticdisplay() {
        System.out.println("madein - " + madein);
    }
}

class ElectronicToy {
    String modelno;
    Toy toy;

    public ElectronicToy(String modelno, Toy toy) {
        this.modelno = modelno;
        this.toy = toy;
    }

    void printAll() {
        System.out.println("modelno - " + modelno);
        toy.display();
        Toy.staticdisplay();
    }
}