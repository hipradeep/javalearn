package advjava._7inputoutputstream;

import java.io.*;
import java.util.Scanner;

public class IOFileTex {
    public static void main(String[] args) throws IOException, FileNotFoundException {
        FileInputStream inputStream = null;
        FileOutputStream outputStream = null;

        try {
            inputStream = new FileInputStream("C:\\Users\\prade\\IdeaProjects\\javalearn\\src\\advjava\\_7inputoutputstream\\IOFileText.java");
            outputStream = new FileOutputStream("C:\\Users\\prade\\IdeaProjects\\javalearn\\src\\advjava\\_7inputoutputstream\\IOFileText.txt");

            int content;
            while ((content = inputStream.read()) != -1) {
                //print in console
                System.out.print((byte) content);
                //write in Destination file
                outputStream.write((byte) content);
            }
        } catch (Exception ignored) {
        } finally {
            if (inputStream != null) inputStream.close();
            if (outputStream != null) outputStream.close();
        }
    }
}


class CharacterStreamClass {
    public static void main(String[] args) throws IOException {
        FileReader reader=null;
        FileWriter writer=null;

        try {

            String path="C:\\Users\\prade\\IdeaProjects\\javalearn\\src\\advjava\\_7inputoutputstream\\";
            String fileName="source.txt"; // we can also entre file name using Scanner
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter file name : ");
            String fileName1=sc.next();
            reader=new FileReader(path+fileName1);
            writer=new FileWriter("C:\\Users\\prade\\IdeaProjects\\javalearn\\src\\advjava\\_7inputoutputstream\\result.txt");

            int content;
            while ((content = reader.read()) != -1) {
                //print in console
                System.out.print((char) content);
                //write in Destination file
                writer.append((char) content);
            }

        }catch (Exception e){} finally {
            if (reader !=null) reader.close();
            if (writer !=null) writer.close();
        }


    }

}
