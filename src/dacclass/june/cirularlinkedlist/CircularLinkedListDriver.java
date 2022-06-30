package dacclass.june.cirularlinkedlist;

public class CircularLinkedListDriver {
    public static void main(String[] args) {
        CircularLinkedList cl=new CircularLinkedList();
      //  cl.createCircularLL(5);
        int[] arr = {10, 2, 15, 20, 33, 45};
        cl.createCLL(arr);
     cl.display();
        cl.insertAtLast(11);
        cl.display();
        cl.insertAtBeginning(22);
        cl.display();

        cl.insertAtPosition(2, 33);
        cl.display();

        cl.insertAtIndex(2, 30);
        cl.display();
//        cl.removeFromPosition(4);
//        cl.display();
//        cl.removeAtBeginning();
//        cl.display();
//        cl.removeFromEnd();
//        cl.display();
    }
}
// circular