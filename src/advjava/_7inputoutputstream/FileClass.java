package advjava._7inputoutputstream;

import java.io.File;
import java.util.Scanner;

public class FileClass {
    public static void main(String[] args) {

        String path = "C:\\Users\\prade\\IdeaProjects\\javalearn\\src\\advjava\\_7inputoutputstream\\";
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter file name : ");
        String fileName1 = sc.next();

        //to file contents size
        File file=new File(path+fileName1);
        long fileContentSize=file.length();

        System.out.println(fileContentSize);


    }
}
