package practice.java13q;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadWriteImageText {

    public static void main(String[] args) throws IOException {

        readWriteText();
        readWriteImage();


    }

    private static void readWriteImage() {
        int width = 963;
        int height = 640;
        BufferedImage image = null;
        try {
            File input_file = new File(
                    "C:\\Users\\prade\\IdeaProjects\\javalearn\\src\\advjava\\_7inputoutputstream\\image.png");

            image = new BufferedImage(
                    width, height, BufferedImage.TYPE_INT_ARGB);

            image = ImageIO.read(input_file);

            System.out.println("Reading complete.");
        }
        catch (IOException e) {
            System.out.println("Error: " + e);
        }
        try {

            File output_file = new File(
                    "C:\\Users\\prade\\IdeaProjects\\javalearn\\src\\advjava\\_7inputoutputstream\\imagewrite.png");

            ImageIO.write(image, "png", output_file);

            System.out.println("Writing complete.");
        }
        catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }

    private static void readWriteText() throws IOException {
        FileReader reader=null;
        FileWriter writer=null;


        try {
            reader=new FileReader("C:\\Users\\prade\\IdeaProjects\\javalearn\\src\\advjava\\_7inputoutputstream\\source.txt");
            writer=new FileWriter("C:\\Users\\prade\\IdeaProjects\\javalearn\\src\\advjava\\_7inputoutputstream\\result.txt");

            int content;
            while ((content = reader.read()) != -1) {
                char c=(char) content;
                writer.append((char) content);
            }

        }catch (Exception e){} finally {
            if (reader !=null) reader.close();
            if (writer !=null) writer.close();
        }
    }
}
