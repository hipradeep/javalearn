package assignment.jul27;

public class Q8MergeTwoSortedLinkedList {
    Node head;

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }
    void printList()
    {
        Node temp = head;
        while (temp != null)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public void addToTheLast(Node node) {
        if (head == null) {
            head = node;
        } else {
            Node temp = head;
            while (temp.next != null)
                temp = temp.next;
            temp.next = node;
        }
    }

    static class MergeLinkedList {
        Node sortedMerge(Node headA, Node headB) {
            Node dummyNode = new Node(0);

            Node tail = dummyNode;
            while (true) {

                if (headA == null) {
                    tail.next = headB;
                    break;
                }
                if (headB == null) {
                    tail.next = headA;
                    break;
                }

                if (headA.data <= headB.data) {
                    tail.next = headA;
                    headA = headA.next;
                } else {
                    tail.next = headB;
                    headB = headB.next;
                }

                /* Advance the tail */
                tail = tail.next;
            }
            return dummyNode.next;
        }
    }

    public static void main(String[] args) {
        Q8MergeTwoSortedLinkedList l1=new Q8MergeTwoSortedLinkedList();
        l1.addToTheLast(new Node(5));
        l1.addToTheLast(new Node(12));
        l1.addToTheLast(new Node(22));
        l1.addToTheLast(new Node(32));

        Q8MergeTwoSortedLinkedList l2=new Q8MergeTwoSortedLinkedList();
        l2.addToTheLast(new Node(55));
        l2.addToTheLast(new Node(66));
        l2.addToTheLast(new Node(77));
        l2.addToTheLast(new Node(78));
        MergeLinkedList ml=new MergeLinkedList();

       l1.head= ml.sortedMerge(l1.head, l2.head);
        l1.printList();

    }
}
