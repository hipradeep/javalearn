package practice.javanew;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Pradeep {

    public static void main(String[] args) {
//        List<int> list=new ArrayList<>();
//        List<Double> liset=new LinkedList<>();
//        System.out.println(list.getClass());
//        System.out.println(liset.getClass());
        StringBuilder str= new StringBuilder();

        for (char i = 'a'; i <='d' ; i++) {
            str.append((char) (i + 1));
        }
        System.out.println(str);
    }
}
