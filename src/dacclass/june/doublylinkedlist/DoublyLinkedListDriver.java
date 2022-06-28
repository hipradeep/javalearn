package dacclass.june.doublylinkedlist;

public class DoublyLinkedListDriver {
    public static void main(String[] args) {
        DoublyLinkedList dl=new DoublyLinkedList();
        dl.createDoublyLinkedList(1);
        dl.display();
//        dl.insertAtBeginning(55);
//        dl.display();
//        dl.insertAtEnd(30);
//        dl.display();
        dl.insertAtPosition(1, 22);
        dl.display();


    }
}
