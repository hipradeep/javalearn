package dacclass.june.doublylinkedlist;

import java.util.Scanner;

public class DLL2 {
    private Node head;
    private static class Node {
        int item;
        Node next;
        Node prev;

        public Node(int item) {
            this.item = item;
            next = prev = null;
        }

    }

    void createDll(int n) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < n; i++) {
            System.out.print("Enter data for Node-" + i + " : ");
            Node t = new Node(sc.nextInt());
            if (head == null) {
                head = t;
            } else {
                Node r=head;
                while (r.next!=null){
                    r=r.next;
                }
                r.next=t;
                t.prev=r;
            }
        }
    }

    void createUsingArr(int[] a) {

        for (int p : a) {
            Node t = new Node(p);
            if (head == null) {
                head = t;
            } else {
                Node r=head;
                while (r.next!=null){
                    r=r.next;
                }
                r.next=t;
                t.prev=r;
            }
        }
    }
    void display() {
        if (head == null) System.out.println("List Is empty!");
        else {
            Node r = head;
            while (r != null) {
                if (r.next == null) {
                    System.out.print(r.item);
                } else {
                    System.out.print(r.item + " -> ");
                }
                r = r.next;
            }
        }
        System.out.println("");
    }

    void displayRev(){
        if(head==null){
            System.out.println("List is empty!");
        }else {
            Node last=null;
            Node r=head;
            while (r!=null){
                last=r;
                r=r.next;
            }

            while (last!=null){
                System.out.print(last.item+" -> ");
                last=last.prev;
            }
        }
    }
    void insertAtFirst(int item) {
        Node t = new Node(item);
        t.next=head;
        t.prev=null;
        if(head!=null){
            head.prev=t;
        }
        head=t;
    }

    void insertAtEnd(int item) {
        Node t = new Node(item);
        if (head == null) {
            head = t;
        } else {
            Node r=head;
            while (r.next!=null){
                r=r.next;
            }
            r.next=t;
            t.prev=r;
        }
    }

    void insertAtIndex(int index, int item) {

        if (index == 0) {
            insertAtFirst(item);
            return;
        }
        Node r = head;
        for (int i = 1; i < index; i++) {
            r = r.next;
        }
        Node t=new Node(item);
        t.next = r.next;
        t.prev = r;
        r.next.prev=t;
        r.next = t;

    }
    void insertAfter(int after, int item){
        Node p = find(after);

        if (p == null) {
            System.out.println("does not exist");
            return;
        }
        Node node = new Node(item);
        node.next = p.next;
        p.next = node;
        node.prev = p;
        if (node.next != null) {
            node.next.prev = node;
        }
    }

    Node find(int item){
        Node r=head;
        while (r!=null){
            if (r.item==item) return r;
            r=r.next;
        }
        return null;
    }

    public static void main(String[] args) {
        DLL2 dl = new DLL2();
       // dl.createDll(5);
       dl.createUsingArr(new int[]{10, 20, 30, 40});
        dl.display();
        dl.insertAtFirst(11);
        dl.display();
        dl.insertAtEnd(21);
        dl.display();
//        dl.insertAtIndex(2,31);
       dl.insertAtIndex(4,32);
       dl.insertAtIndex(6,33);
       dl.insertAfter(32, 65);
        dl.display();
        dl.displayRev();
    }
}
