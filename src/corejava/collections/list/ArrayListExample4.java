package corejava.collections.list;

import java.util.ArrayList;

public class ArrayListExample4 {
    public static void main(String[] args) {
        ArrayList<Integer> list1=new ArrayList<>(2);
        list1.add(45);
        list1.add(50);

        ArrayList<Integer> list2=new ArrayList<>(list1);
        list2.add(22);

        System.out.println(list2);
    }
}
