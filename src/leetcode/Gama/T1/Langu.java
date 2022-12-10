package leetcode.Gama.T1;

import java.io.IOException;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;
import java.util.zip.ZipFile;

public class Langu implements Python, Perl {

    @Override
    public void showDesc() {
        Python.super.showDesc();
        Perl.super.showDesc();


    }
}


class Zip {
    public static void main(String[] args) {

        List<Integer> numL= Arrays.asList(2,4, 6, 8, 10);
        boolean resu=numL.stream().noneMatch(temp-> temp*5 % 2 ==1);
        System.out.println(resu);  //true
        boolean resue2=numL.stream().noneMatch(temp-> temp*5 % 2 ==0);
        System.out.println(resue2);  //false

    }

    static void pE(PrintStream stream, String zip) {
        try (ZipFile zipFile = new ZipFile(zip)) {

            zipFile.stream().forEach(stream::println);
        } catch (IOException e) {

        }
    }
}

