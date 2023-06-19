package practice.linkedlist;

public class LLTest1 {
    public static void main(String[] args) {
        LinkedList2 linkedList=new LinkedList2();
        LinkedList2 linkedList2=new LinkedList2();
         linkedList.create2(new int[]{10,20,30,40,50, 60});
        //linkedList.create2(new int[]{10});
        linkedList.display();
        Node head1= linkedList.getHead();

        linkedList2.create2(new int[]{15,25,15,45,60,45,15,25,15});
        linkedList2.display();

        System.out.println("Pla- "+linkedList2.isPalindrome());





        int llLength= linkedList.countLLNodes();
        System.out.println("Length of LL - "+llLength);
    }
}

