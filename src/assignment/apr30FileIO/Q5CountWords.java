package assignment.apr30FileIO;

import java.io.FileInputStream;

public class Q5CountWords {

    public static void main(String[] args) {
        String path="C:\\Users\\prade\\IdeaProjects\\javalearn\\src\\assignment\\apr30FileIO\\";
        String fileName="source.txt";

        try {
            FileInputStream fileInputStream=new FileInputStream(path+fileName);
            int count =1;
            int z;
            do {
                 z=fileInputStream.read();
                 if (z==32) count++;

            }while (z!=-1);

            System.out.println("Total words is "+count);
            fileInputStream.close();

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
