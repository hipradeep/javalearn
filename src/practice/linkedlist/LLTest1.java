package practice.linkedlist;

public class LLTest1 {


    public static void main(String[] args) {
        LinkedList2 ll=new LinkedList2();
        ll.create2(new int[]{2,4,3});
        ll.display();
        Node h1=ll.getHead();
        LinkedList2 ll2=new LinkedList2();
        ll2.create2(new int[]{5,6,4});
        ll2.display();
        Node h2=ll2.getHead();
        Node h=ll.addTwoNumber(h1,h2);
        ll.displayHead(h);
    }















    public static void main1(String[] args) {


        LinkedList linkedList =new LinkedList();
        linkedList.create2(new int[]{10,20, 30, 40,50,60,70,80,90});
        linkedList.display();
        Node h=  linkedList.removeNthFromEnd(5);
        linkedList.displayHead(h);

    }


    public static void main2(String[] args) {
        LinkedList2 linkedList=new LinkedList2();
        LinkedList2 linkedList2=new LinkedList2();
         linkedList.create2(new int[]{10,20,30,40,50, 60});
        //linkedList.create2(new int[]{10});
        linkedList.display();
        Node head1= linkedList.getHead();

        linkedList2.create2(new int[]{15,25});
        linkedList2.display();

        System.out.println("Pla- "+linkedList2.isPalindrome());

        int llLength= linkedList.countLLNodes();
        System.out.println("Length of LL - "+llLength);
    }
}

