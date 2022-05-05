package advjava._7inputoutputstream.characterStream;

import java.io.FileReader;
import java.io.IOException;

public class CountWords {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\prade\\IdeaProjects\\javalearn\\src\\advjava\\_7inputoutputstream\\";
        String fileName = "source.txt";
        FileReader fileReader=null;

        try{
            fileReader=new FileReader(path+fileName);
            int y;
            int count=0;
            do {
                 y =fileReader.read();
                 if (y==32) count++;   //space=32
            }while (y!=-1);

            System.out.println(count+1);

        }catch (Exception e){

        }finally {
            if (fileReader!=null) fileReader.close();
        }


    }
}
