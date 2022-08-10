package corejava.collections.list;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {

    public static void main(String[] args) {

        System.out.println("Linked List");
        LinkedList<String> ll = new LinkedList<>();
        ll.add("zeno");
        ll.add("rock");
        ll.add("maurya");
        ll.add("shyam");
        ll.add("shyam");
        ll.add(null);
        ll.add(null);
        ll.offer("key");
        ll.set(1, "pradeep"); //rock will replace by pradeep
        ll.push("hero"); //at the beginning

        System.out.println(ll);
        //peekFirst(), peekLast(), peek()
        System.out.println("Peak : " + ll.peek());

        //pollFirst(), pollLast(), poll()
        System.out.println("poll : " + ll.poll());

        System.out.println(ll);
        //removeLast
        ll.remove(1);
        ll.pop(); //remove from beginning

        System.out.println(ll);
//        System.out.println("Iterate");
        Iterator<String> itr = ll.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
