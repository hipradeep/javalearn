package dacclass.assignment.may13Multithreading;

import java.io.FileReader;

public class Q2ReadFile {
    public static void main(String[] args) throws InterruptedException {

        ReadText1 r1 = new ReadText1();
        r1.start();
        r1.join();
        Thread r2 = new Thread(new ReadText2());
        r2.start();
    }

    public static void readFile(String file) {
        FileReader reader = null;

        String path = "C:\\Users\\prade\\IdeaProjects\\javalearn\\src\\assignment\\may13Multithreading\\";
        String fileName = file;
        try {
            reader = new FileReader(path + fileName);
            int content;
            while ((content = reader.read()) != -1) {
                Thread.sleep(1000);
                System.out.print((char) content);
            }
            reader.close();

        } catch (Exception e) {
        }
    }
}

class ReadText1 extends Thread {

    @Override
    public void run() {
        Q2ReadFile.readFile("f1.txt");

    }

}

class ReadText2 implements Runnable {
    @Override
    public void run() {

        Q2ReadFile.readFile("f2.txt");
    }

}