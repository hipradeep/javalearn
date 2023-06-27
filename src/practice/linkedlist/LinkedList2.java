package practice.linkedlist;

class LinkedList2 extends LinkedList {



    public  Node addTwoNumber(Node h1, Node h2){
        //h1, h2 are in reverse order
        int carry=0;
        Node sum=null;
        Node temp=sum;
        while(h1!=null && h2!=null|| carry!=0){
            int s=0;
            if(h1!=null){
                s=s+h1.data;
               h1=h1.next;

            }

            if(h2!=null){
                s=s+h2.data;
               h2=h2.next;
            }
            s=s+carry;
            carry=s/10;
            Node t=new Node(s%10);
            
            temp.next=t;
            temp=temp.next;

        }
        return sum.next;
    }



    //is palindrome

    public boolean isPalindrome(){
        if (head==null || head.next==null) return true;
        Node slow=head;
        Node fast= head;
        while(fast.next !=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        slow.next= reverseLinkedList(slow.next);

        Node p1=slow.next;
        Node p2=head;
        while (p1!=null){
            if (p1.data!=p2.data) return false;
            p1= p1.next;
            p2=p2.next;
        }
        return true;

    }

    //Merge two sorted List
    public Node mergeTowSortedList(Node head1, Node head2) {

        if (head1 == null || head2 == null)
            return head1 == null ? head2 : head1;

        Node fHead = null;
        Node tail = null;

        while (head1 != null && head2 != null) {
            if (head1.data < head2.data) {
                if (fHead == null) {
                    fHead = head1;
                } else {
                    tail.next = head1;
                }
                tail = head1;
                head1 = head1.next;
            } else {
                if (fHead == null) {
                    fHead = head2;
                } else {
                    tail.next = head2;
                }
                tail = head2;
                head2 = head2.next;
            }
        }

        if (head1 != null) {
            tail.next = head1;
        }

        if (head2 != null) {
            tail.next = head2;
        }

        return fHead;
    }
    //find middle node
    public Integer middleNode(){
        Node slow=head;
        Node fast=head;

        while(fast.next !=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return  slow.data;
    }

    //reverse linked list

    public void reverseLinkedList() {
        if (isEmpty() || head.next==null) return;

        Node next,prev=null;

        while (head != null) {
            next=head.next;

            head.next=prev;
            prev=head;

            head=next;
        }
        head=prev;

    }

    public Node reverseLinkedList(Node hd) {
        if (hd==null || hd.next==null) return hd;

        Node next,prev=null;

        while (hd != null) {
            next=hd.next;

            hd.next=prev;
            prev=hd;

            hd=next;
        }
        hd=prev;
        return hd;

    }
    public void reverseLinkedList3() {
        if (isEmpty() || head.next==null) return;

        Node prev = null;
        Node next=null;
        Node r=head;//current

        while (r != null) {
            next=r.next;//next node ka ref  store kiya

            r.next=prev;  //current node ke next me prev node ka ref dala

            prev=r; //prev node ko current node se update kiya

            r=next; //next node ko current node banaya
        }
        head=prev;  // head ko prev node se update kiya(jo ki last node h)

    }

    public void reverseLinkedList2() {
        if (isEmpty() || head.next==null) return;

        Node previous = null;
        Node current = head;
        Node nextNode;

        while (current != null) {
            nextNode = current.next; // Store the reference to the next node
            current.next = previous; // Reverse the link of the current node

            // Move previous and current one step forward
            previous = current;
            current = nextNode;
        }

        head = previous; // Update the head to the last node (previous)

        //Time Complexity ==> T=O(n)
    }


    //Search Node in LinkedList
    public Integer searchNode(Integer v) {
        if (isEmpty()) return -1;

        Node r = head;
        int i = 0;
        while (r != null) {
            i++;
            if (r.data.equals(v)) return i;
            r = r.next;
        }
        return -1;
    }


}
