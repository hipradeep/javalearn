package corejava.collections.set;

import java.util.TreeSet;

public class TreeSetExample3 {
    public static void main(String[] args) {
        TreeSet<Integer> integers = new TreeSet<>();

        integers.add(45);

        System.out.println(integers);


        TreeSet<Object> obts = new TreeSet<Object>();

        obts.add("60");
        obts.add(56);

        System.out.println(obts);


    }
}
