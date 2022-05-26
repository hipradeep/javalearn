package practice.javaio;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Example1 {
    public static void main(String[] args) {
        try {

            FileInputStream f = new FileInputStream(Util.path + "data.txt");
            FileOutputStream o = new FileOutputStream(Util.path + "data2.txt");
            FileInputStream oread = new FileInputStream(Util.path + "data2.txt");

            int d;
            do {
                d = f.read();
                if (d != -1){
                    System.out.print((char) d);
                    o.write(d);
                }

            } while (d != -1);

            f.close();
            o.close();
            System.out.println();
            int k;
            do {
                k = oread.read();
                if (k != -1){
                    System.out.print((char) k);

                }

            } while (k != -1);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

class Util {
    public static String path = "C:\\Users\\prade\\IdeaProjects\\javalearn\\src\\practice\\javaio\\";
}
