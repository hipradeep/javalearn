package corejava.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListSortingExample {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<String>();
        list1.add("Mango");
        list1.add("Apple");
        list1.add("Banana");
        list1.add("Grapes");
        System.out.println(list1);
        Collections.sort(list1);
        System.out.println(list1);
    }
}
