package advjava._7inputoutputstream;

import java.io.*;

public class IOStreamExample {


}

class ByteStreamClass {

    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = null;
        FileOutputStream outputStream = null;

        try {
            inputStream = new FileInputStream("C:\\Users\\prade\\IdeaProjects\\javalearn\\src\\advjava\\_7inputoutputstream\\source.txt");
            outputStream = new FileOutputStream("C:\\Users\\prade\\IdeaProjects\\javalearn\\src\\advjava\\_7inputoutputstream\\destination.txt");

            int content;
            while ((content = inputStream.read()) != -1) {
                outputStream.write((byte)content);
            }
        } catch (Exception ignored){} finally {
            if (inputStream!=null) inputStream.close();
            if (outputStream!=null) outputStream.close();
        }
    }
}

class CharacterStreamClass {
    public static void main(String[] args) throws IOException {
        FileReader reader=null;
        FileWriter writer=null;

        try {
            reader=new FileReader("C:\\Users\\prade\\IdeaProjects\\javalearn\\src\\advjava\\_7inputoutputstream\\source.txt");
            writer=new FileWriter("C:\\Users\\prade\\IdeaProjects\\javalearn\\src\\advjava\\_7inputoutputstream\\destination2.txt");

            int content;
            while ((content = reader.read()) != -1) {

                writer.append((char) content);
            }

        }catch (Exception e){} finally {
            if (reader !=null) reader.close();
            if (writer !=null) writer.close();
        }
    }

}
