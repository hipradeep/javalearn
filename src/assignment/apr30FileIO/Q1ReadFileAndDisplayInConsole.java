package assignment.apr30FileIO;

import java.io.FileInputStream;

public class Q1ReadFileAndDisplayInConsole {
    public static void main(String[] args) {
        String path="C:\\Users\\prade\\IdeaProjects\\javalearn\\src\\assignment\\apr30FileIO\\";
        String fileName="source.txt";

        try {
            FileInputStream fileInputStream=new FileInputStream(path+fileName);

            int z ;

            while ((z = fileInputStream.read())  != -1){

                System.out.print((char) z);
            }

            fileInputStream.close();

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
