package advjava._7inputoutputstream.bytesteam;

import java.io.BufferedInputStream;
import java.io.IOException;

public class BufferInputSteamExample {
    public static void main(String[] args) throws IOException {

        BufferedInputStream read=new BufferedInputStream(System.in);
        try {
            System.out.print("Enter any character: ");
            char c = (char)read.read();
            System.out.println("You have entered '" + c + "'");
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
        finally {
            read.close();
        }
    }
}




