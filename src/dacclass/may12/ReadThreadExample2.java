package dacclass.may12;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReadThreadExample2 {

    public static void main(String[] args) {
        ReadText1 r1=new ReadText1();
        r1.start();
        Thread r2=new Thread(new ReadText2());
        r2.start();

    }
}


class ReadText1 extends Thread{
    FileReader reader=null;

    String path="C:\\Users\\prade\\IdeaProjects\\javalearn\\src\\dacclass\\may12\\";
    String fileName="f1.txt";
    @Override
    public void run()  {

            try {
                reader=new FileReader(path+fileName);
                int content;
                while ((content = reader.read()) != -1) {
                    Thread.sleep(1000);
                    System.out.print((char) content);

                }
                reader.close();

            }catch (Exception e){}

    }

}

class ReadText2 implements Runnable {
    FileReader reader=null;

    String path="C:\\Users\\prade\\IdeaProjects\\javalearn\\src\\dacclass\\may12\\";
    String fileName="f2.txt";
    @Override
    public void run()  {

        try {
            reader=new FileReader(path+fileName);
            int content;
            while ((content = reader.read()) != -1) {
                Thread.sleep(1000);
                System.out.print((char) content);

            }
            reader.close();

        }catch (Exception e){}
    }


}
