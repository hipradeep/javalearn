package advjava._7inputoutputstream.characterStream;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CharacterStreamExample {
    public static void main(String[] args) throws IOException {
        FileReader reader = null;
        FileWriter writer = null;

        try {

            String path = "C:\\Users\\prade\\IdeaProjects\\javalearn\\src\\advjava\\_7inputoutputstream\\";
            String fileName = "source.txt";
            // we can also entre file name using Scanner
            Scanner sc = new Scanner(System.in);
            //System.out.print("Enter file name : ");
            //String fileName1 = sc.next();
            reader = new FileReader(path + fileName);
            writer = new FileWriter(path + "result.txt");

            //to file contents size
            File file=new File(path+fileName);
            int fileContentSize=(int)file.length();

            char[] ch = new char[fileContentSize];

            reader.read(ch);

            System.out.println(ch);
            //this will give white spaces if no char found in array


        } catch (Exception e) {
        } finally {
            if (reader != null) reader.close();
            if (writer != null) writer.close();
        }
    }
}
