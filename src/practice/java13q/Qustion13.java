package practice.java13q;

public class Qustion13 {

    synchronized  public static void main(String args[]) {


        new MyThread();
        try {
            for (int k = 0; k < 6; k++) {
                System.out.println("Main thread is Running" + k+"\n");
                Thread.sleep(20);
            }
        } catch (InterruptedException e) {
        }
        System.out.println("Main thread is Exiting ");
    }
}
class MyThread extends Thread {
    MyThread() {
        super("Thread class");
        System.out.println("Child thread:" + this);

        start();
    }

    public void run() {
        try {
            for (int i = 0; i < 6; i++) {
                System.out.println("Child thread" + i+"\n");
                Thread.sleep(20);
            }
        } catch (InterruptedException e) {
        }
        System.out.println("Child thread is Exiting");
    }
}
