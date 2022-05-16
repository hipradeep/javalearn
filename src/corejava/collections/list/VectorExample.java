package corejava.collections.list;

import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();
        vector.add(100);
        vector.add(200);
        vector.add(300);
        vector.add(200);
        vector.addElement(400);
        vector.setElementAt(500, 1);
        vector.add(600);
        vector.add(700);



        System.out.println(vector);
        System.out.println("Default capacity is: " + vector.capacity());

        //use remove() method to delete the first occurence of an element
        System.out.println("Remove first occurrence of element 200: " + vector.remove((Integer) 200));
        System.out.println(vector);

        //Remove the element at index 4
        System.out.println("Remove element at index 4: " + vector.remove(4));
        System.out.println(vector);
        System.out.println("Default capacity is: " + vector.capacity());
    }
}
