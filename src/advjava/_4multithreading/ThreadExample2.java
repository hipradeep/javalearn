package advjava._4multithreading;

public class ThreadExample2 extends Thread {
    public void run() {
        System.out.println("running...");
    }

    public static void main(String[] args) {
        ThreadExample2 t = new ThreadExample2();
        t.run();
        System.out.println(t.getState());
    }
}
