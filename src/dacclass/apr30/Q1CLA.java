package dacclass.apr30;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Q1CLA {
    public static void main(String[] args) throws Exception{
        FileInputStream inputStream = null;

        try {
            inputStream = new FileInputStream("C:\\Users\\prade\\IdeaProjects\\javalearn\\src\\dacclass\\apr30\\IOFileText.txt");

            int content;
            while ((content = inputStream.read()) != -1) {

                System.out.println((char)content);
            }
        } catch (Exception ignored) {
        } finally {
            if (inputStream != null) inputStream.close();
        }
    }


}
