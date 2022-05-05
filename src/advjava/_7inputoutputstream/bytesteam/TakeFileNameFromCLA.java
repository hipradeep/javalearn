package advjava._7inputoutputstream.bytesteam;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TakeFileNameFromCLA {
    //using byte array, to store data in it them print
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream=null;

        String path = "C:\\Users\\prade\\IdeaProjects\\javalearn\\src\\advjava\\_7inputoutputstream\\";

        try{
            fileInputStream=new FileInputStream(path+args[0]);

            File file=new File(path+args[0]);
            int len= (int) file.length();

            byte[] b=new byte[len];


           fileInputStream.read(b);
            //exclude of reading char from file
           // fileInputStream.read(b, 2,10);

            for (byte c: b ) {
                System.out.print((char)c);
            }

        }catch (Exception e){

            System.out.println(e.getMessage());
        }finally {
            if (fileInputStream != null) fileInputStream.close();
        }

    }
}

 class TakeFileNameFromCLAStore {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream=null;
        FileOutputStream fileOutputStream=null;

        //set args for this sample in Edit Configuration
        String path = "C:\\Users\\prade\\IdeaProjects\\javalearn\\src\\advjava\\_7inputoutputstream\\";

        try{
            fileInputStream=new FileInputStream(path+args[0]);
            fileOutputStream=new FileOutputStream(path+"koli.txt");

            File file=new File(path+args[0]);
            int len= (int) file.length();

            byte[] b=new byte[len];

            fileInputStream.read(b);

            for (byte c: b ) {
                System.out.println((char)c);
                fileOutputStream.write(c);
            }

        }catch (Exception e){

            System.out.println(e.getMessage());
        }finally {
            if (fileInputStream != null) fileInputStream.close();
        }

    }
}

