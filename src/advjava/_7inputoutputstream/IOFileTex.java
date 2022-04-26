package advjava._7inputoutputstream;

import java.io.*;

public class IOFileTex {


    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = null;
        FileOutputStream outputStream = null;

        try {
            inputStream = new FileInputStream("C:\\Users\\prade\\IdeaProjects\\javalearn\\src\\advjava\\_7inputoutputstream\\IOFileText.java");
            outputStream = new FileOutputStream("C:\\Users\\prade\\IdeaProjects\\javalearn\\src\\advjava\\_7inputoutputstream\\IOFileText.txt");

            int content;
            while ((content = inputStream.read()) != -1) {
                outputStream.write((byte) content);
            }
        } catch (Exception ignored) {
        } finally {
            if (inputStream != null) inputStream.close();
            if (outputStream != null) outputStream.close();
        }
    }
}


class CharacterStreamClass {
    public static void main(String[] args) throws IOException {
        FileReader reader=null;
        FileWriter writer=null;
        int countVowels = 0;
        int countConsonants = 0;

        try {
            reader=new FileReader("C:\\Users\\prade\\IdeaProjects\\javalearn\\src\\advjava\\_7inputoutputstream\\source.txt");
            writer=new FileWriter("C:\\Users\\prade\\IdeaProjects\\javalearn\\src\\advjava\\_7inputoutputstream\\result.txt");

            int content;
            while ((content = reader.read()) != -1) {
                char c=(char) content;
                if (c == 'a' || c == 'A' || c == 'e' || c == 'E' || c == 'i' || c == 'I' || c == 'o' || c == 'O' || c == 'u' || c == 'U')
                    countVowels += 1;
                else countConsonants += 1;


                writer.append((char) content);
            }

        }catch (Exception e){} finally {
            if (reader !=null) reader.close();
            if (writer !=null) writer.close();
        }

        System.out.println("Vowels : " + countVowels);
        System.out.println("Consonants : " + countConsonants);
    }

}
