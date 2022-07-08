package dsanotes.datastructures.linkedlists.singly;

import java.util.Scanner;

//with size variable
public class SinglyLinkedList {
    private Node head;
    private int size;

    private static class Node {
        private int item;
        private Node next;

        public Node(int item) {
            this.item = item;
            this.next = null;
        }

        public Node(int item, Node next) {
            this.item = item;
            this.next = next;
        }
    }

    //size of Linked List
    int getLengthOfLinkedList() {
        return size;
    }

    //createLinkedList of n Node
    void createLinkedList(int n) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("Enter data for node " + (i + 1) + " : ");
            Node t = new Node(sc.nextInt());
            if (i == 0) {
                head = t;
            } else {
                Node r = head;
                while (r.next != null) {
                    r = r.next;
                }
                r.next = t;
            }
            size += 1;
        }

    }

    //create linked list using array
    void createLL(int[] arr) {
        for (int a : arr) {
            Node t = new Node(a);
            if (head == null) head = t;
            else {
                Node r = head;
                while (r.next != null) {
                    r = r.next;
                }
                r.next = t;
            }
            size++;
        }
    }

    //insert at start
    void insertAtStart(int item) {
        Node t = new Node(item);
        if (head != null) {
            t.next = head;
        }
        head = t;
        size++;
    }

    //insert at end
    void insertAtEnd(int item) {
        Node t = new Node(item);
        if (head == null) {
            head = t;
            return;
        }
        Node r = head;
        while (r.next != null) {
            r = r.next;
        }
        r.next = t;
        size++;
    }

    //insert after 1
    void insertAfter1(int after, int item) {
        Node t = new Node(item);
        Node r = head;
        while ( r!=null &&  r.item != after) {
            r = r.next;
        }
        if (r == null) {
            System.out.println(after + " not found");
            return;
        }
        t.next=r.next;
        r.next=t;
        size++;

    }

    //insert after 2
    void insertAfter2(int after, int item) {
        Node p = getNode(after);

        if (p == null) {
            System.out.println("does not exist");
            return;
        }
        Node t = new Node(item);
        t.next = p.next;
        p.next = t;
        size++;
    }

    //insert before
    void insertBefore(int before, int item){

    }

    public Node getNode(int item) {
        Node r=head;
        while (r!=null){
            if (r.item==item) return r;
            r=r.next;
        }
        return null;
    }

//    void insertBefore(int before, int item) {
//       Node t = new Node(item);
//        if (head == null) {
//            head = t;
//        } else {
//            Node r = head;
//            while (r.getNext() != null && r.getNext().getItem() != before) {
//                r = r.getNext();
//            }
//            t.setNext(r.getNext());
//            r.setNext(t);
//        }
//    }

    //display all nodes
    void display() {
        if (head == null) {
            System.out.println("list is empty");
        } else {
            Node r = head;
            while (r != null) {
                if (r.next == null) System.out.print(r.item);
                else System.out.print(r.item + " -> ");
                r = r.next;
            }
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        SinglyLinkedList ll = new SinglyLinkedList();
        ll.createLL(new int[]{10, 20, 30});
        ll.display();
        ll.insertAtStart(11);
        ll.display();
        ll.insertAtEnd(12);
        ll.display();
        ll.insertAfter1(20, 13);
        ll.insertAfter2(12, 14);
        ll.display();
    }

}

/* SingleLinked List
 *
 *   - createLinkedList of n Node
 *   - display All Nodes of LinkedList
 *
 *   - check LinkedList is empty or not
 *   - count the nodes(length) of LinkedList
 *
 *   - insertElement at beginning
 *   - insertElement at end
 *   - insertElement before of a Node
 *   - insertElement after of a Node
 *   - insertElement at particular position(index)
 *
 *   - deleteElement at beginning
 *   - deleteElement at end
 *   - deleteElement before of a Node
 *   - deleteElement after of a Node
 *   - deleteElement at particular position(index)
 *
 *   - search Node in LinkedList
 *   - find position(index) of a particular Node
 *
 *   - reverse a linkedList, in O(n)
 *
 *   - find Node middle of linkedList
 *   - delete Node middle of linkedList
 *   - find nth Node from end in linkedList
 *
 *   - sort the linkedList
 *   - remove duplicate Node of sorted linkedList
 *
 *   - merge two sorted linkedList
 *   - check if a linked list is a palindrome
 *
 *   - Reverse a Linked List in group of Given Size.
 *   - Delete nodes which have a greater value on right side
 *   - Sort a linked list of 0s-1s-or-2s
 *   - Quicksort on singly-linked list
 *   - Merge sort for linked list
 *
 * */
