package corejava.collections.list;

import java.util.ArrayList;
import java.util.Collection;

public class ArrayListExample4 {
    public static void main(String[] args) {
        ArrayList<String> color_list = new ArrayList<String>(4);
        color_list.add("White");
        color_list.add("Black");
        color_list.add("Red");
        color_list.add("White");
        System.out.println("New ArrayList");
        System.out.println(color_list);

        ArrayList<String> sample = new ArrayList<String>(3);
        sample.add("Yellow");
        sample.add("Red");
        sample.add("White");

        // Now add sample with color_list
        System.out.println("After adding sample list");
        color_list.addAll(sample);

        System.out.println(color_list);

        //create new ArrayList whitj the help of color_list
        //ArrayList(Collection<? extends E> c)
        System.out.println("New ArrayList");
        ArrayList<String> new_color_list = new ArrayList<String>(color_list);
        System.out.println(new_color_list);
    }
}
