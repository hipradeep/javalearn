package dacclass.june.cirularlinkedlist;

public class Node {
    private final int item;
    private Node next;

    Node(int item) {
        this.item = item;
        this.next = null;
    }

    public int getItem() {
        return item;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
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

