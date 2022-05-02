package practice.java13q;

public class GarbageCollectorExample {
    //finalize() method is a protected and non-static method of java.lang.Object class.
    // This method will be available in all objects you create in java.
    // This method is used to perform some final operations or clean up
    // operations on an object before it is removed from the memory.
    // you can override the finalize() method to keep those operations you want to perform before an
    // object is destroyed. Here is the general form of finalize() method.
    public static void main(String[] args) {

        GarbageCollectorExample g = new GarbageCollectorExample();

        try {

            g.finalize();

        } catch (Throwable e) {

        }

    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("From Finalize Method");
        super.finalize();
    }
}
