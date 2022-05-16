package corejava.collections.set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        hs.add("One");
        hs.add("Two");
        hs.add("Three");
        hs.add("Four");
        hs.add("Four");
        hs.add("Five");
        hs.add("Six"); //no duplicate
        hs.add(null);
        hs.add(null);//only one null
        Iterator<String> i = hs.iterator();

        while (i.hasNext()) {
            System.out.println(i.next());
        }

        hs.removeIf(str->str.contains("Three"));

        HashSet<String> set1=new HashSet<String>();
        set1.add("One");
        set1.add("Five");
        hs.addAll(set1);
        System.out.println("Updated List: "+hs);
        //Removing all the new elements from HashSet
        hs.removeAll(set1);
    }
}