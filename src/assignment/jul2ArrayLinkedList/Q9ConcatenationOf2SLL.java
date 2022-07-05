package assignment.jul2ArrayLinkedList;

import java.util.Scanner;

public class Q9ConcatenationOf2SLL {
    //Write a program to implement concatenation of two singly linked list.
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
                tail=t;
            }else {
                Node r=head;
                while (r.next!=null){
                    r=r.next;
                }
                r.next=t;
                tail=t;
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

    void concatenate(Node t){
        if (tail!=null){
            tail.next=t;
            Node r=t;
            while (r.next!=null){
                r=r.next;
            }
            tail= r;
        }
    }
    Node getHead(){
        if (head!=null){
            return head;
        }
        return null;
    }

    public static void main(String[] args) {
        Q9ConcatenationOf2SLL ll1=new Q9ConcatenationOf2SLL();
        ll1.createLinkedList(5);
        ll1.display();

        Q9ConcatenationOf2SLL ll2=new Q9ConcatenationOf2SLL();
        ll2.createLinkedList(4);
        ll2.display();
        if (ll2.head!=null){
            ll1.concatenate(ll2.head);
        }else {
            System.out.println("Can not concatenate second ");
        }
        System.out.println("concatenate SLL ");
        ll1.display();


    }
}
