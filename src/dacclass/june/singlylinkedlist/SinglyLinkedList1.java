package dacclass.june.singlylinkedlist;

import java.util.Scanner;

public class SinglyLinkedList1 {
    static Node head;
    static int count;

    public SinglyLinkedList1() {
        head = null;
        count = 0;
    }

  void createLinkedList(int n) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("enter the node value : ");
            int data = sc.nextInt();
            Node t = new Node(data);//  allocate memory to node
            // connect node in list
            if (head == null)// list empty
            {
                head = t;   //first node
            } else {
                Node r = head;
                while (r.getNext() != null)  // traverse upto last node
                {
                    r = r.getNext();  // move reference to next node
                }
                r.setNext(t); // connect at last position
            }
            count++;
        }
    }

    void display() {
        if (head == null) {
            System.out.println("list is empty");
        } else {
            Node r = head;
            while (r != null) {
                int f=r.getItem();
                System.out.print(f+ " ->");
                r = r.getNext();
            }
        }
    }

    void insertAtBeginning(int item) {

        Node t = new Node(item);
        if (head == null) {
            head = t;
        } else {
            t.setNext(head);
            head=t;
        }
        count++;
    }
    void insertAtEnd(int item){
        Node t = new Node(item);
        if (head == null) {
            head = t;
        }else {
            Node r=head;
            while (r.getNext() !=null){
                r=r.getNext();
            }
            r.setNext(t);
        }
        count++;
    }
    void insertAfter(int after, int item){
        Node t=new Node(item);
        if (head==null){
            head = t;
        }else {
            Node r=head;
            while ( r!=null && r.getItem() != after){
                r=r.getNext();
            }

            if (r !=null){
                t.setNext(r.getNext());
                r.setNext(t);
            }else {
                System.out.println("");
                System.out.println(after+" not found");
            }

        }
    }

    void insertBefore(int before, int item){
        Node t=new Node(item);
        if (head==null){
            head = t;
        }else {
            Node r=head;
            while (r.getNext() !=null && r.getNext().getItem() != before){
                r=r.getNext();
            }
           t.setNext(r.getNext());
            r.setNext(t);
        }
    }
    void insertAtPosition(int position, int item) {

        Node t=new Node(item);
        if (head==null){
            System.out.println("List is empty!");
        }else {
            Node r=head;
            for (int i=1; r!= null && i<position-1; i++){
                r=r.getNext();
            }
            if (r!=null){
                t.setNext(r.getNext());
                r.setNext(t);
            }else {
                System.out.println("\nPosition Not found!");
            }

        }



    }
    void removeFirst() {
        System.out.println("\n Remove First element");
        if (head !=null){
            Node t=head.getNext();
            head=t;
            //head=head.getNext();
        }else {
            System.out.println("List is empty!");
        }
    }
    void removeLast() {
        System.out.println("\n Remove Last element");
        if (head !=null){

            Node r = head;
            while (r.getNext().getNext() != null) {
                r = r.getNext();
            }
            r.setNext(null);
            //head=head.getNext();
        } else {
            System.out.println("List is empty!");
        }
    }
    void removebydata(int val)
    {
        System.out.println("\n Remove "+val+ " Linked List");
        if(head==null)
        {
            System.out.println("list is empty nothing can be deleted");
        }
        else
        {
            Node t=head;
            Node r=null;
            boolean flag=false;
            while(t!=null)
            {
                if(t.getItem()==val)
                {
                    if(t==head)  //first node
                    {
                        head=t.getNext();
                    }
                    else   // last and between deletion
                    {
                        assert r != null;
                        r.setNext(t.getNext());
                    }
                    flag=true;
                    count--;
                    break;
                }
                else
                {
                    r=t;
                    t=t.getNext();
                }
            }
            if(!flag)
            {
                System.out.println("node with given value not exist in the list.");
            }
        }
    }
    void searching(int val) {
        System.out.println("\nSearching "+val+" in linked list");
        if (head == null) {
            System.out.println("list is empty");
        } else {
            boolean flag = false;
            Node r = head;
            int j = 1;
            while (r != null)   // processing including last node
            {
                if (r.getItem() == val) {
                    System.out.println("\ndata found at position " + j);
                    flag = true;
                    break;
                } else {
                    j++;
                    r = r.getNext();
                }
            }
            if (!flag)  // flag==false
            {
                System.out.println("\ndata not found");
            }
        }

    }




}



