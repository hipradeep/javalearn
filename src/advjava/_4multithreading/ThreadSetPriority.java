package advjava._4multithreading;

public class ThreadSetPriority implements Runnable {

    Thread thread;
    public ThreadSetPriority(int p) {
        thread=new Thread();
        thread.setPriority(p);
        thread.start();
    }

    @Override
    public void run() {
        System.out.println("running");
    }

    public static void main(String[] args) {
        ThreadSetPriority t1=new ThreadSetPriority(Thread.MAX_PRIORITY);
        ThreadSetPriority t2=new ThreadSetPriority(Thread.MAX_PRIORITY);
        ThreadSetPriority t3=new ThreadSetPriority(Thread.NORM_PRIORITY);

    }
}
