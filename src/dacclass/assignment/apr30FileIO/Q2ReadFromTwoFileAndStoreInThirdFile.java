package dacclass.assignment.apr30FileIO;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Q2ReadFromTwoFileAndStoreInThirdFile {
    public static void main(String[] args) throws IOException {
        FileReader reader = null;
        FileReader reader2 = null;
        FileWriter writer = null;

        try {

            String path = "C:\\Users\\prade\\IdeaProjects\\javalearn\\src\\assignment\\apr30FileIO\\";
            String fileName = "source.txt"; // we can also entre file name using Scanner
            String fileName2 = "source2.txt"; // we can also entre file name using Scanner

            reader = new FileReader(path + fileName);
            reader2 = new FileReader(path + fileName2);
            writer = new FileWriter(path + "result.txt");

            int content;
            while ((content = reader.read()) != -1) {
                //print in console
                System.out.print((char) content);
                //write in Destination file
                writer.append((char) content);
            }
            writer.append((char) 32);
            while ((content = reader2.read()) != -1) {
                //print in console
                System.out.print((char) content);
                //write in Destination file
                writer.append((char) content);
            }

        } catch (Exception e) {
        } finally {
            if (reader != null) reader.close();
            if (reader2 != null) reader2.close();
            if (writer != null) writer.close();
        }


    }

}
