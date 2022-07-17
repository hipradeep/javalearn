package dsanotes.datastructures.linkedlists.circular;


public class CircularLinkedList {

    private Node head, tail;
    private int count;


    private class Node {
        private final int item;
        private Node next;

        Node(int item) {
            this.item = item;
            this.next = null;
        }
    }

    void insertAtFirst(int item) {
        Node t = new Node(item);
        if (head == null) {
            head = t;
            tail = t;
        } else {
            t.next = head;
            head = t;
            tail.next = head;
        }
        count++;
    }

    void insertAtLast(int item) {
        Node t = new Node(item);
        if (head == null) {
            head = t;
            tail = t;
        } else {
            tail.next = t;
            tail = t;
            tail.next = head;
        }
        count++;
    }

    public void delete(int val) {
        Node node = head;
        if (node == null) {
            return;
        }

        if (head == tail){
            head = null;
            tail = null;
            return;
        }

        if (node.item == val) {
            head = head.next;
            tail.next = head;
            return;
        }

        do {
            Node n = node.next;
            if (n.item == val) {
                node.next = n.next;
                break;
            }
            node = node.next;
        } while (node != head);

    }
    void display() {
        if (head == null) {
            System.out.println("List empty!");
            return;
        }

        Node r = head;
        //first print head, then check r==head second times
        do {
            if (r.next!=head)
            System.out.print(r.item + " <-> ");
            else  System.out.print(r.item + "");
            r = r.next;
        } while (r != head);
        System.out.println("");
    }

    public static void main(String[] args) {
        CircularLinkedList cl = new CircularLinkedList();
        cl.insertAtFirst(10);
        cl.insertAtFirst(20);
        cl.insertAtFirst(30);
        cl.insertAtFirst(40);
        cl.display();
        cl.insertAtLast(11);
        cl.insertAtLast(12);
        cl.insertAtLast(13);
        cl.display();
        cl.delete(12);
        cl.display();
        cl.delete(30);
        cl.display();
    }

}
