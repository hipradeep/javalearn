package dacclass.april.apr30;

import java.io.FileInputStream;
import java.io.FileReader;

public class Q5CountWordsInFile {

    public static void main(String[] args) throws Exception {
        FileInputStream inputStream = null;
        try{
            FileReader fileReader=new FileReader("src/dacclass/apr30/ReadFrom.txt");
            inputStream = new FileInputStream("C:\\Users\\prade\\IdeaProjects\\javalearn\\src\\dacclass\\apr30\\ReadFrom.txt");

            int count=0;
            int content;
            while ((content = inputStream.read()) != -1) {
                System.out.println((char)content);
                if (content==32) count+=1;
            }


            System.out.println("Total words is : "+(count+1));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            if (inputStream != null) inputStream.close();
        }

    }
}
