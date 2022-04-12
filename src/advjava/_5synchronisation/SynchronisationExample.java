package advjava._5synchronisation;

public class SynchronisationExample {
    //Synchronization in Java is the capability to control the access of multiple threads to any shared resource.
    //The synchronization is mainly used to
    //
    //To prevent thread interference.
    //To prevent consistency problem.

    public static void main(String[] args) {
        Multiple multiple=new Multiple();

        Thread1 t1=new Thread1(multiple);

        Thread t2= new Thread(new Thread2(multiple));
        t1.start();
        t2.start();

    }

}


class Thread1 extends Thread {
    Multiple m;

    public Thread1(Multiple m){
        this.m=m;
    }
    @Override
    public void run() {
        try{

            m.getMultiple(5);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}

class Thread2 implements Runnable {
    Multiple m;

    public Thread2(Multiple m) {
        this.m = m;
    }

    @Override
    public void run() {
        try{
            m.getMultiple(2);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}

class Multiple {

   // synchronized  void getMultiple(int x) {  //by doing this, getMultiple() method  ill access by only thread at time
    void getMultiple(int x) {
       //we can also make synchronized a block of code, for loop block is now synchronized
       synchronized (this) {

           for (int i = 1; i <= 5; i++) {
               System.out.println(x * i);
               try{
                   Thread.sleep(400);
               }catch (Exception e){
                   System.out.println(e.getMessage());
               }
           }
       }

    }
}
