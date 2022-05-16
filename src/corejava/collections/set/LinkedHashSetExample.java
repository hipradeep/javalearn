package corejava.collections.set;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        LinkedHashSet<String> lhs=new LinkedHashSet<>();
        lhs.add("Apple");
        lhs.add("Apple");//no duplicate
        lhs.add("Boy");
        lhs.add("Cat");
        lhs.add("Dog");
        lhs.add(null);
        lhs.add(null);//only one

        System.out.println(lhs);

    }
}
