package assignment.may06CollectionLab;

import java.util.Iterator;
import java.util.Vector;

public class Q2VectorExample {
    //Q 2 write a program to create vector of string and add elements to vector
    //check vector class main functions like
    //1)adding elements in vector
    //2)traversing all vector elements
    //3)print vector object hashcode
    //4)get particular element value usin get function
    //5)print size and capacity of vector
    //6)add null data in vector
    //7)print index valueof null elements
    //hint v.indexOf(null)
    //8)add element at particular postition
    //hint
    //v.insertElementAt("",5);
    //9)remove particular element from vector
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("one");
        vector.add("two");
        vector.add("three");
        vector.add("four");
        vector.addElement("five");
        vector.setElementAt("six", 1);
        vector.add("seven");
        vector.add("eight");

        Iterator<String> itr = vector.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
            System.out.println(itr.hashCode());
        }
        // get the element at index 4
        System.out.println(" element at index 4: " + vector.get(4));
        //adding null

        System.out.println("Default capacity is: " + vector.capacity()); //10

        vector.add(null);

        System.out.println("index of null obj : " + vector.indexOf(null));

        // adding the element at index 5
        System.out.println(" element at index 5: " );
        vector.insertElementAt("eleven", 5);

        //use remove() method to delete the first occurence of an element
        System.out.println("Remove first occurrence of element 200: "+vector.remove("two"));

        System.out.println(vector);
    }
}
