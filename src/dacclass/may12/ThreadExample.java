package dacclass.may12;

public class ThreadExample {

    public static void main(String[] args) {

        Thread1 t1=new Thread1();
        t1.start();
        Thread t2= new Thread(new Thread2());
        t2.start();

    }
}
class Thread1 extends Thread{
    @Override
    public void run() {
        try{
            for (int i = 0; i <20 ; i++) {
                Thread.sleep(1000);
                if (i%2==0)
                System.out.println(i);
            }
        }catch (Exception e){

        }
    }
}

class Thread2 implements Runnable{

    @Override
    public void run() {
        try{
            for (int i = 0; i <20 ; i++) {
                Thread.sleep(1000);
                if (i%2!=0)
                    System.out.println(i);
            }
        }catch (Exception e){

        }
    }
}