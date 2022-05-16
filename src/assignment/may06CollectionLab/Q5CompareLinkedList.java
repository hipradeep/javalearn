package assignment.may06CollectionLab;

import java.util.LinkedList;

public class Q5CompareLinkedList {
    //  Q 6 Write a Java program to compare two linked lists.
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();
        list.add(30);
        list.add(32);
        list.add(31);


        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(40);
        list2.add(21);
        list2.add(31);

        LinkedList<String> list3 = new LinkedList<String>();
        for (Integer e : list)
            list3.add(list2.contains(e) ? "Yes" : "No");
        System.out.println(list3);
    }
}
