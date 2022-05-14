package corejava.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListExample2 {
    public static void main(String[] args) {
        ArrayList<String> al=new ArrayList<>();
        al.add("pradeep");
        al.add("maurya");
        al.add("raju");
        al.add("sanju");
        System.out.println("Initial list : "+ al);

        //add element by position
        al.set(0, "Kaju Seth"); //replace element at index '0'
        System.out.println("Updated list : "+ al);

        System.out.println("Element at index 1 : "+ al.get(1));

        System.out.println("Traversing through Iterator");
        Iterator itr=al.iterator();
        while(itr.hasNext()){
            //printing the element and move to next
            System.out.println(itr.next());
        }
        System.out.println("Traversing list through forEachRemaining() method");
        Iterator<String> iterator=al.iterator();
        iterator.forEachRemaining(a-> { System.out.println(a); });

        System.out.println("Traversing through ListIterator");
        ListIterator<String> lItr=al.listIterator();
        while (lItr.hasNext()) System.out.println(lItr.next());

        System.out.println("Sorting the list");
        Collections.sort(al);
        for(String str:al)
            System.out.println(str);

    }
}
