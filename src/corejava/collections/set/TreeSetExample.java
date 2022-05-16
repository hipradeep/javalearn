package corejava.collections.set;

import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {

        TreeSet<String> tr=new TreeSet<>();
        tr.add("Apple");
        tr.add("Dog");
        tr.add("Boy");
        tr.add("Cat");
        tr.add("Cat");
        //tr.add(null);

        System.out.println(tr);
    }
}

