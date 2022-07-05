package dacclass.june.singlylinkedlist;

import assignment.jul2ArrayLinkedList.Q10ReverseLinkedList;

import java.util.Scanner;

public class SinglyLinkedList2 {
   private static Node head;
    public static int count;

    public SinglyLinkedList2() {
        head=null;
        count=0;
    }

     int getLengthOfLinkedList() {
        return count;
    }
    void printSizeOfLinkedList(){
        System.out.println("\nSize of Linked List is : "+count);
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
                while (r.getNext()!=null){
                    r=r.getNext();
                }
                r.setNext(t);
            }
            count+=1;
        }

    }

    // display All Nodes
    void display(){
        if (isEmpty()){
            System.out.println("\nLinked List Is Empty");
        }else {
            System.out.println("\nDisplay All Nodes of LinkedList");
            Node r=head;
            while (r !=null){
                if (r.getNext() !=null)
                System.out.print(r.getItem() +" -> ");
                else System.out.print(r.getItem());
                r=r.getNext();
            }
        }
        System.out.println("");
    }

    //check LinkedList is empty
    boolean isEmpty(){
        return head==null;
    }

    //insert Node at beginning
    void insertNodeAtBeginning(int item){
        System.out.println("\nInsert Node-" + item+ " At Beginning");
        Node t=new Node(item);
        if(isEmpty()){
            head=t;
        }else {

            t.setNext(head);
            head=t;
            count+=1;
        }

    }
    //insert Node at end
    void insertNodeAtEnd(int item){
        System.out.println("\nInsert Node-" + item+ " At End");
        Node t=new Node(item);
        if(isEmpty()){
            head=t;
        }else {
            Node r=head;
            while (r.getNext() !=null){
                r=r.getNext();
            }
            r.setNext(t);
            count+=1;
        }
    }
    //insert before of a Node
    void insertBeforeANode(int before, int item){
        System.out.println("\nInsert Node-" + item+ " Before Node-"+ before);
        if(isEmpty()){
            System.out.println("\nLinked List Is Empty");
        }else {
            Node t=new Node(item);
            Node r=head;
            if (r.getNext()!=null){
                while (r.getNext()!=null && r.getNext().getItem() != before){
                    r=r.getNext();
                }
                if (r.getNext()!=null){
                    t.setNext(r.getNext());
                    r.setNext(t);
                    count+=1;
                }else { // at last node
                    System.out.println("\n"+before+" Node Not found!");
                }
            }else {
                t.setNext(head);
                head=t;
                count+=1;
            }
        }
    }
    //insert after of a Node
    void insertAfterANode(int after, int item){
        System.out.println("\nInsert Node-" + item+ " After Node-"+after);
        if(isEmpty()){
            System.out.println("\nLinked List Is Empty");
        }else {
            Node t=new Node(item);
            Node r=head;
            while (r.getItem() != after){
                r=r.getNext();
            }
            t.setNext(r.getNext());
            r.setNext(t);
            count+=1;
        }
    }
    //insert Node at particular position(index)
    void insertNodeAtIndex(int index, int item) {
        System.out.println("\nInsert Node-" + item+ " At Index-"+index);
        if(isEmpty()){
            System.out.println("\nLinked List Is Empty");
        }else {
            Node t=new Node(item);
            Node r=head;
            for (int i=0; i< index-1; i++){
                r=r.getNext();
            }
            t.setNext(r.getNext());
            r.setNext(t);
            count+=1;
        }
    }

    void insertNodeAtPosition(int position, int item) {
        System.out.println("\nInsert Node-" + item+ " At Position-"+position);
        if(isEmpty()){
            System.out.println("\nLinked List Is Empty");
        }else {
            Node t=new Node(item);
            Node r=head;
            for (int i=0; i< position-2; i++){
                r=r.getNext();
            }
            t.setNext(r.getNext());
            r.setNext(t);
            count+=1;
        }
    }

    //delete Node at beginning
    void deleteNodeAtBeginning(){
        System.out.println("\n Remove Node From Beginning");
        if (isEmpty()){
            System.out.println("\nLinked List Is Empty");
        }else {
            Node t=head;
            head=t.getNext();
            count-=1;
            System.out.println("Node("+t.getItem()+") Is Removed From Beginning!");
        }


    }
    //delete Node at end
    void deleteNodeAtEnd(){
        System.out.println("\n Remove Node From End");
        if (isEmpty()){
            System.out.println("\nLinked List Is Empty");
        }else {
            Node r=head;
            while (r.getNext().getNext()!=null){
                r=r.getNext();
            }
            Node t=r.getNext();
            r.setNext(null);
            count-=1;
            System.out.println("Node("+t.getItem()+") Is Removed From End!");
        }
    }
    //delete before of a Node
    void deleteBeforeANode(int before){
        System.out.println("\nRemoved Node Before Node-"+ before);
        if(isEmpty()){
            System.out.println("\nLinked List Is Empty");
        }else {

            Node r=head;
            if (r.getNext()!=null){
                while (r.getNext()!=null && r.getNext().getItem() != before){
                    r=r.getNext();
                }
                if (r.getNext()!=null){

                    Node t=r.getNext();
                    r.setNext(null);
                    count-=1;
                    System.out.println("Node("+t.getItem()+") Is Removed Before Node("+before+")");
                }else { // at last node
                    System.out.println("\n"+before+" Node Not found!");
                }
            }else {
                if (r.getItem() == before)
                System.out.println("No Node Found Before Node("+before+")");
                else  System.out.println("Node("+before+") NOT Found");
            }
        }
    }
    //delete after of a Node
    void deleteAfterANode(int item){

    }
    //delete Node at particular position(index)
    void deleteNodeAtIndex(int item) {

    }
    void reverseLinkedList(){

        Node r, t, s;
        r=null;
        t=head;
        while (t!=null){
            s=r;
            r=t;
            t=t.getNext();
            r.setNext(s);
        }
        head=r;

    }



}
