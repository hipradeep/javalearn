package dacclass.assignment.may13Multithreading;

import java.io.FileReader;

public class Q3SyncThread {
    public static void main(String[] args) {
        ShowFileThread showFileThread=new ShowFileThread("f1.txt");
        ShowFileThread showFileThread2=new ShowFileThread("f2.txt");
        showFileThread.start();
        showFileThread2.start();
    }

    public synchronized static void readFile(String file) {
        FileReader reader = null;

        String path = "C:\\Users\\prade\\IdeaProjects\\javalearn\\src\\assignment\\may13Multithreading\\";
        String fileName = file;
        try {
            reader = new FileReader(path + fileName);
            int content;
            while ((content = reader.read()) != -1) {
                Thread.sleep(500);
                System.out.print((char) content);
            }
            reader.close();

        } catch (Exception e) {
        }
    }
}

class ShowFileThread extends Thread {

    String file;

    ShowFileThread(String file) {
        this.file = file;
    }

    @Override
    public void run() {
        Q3SyncThread.readFile(file);
    }
}
