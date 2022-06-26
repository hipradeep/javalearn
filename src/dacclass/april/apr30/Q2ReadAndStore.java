package dacclass.april.apr30;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Q2ReadAndStore {
    public static void main(String[] args) throws Exception{
        FileInputStream inputStream = null;
        FileOutputStream outputStream = null;

        try {
            inputStream = new FileInputStream("C:\\Users\\prade\\IdeaProjects\\javalearn\\src\\dacclass\\apr30\\IOFileText.txt");
            outputStream = new FileOutputStream("C:\\Users\\prade\\IdeaProjects\\javalearn\\src\\dacclass\\apr30\\StoredIn.txt");

            int content;
            while ((content = inputStream.read()) != -1) {

                outputStream.write((byte) content);
            }
            inputStream = new FileInputStream("C:\\Users\\prade\\IdeaProjects\\javalearn\\src\\dacclass\\apr30\\IOFileText2.txt");

            while ((content = inputStream.read()) != -1) {

                outputStream.write((byte) content);
            }
        } catch (Exception ignored) {
        } finally {
            if (inputStream != null) inputStream.close();
            if (outputStream != null) outputStream.close();
        }
    }
}
