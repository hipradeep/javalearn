package dacclass.may.may12;

public class ThreadExample {

    public static void main(String[] args) {

        EvenThread evenThread=new EvenThread();
        evenThread.start();
        Thread oddThread= new Thread(new OddThread());
        oddThread.start();

    }
}
class EvenThread extends Thread{
    @Override
    public void run() {
        try{
            for (int i = 0; i <20 ; i++) {
                Thread.sleep(1000);
                if (i%2==0) {
                    System.out.println(i);
                }
            }
        }catch (Exception ignored){

        }
    }
}

class OddThread implements Runnable{

    @Override
    public void run() {
        try{
            for (int i = 0; i <20 ; i++) {
                Thread.sleep(1000);
                if (i%2!=0) {
                    System.out.println(i);
                }
            }
        }catch (Exception ignored){

        }
    }
}