package practice.java13q;


public class ThreadExample {

    public static void main(String[] args) {
        for (int i = 0; i <10; i++) {
            Thread1 t=new Thread1();
            t.start();
            Thread t2=new Thread(new Thread2());
            t2.start();
        }

    }
}

class Thread1 extends Thread{
    @Override
    public void run() {
        System.out.println("Running....");
    }
}

class Thread2 implements Runnable{

    @Override
    public void run() {
        System.out.println("2 Running....");
    }
}
