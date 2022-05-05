package advjava._7inputoutputstream.characterStream;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class StoreFileDataUsingCharArray {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = null;
        FileWriter fileWriter=null;

        String path = "C:\\Users\\prade\\IdeaProjects\\javalearn\\src\\advjava\\_7inputoutputstream\\";

        try {
            fileReader = new FileReader(path + args[0]);
            fileWriter=new FileWriter(path+"benno.txt");

            File file = new File(path + args[0]);

            char[] chars = new char[(int) file.length()];

            fileReader.read(chars);
           // fileWriter.write(chars);

            for (char c : chars) {
                fileWriter.write(c);
                System.out.print(c);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            if (fileReader != null) fileReader.close();
            //close karna is must hai, tabi write hoga
            if (fileWriter != null) fileWriter.close();
        }


    }
}
