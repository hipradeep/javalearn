package corejava.relationships;

// Java Program to Illustrate has-a relation
public class Relationship_HAS_A {
    public static void main(String[] args) {
        // Creating an object of Car class
        Car nano = new Car();

        // Assigning car object color
        nano.setColor("RED");

        // Assigning car object speed
        nano.setMaxSpeed(329);

        // Calling carInfo() over object of Car class
        nano.carInfo();

        // Creating an object of Maserati class
        Maserati quattroporte = new Maserati();

        // Calling MaseratiStartDemo() over
        // object of Maserati class
        quattroporte.MaseratiStartDemo();
    }

}

// Parent class
class Car {

    // Instance members of class Car
    private String color;
    private int maxSpeed;

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void carInfo() {
        System.out.println("Car Color= " + color
                + " Max Speed= " + maxSpeed);
    }
}

// Child class
// Helper class
class Maserati extends Car {

    public void MaseratiStartDemo() {
        Engine MaseratiEngine = new Engine();
        MaseratiEngine.start();
        MaseratiEngine.stop();
    }
}

// Helper class
class Engine {

    public void start() {
        System.out.println("Started:");
    }

    public void stop() {
        System.out.println("Stopped:");
    }
}
