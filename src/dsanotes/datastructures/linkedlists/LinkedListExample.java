package dsanotes.datastructures.linkedlists;

public class LinkedListExample {
    public static void main(String[] args) throws Exception {
        LinkedList ll = new LinkedList();
        ll.insertBeginning(5); //ll.insertEnd(5) also will work well here.
//        ll.insertEnd(6);
//        ll.insertBeginning(4);
//        ll.insertEnd(8);
//        Node t = ll.findNode(8);
//        ll.insertBefore(t, 7);
//        t = ll.findNode(4);
//        ll.insertBefore(t, 3);
//        t = ll.findNode(6);
//        ll.insertAfter(t, 61);
//        t = ll.findNode(8);
//        ll.insertAfter(t, 9);
//
//        ll.traverse();
//        System.out.println("Deletion Starts");
//        t = ll.findNode(61);
//        ll.delete(t);
//        ll.delBeginning(); //Deletes 3
//        ll.delEnd(); //Deletes 9;
//        t = ll.findNode(5);
//        ll.delAfter(t);
//        t = ll.findNode(7);
//        ll.delBefore(t);
//        ll.delBefore(t);
//        ll.delAfter(t);
//        ll.delBeginning(); //Try with ll.delEnd();
//        ll.traverse();
    }

}

class LinkedList {

    Node head; //First element in Linked list
    Node tail; //Last element in linked list

    public LinkedList() {
        head = tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void insertBeginning(int item) {
        /* Case 1: When the list is empty - when both head and tail are null;
         * Case 2: When the list is already having one or many nodes
         */
        Node temp = new Node(item); //Create New node;
        temp.setNext(head); //Always you need to insert before the head node;
        head = temp; //New node becomes the head node;
        if (tail == null)
            tail = head; //This newly inserted node is the only node in the list - Case 1;

    }

    public void insertEnd(int item) {
        /* Case 1: When the list is empty
         * Case 2: When the list is already having one or many nodes
         */
        Node temp = new Node(item); //Create new node
        temp.setNext(null); //Set the new node to refer to whatever tail's next is currently referring to
        if (tail != null)
            tail.setNext(temp); //Set the current tail node's next to refer to this new node;
        if (tail == null)
            head = tail = temp; //list is empty; so need to reset both head and tail
        else
            tail = temp; //Tail has to be reset to this new node;
    }

    public void insertAfter(Node p, int item) {
        Node temp = new Node(item); //Create new node
        temp.setNext(p.getNext()); //Make next of new node refer to what 'p' is currently referring to

        p.setNext(temp); //Set 'p's next node refer to the new node;
        if (tail == p) tail = temp; //Case: What if p was the tail node ? - Newly inserted node is the last node;

    }

    public void insertBefore(Node p, int item) {

        //Find the node previous to P.
        Node prev = findPreviousNode(p);

        Node temp = new Node(item); //Create New Node
        temp.setNext(p); //Make the new node refer to 'p'
        if (prev != null)
            prev.setNext(temp); //Reset the next of 'prev' node to the new node
        else
            head = temp; //Trying to insert the new node before the current head    node;

    }

    public void delBeginning() {
        if (!isEmpty()) { // If list is empty then nothing to delete;
            if (head == tail) // Only one node is there in the list;
                tail = tail.getNext(); //resetting the tail to null; You can also write as tail = null;

            head = head.getNext(); //resetting the head to the next node;
        }
    }

    public void delEnd() {
        if (!isEmpty()) { // If list is empty then nothing to delete;

            Node prev = findPreviousNode(tail);
            if (prev == null) { //only one node is there in the list - both head and tail are referring to same node
                head = head.getNext();
                tail = tail.getNext();
                //head=tail=null;
            } else {
                prev.setNext(tail.getNext()); //Reset the reference of previous node to null or to the reference in the last node

                tail = prev; //reset the tail to refer to the last node but previous node
            }
        }
    }

    public void delete(Node n) {
        if (!isEmpty()) {

            if (head == tail) //Only one node is there;
                head = tail = null;

            //Node could be head node or tail node or intermediary node;
            Node prev = findPreviousNode(n);
            if (prev == null)
                head = head.getNext();
            else
                prev.setNext(n.getNext());

            if (n == tail)
                tail = prev;
        }
    }

    public void delAfter(Node n) throws Exception {
        Node temp = n.getNext(); //Find out what Node n's next is referring to
        if (temp == null) throw new Exception("No node after the given node");
        else {
            if (temp == tail)
                tail = n;
            n.setNext(temp.getNext());
        }
    }

    public void delBefore(Node n) throws Exception {
        Node prev1 = findPreviousNode(n); //Find the previous node of 'n' - as prev1 - the node to be deleted.

        if (prev1 == null) throw new Exception("Nothing to delete before this node");

        Node prev2 = findPreviousNode(prev1);
        if (prev2 == null) {
            //prev1 is the head node; so reset head to its next node;
            head = head.getNext(); //head = n;
        } else {
            prev2.setNext(n); //Reset the next of prev2 to n; prev1 is by-passed -no references are there;

        }

    }

    Node findPreviousNode(Node ref) {
        Node prev = null;
        Node curr = head;

        while (curr != null) {
            if (curr == ref) break; //We have found the node;
            else {
                prev = curr;
                curr = curr.getNext();
            }
        }
        return prev;
    }

    Node findNode(int x) throws Exception {
        if (!isEmpty()) {
            Node tmp = head;
            do {
                if (tmp.getItem() == x) return tmp;
                else tmp = tmp.getNext();
            } while (tmp != null);
            throw new Exception("Node Not Found");
        } else
            throw new Exception("List is Empty");
    }

    public void traverse() {
        if (!isEmpty()) {
            Node tmp = head;
            do {
                System.out.println(tmp.getItem());
                tmp = tmp.getNext();
            } while (tmp != null);
        } else
            System.out.println("List is Empty");
    }

    static class Node {
        private final int item; //Data item
        private Node next; //Reference to the next node

        public Node(int item) {
            this.item = item;
            this.next = null;
        }

        public Node(int item, Node next) {
            this.item = item;
            this.next = next; //Refer to the 'next' node that was passed to this method
        }

        public Node getNext() {
            return next;
        }

        public int getItem() {
            return item;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }
}

