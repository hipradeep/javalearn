import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Hello {

    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream ("output.txt");
        String data = "Learning";
        fos.write(data.getBytes());

        fos.close();

        fos = new FileOutputStream ("output.txt");
        data =" Java is really fun!";
        fos.write(data.getBytes());
        fos.close();



    }

}
