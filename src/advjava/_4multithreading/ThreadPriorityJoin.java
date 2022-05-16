package advjava._4multithreading;

public class ThreadPriorityJoin implements Runnable {

    Thread thread;
    String name;
    int priority;

    public ThreadPriorityJoin(String name, int priority) {
        this.priority = priority;
        this.name = name;
        thread = new Thread(this);
        thread.setName(name);
        thread.setPriority(priority);
        thread.start();
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("running " + name + " with " + priority);
                Thread.sleep(500);// throws InterruptedException
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws Exception {
        ThreadPriorityJoin t1 = new ThreadPriorityJoin("Thread 1", Thread.MIN_PRIORITY);
        ThreadPriorityJoin t2 = new ThreadPriorityJoin("Thread 2", Thread.MAX_PRIORITY);
        ThreadPriorityJoin t3 = new ThreadPriorityJoin("Thread 3", Thread.NORM_PRIORITY);
        //i want first these thread complete their  task then JoinThread perform actions
        t1.thread.join();
        t2.thread.join();
        t3.thread.join();

        JoinTest j = new JoinTest();
        j.start();
    }
}

class JoinTest extends Thread {
    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("in join test ");
                Thread.sleep(500);// throws InterruptedException
            }
        } catch (Exception ignored) {
        }
    }
}


