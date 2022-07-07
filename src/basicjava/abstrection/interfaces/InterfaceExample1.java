package basicjava.abstrection.interfaces;

public class InterfaceExample1 {
    public static void main(String[] args) {

        Car s=new Box();
        s.drive();
       // s.pop();
        Box b=new Box();
        b.pop();
    }
}

interface Car{
    void drive();
}
class Box implements Car{

    @Override
    public void drive() {
        System.out.println("Driving");
    }
    void pop(){
        System.out.println("POP");
    }
}