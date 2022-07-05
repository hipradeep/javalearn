package assignment.jul2ArrayLinkedList;

import java.util.Scanner;

public class Q10ReverseLinkedList {
    //10. Write a function to reverse the list
    private Node head;
    private int count;
    private Node tail;

    private static class Node {
        private final int item;
        private Node next;

        public Node(int item) {
            this.item = item;
        }

        public Node(int item, Node next) {
            this.item = item;
            this.next = next;
        }
    }
    //createLinkedList of n Node
    void createLinkedList(int n){
        System.out.println("\nSingly LinkedList Created of size : "+n);
        Scanner sc=new Scanner(System.in);
        for (int i=0; i<n; i++){
            System.out.print("Enter data for node "+(i+1)+" : ");
            Node t=new Node(sc.nextInt());
            if(i==0){
                head=t;
            }else {
                Node r=head;
                while (r.next!=null){
                    r=r.next;
                }
                r.next=t;
            }
            count+=1;
        }

    }
    void display() {
        if (head == null) {
            System.out.println("LL is Empty!");
        } else {
            Node r = head;
            while (r != null) {
                if (r.next == null)
                    System.out.println(r.item);
                else System.out.print(r.item + " -> ");
                r = r.next;
            }
        }
    }

    void reverseLinkedList(){

        Node r, t, s;
        r=null;
        t=head;
        while (t!=null){
            s=r;
            r=t;
            t=t.next;
            r.next=s;
        }
        head=r;

    }

    public static void main(String[] args) {
        Q10ReverseLinkedList ll=new Q10ReverseLinkedList();
        ll.createLinkedList(5);
        ll.display();

        System.out.println("Reverse linked List - ");
        ll.reverseLinkedList();
        ll.display();
    }
}
