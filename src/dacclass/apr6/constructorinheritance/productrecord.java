package dacclass.apr6.constructorinheritance;

// in case if i want to call base class parameterized constructor
class xyz {
    xyz(int y) {
        System.out.println("xyz with argumnet");
    }

}

class product extends xyz {
    product(int y) {
        super(y);
        System.out.println("product class");
    }
}

public class productrecord extends product {

    productrecord(int y) {
        super(y);// call base class parameterized constructor
        //super() must be first statement in constructor
        System.out.println("productrecord partameter");
    }

    public static void main(String[] args) {

        productrecord r = new productrecord(33);
    }

}
