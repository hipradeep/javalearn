package advjava._4multithreading;

public class ThreadExample {
    //A thread in Java is the direction or path that is taken while a program is being executed. Generally,
    // all the programs have at least one thread, known as the main thread, that is provided by the JVM or
    // Java Virtual Machine at the starting of the program’s execution. At this point, when the main thread is provided,
    // the main() method is invoked by the main thread.
    //
    //A thread is critical in the program because it enables multiple operations to take place within a single method.
    // Each thread in the program often has its own program counter, stack, and local variable.

    //There are two-way to create threads
    //by extends the Thread class
    //by implementing Runnable interface

    public static void main(String[] args) {
        for (int i = 0; i <10; i++) {
            Thread1 t=new Thread1();
            t.start();
            Thread t2=new Thread(new Thread2());
            t2.start();
            t2.setPriority(5);

            Thread t4=new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println("4 running");
                }
            }, "Third thread");

            t4.start();
        }
    }
}

class Thread1 extends Thread{
    @Override
    public void run() {

        System.out.println("Running....");

    }
}
//there might be a case when we have to extend a class with parent class, then we can further extend Thread class,
// so we use Runnable interface
class Thread2 implements Runnable{

    @Override
    public void run() {
        System.out.println("2 Running....");
    }
}