package practice.linkedlist;

import java.util.HashSet;

public class LinkedListCycle extends LinkedList{
    public static void main(String[] args) {

        LinkedListCycle linkedlistCycle = new LinkedListCycle();
        linkedlistCycle.create2(new int[]{10,20,30,40,50, 60});
        Node head=linkedlistCycle.getHead();
        head.next.next.next.next = head.next;
        boolean result = linkedlistCycle.hasCycle(head);
        System.out.println(result);
        //linkedlistCycle.displayHead(head);
        boolean result2 = linkedlistCycle.hasCycleHashSet(head);
        System.out.println(result2);
       // linkedlistCycle.displayHead(head);
    }

    public boolean hasCycle(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }
        return false;
    }
    public boolean hasCycleHashSet(Node head) {

        HashSet<Node> hashSet = new HashSet<>();

        Node current = head;
        Node hasCycleNode = null;

        while (current != null) {
            if (hashSet.contains(current)) {
                hasCycleNode = current;
                removeCycle(current);
                return true;
            } else {
                hashSet.add(current);
            }
            current = current.next;
        }
        return false;
    }


    public void removeCycle(Node node) {
        Node current = node;

        while (current.next != node) {
            current = current.next;
        }
        current.next = null;
    }

}
