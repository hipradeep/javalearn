package practice;

public class OverridingExample extends Car{
    //12.Write a program to give the example for method overridingconcepts.

    @Override
    public void color() {
        System.out.println("Green");
    }

    public static void main(String[] args) {
        OverridingExample o=new OverridingExample();
        o.color();
        Car car=new Car();
        car.color();
    }
}

class Car{
    public void color(){
        System.out.println("Red");
    }
}
