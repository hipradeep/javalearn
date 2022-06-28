package dacclass.june.singlylinkedlist;

public class SingleLinkedListDriver {
    public static void main(String[] args) {

        SinglyLinkedList2 ll = new SinglyLinkedList2();
        ll.printSizeOfLinkedList();
        ll.createLinkedList(3);
        ll.printSizeOfLinkedList();
        ll.display();
//        ll.insertNodeAtBeginning( 10);
//        ll.display();
//        ll.insertNodeAtEnd( 20);
//        ll.display();
//        ll.insertAfterANode(4, 30);
//        ll.display();
//        ll.insertBeforeANode(6, 40);
//        ll.display();
//        ll.printSizeOfLinkedList();
//        ll.insertNodeAtIndex(2,55);
//        ll.display();
//        ll.insertNodeAtPosition(2,22);
//        ll.display();

//        ll.deleteNodeAtBeginning();
//        ll.display();
//        ll.deleteNodeAtEnd();
//        ll.display();

        ll.deleteBeforeANode(4);
        ll.display();


    }

    private static void singlyLinkedList1() {
        SinglyLinkedList1 linkedList = new SinglyLinkedList1();
        linkedList.createLinkedList(6);
        linkedList.display();
        linkedList.insertAtBeginning(6);
        System.out.println("");
        linkedList.display();

        linkedList.insertAtEnd(8);
        System.out.println("");
        linkedList.display();

        linkedList.insertAfter(2, 10);
        System.out.println("");
        linkedList.display();

        linkedList.insertBefore(4, 12);
        System.out.println("");
        linkedList.display();

        linkedList.insertAtPosition(4, 15);
        System.out.println("");
        linkedList.display();

        linkedList.searching(4);

        linkedList.removeFirst();
        linkedList.display();

        linkedList.removeLast();

        linkedList.display();

        linkedList.removebydata(4);
        linkedList.display();
    }
}

