import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;

public class Hello {

    public static void main(String[] args) throws IOException, ExecutionException, InterruptedException {
//        FileOutputStream fos = new FileOutputStream ("output.txt");
//        String data = "Learning";
//        fos.write(data.getBytes());
//
//        fos.close();
//
//        fos = new FileOutputStream ("output.txt");
//        data =" Java is really fun!";
//        fos.write(data.getBytes());
//        fos.close();

                Object obj1 = new Object();
                Object obj2= new Object();

                var service = Executors.newFixedThreadPool(3);
                var future1 = service.submit(() -> {
                    synchronized (obj1) {
                        synchronized (obj2) {
                            System.out.print("Hi");
                        }
                    }
                });

                var future2= service.submit(()  -> {
                    synchronized (obj2) {
                        synchronized (obj1) {
                            System.out.print("Bye");

                        }
                    }

                });

                future1.get();
                future2.get();
            }

        }

