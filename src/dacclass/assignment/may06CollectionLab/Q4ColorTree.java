package dacclass.assignment.may06CollectionLab;

import java.util.Iterator;
import java.util.TreeSet;

public class Q4ColorTree {
    //Q 5 Write a Java program to create a new tree set, add some colors (string) and print out the tree set.
    public static void main(String[] args) {
        TreeSet<String> colorTree=new TreeSet<>();
        colorTree.add("red");
        colorTree.add("green");
        colorTree.add("blue");
        colorTree.add("yello");

        Iterator<String> itr=colorTree.iterator();
        while (itr.hasNext()) System.out.println(itr.next());

    }
}
