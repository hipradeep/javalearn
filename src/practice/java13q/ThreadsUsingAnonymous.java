package practice.java13q;

public class ThreadsUsingAnonymous {
    public static void main(String... a) {

        Thread th = new Thread() {

            public synchronized void run() {
                for (int i = 0; i < 20; i++) {
                    try {

                        System.out.println(i + "\t" + ".." + Thread.currentThread().getId());
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }

            }

        };
        Thread th1 = new Thread() {

            public synchronized void run() {
                for (int i = 50; i < 70; i++) {
                    try {

                        System.out.println(i + "\t" + ".."+ Thread.currentThread().getId());
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }

            }

        };
        th.start();
        try {
            th.join();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        th1.start();
        System.out.println(th.getClass()+ " " + th.getClass().getSuperclass());
        for(int i=0;i<20;i++)
        {
            System.out.println("i am main.kotlin.main Thread");
        }


    }
}
