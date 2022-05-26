package practice.javaio;

import java.io.FileReader;
import java.io.FileWriter;

public class Example2 {
    public void main(String[] args) {
        try{
            FileReader f=new FileReader(Util.path+"data.txt");
            FileWriter fw=new FileWriter(Util.path);

            int d;

            do {
                d=  f.read();
                if (d!=-1) System.out.print((char) d);

            }while (d!=-1);

            f.close();



        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
