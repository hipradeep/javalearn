package dacclass.june.doublylinkedlist;

public class DNode {
    private final int item;
    private DNode prev;
    private DNode next;

    public DNode(int item) {
        this.item = item;
        this.prev = null;
        this.next = null;
    }

    public int getItem() {
        return item;
    }

    public DNode getPrev() {
        return prev;
    }

    public void setPrev(DNode prev) {
        this.prev = prev;
    }

    public DNode getNext() {
        return next;
    }

    public void setNext(DNode next) {
        this.next = next;
    }
}

/*
*   Doubly LinkedList
*
*   - createDoublyLL of n Node*
*   - display All Nodes of DoublyLL
*
*   - check DoublyLL is empty or not
*   - count the nodes(length) of DoublyLL
*
*   - insertElement at beginning
*   - insertElement at end
*   - insertElement before of a Node
*   - insertElement after of a Node
*   - insertElement at particular position(index)
*
*
*
* */