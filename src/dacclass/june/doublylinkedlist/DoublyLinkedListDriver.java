package dacclass.june.doublylinkedlist;

public class DoublyLinkedListDriver {
    public static void main(String[] args) {
        DoublyLinkedList dl=new DoublyLinkedList();
        dl.createDoublyLinkedList(6);
        dl.display();
        dl.insertAtBeginning(55);
        dl.display();
        dl.insertAtEnd(30);
        dl.display();
//        dl.insertAtPosition(1, 22);
//        dl.display();
        dl.insertBeforeANode(6, 50);
        dl.display();
//        dl.insertAfterANode(6, 55);
//        dl.display();
        dl.removeFromBeginning();
        dl.display();
        dl.removeFromEnd();
        dl.display();
        dl.removeFromParticularPosition(4);
        dl.display();

    }
}
