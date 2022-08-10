package corejava.collections.list;

import java.util.*;

public class ArrayListIterationExample {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<String>();
        list1.add("Mango");
        list1.add("Apple");
        list1.add("Banana");
        list1.add("Grapes");

        //Collections.sort(list1);

        Iterator<String> itr = list1.listIterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        System.out.println(list1);

        ListIterator<String> listItr = list1.listIterator();
        System.out.println("Forward Direction Iteration:");
        while (listItr.hasNext()) {
            System.out.println(listItr.next());
        }


        System.out.println("Backward Direction Iteration:");
        while (listItr.hasPrevious()) {
            System.out.println(listItr.previous());
        }
    }
}
