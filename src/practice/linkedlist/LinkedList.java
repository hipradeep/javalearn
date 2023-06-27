package practice.linkedlist;

class LinkedList {
    public Node head = null;
    public Node tail = null;
    private int size = 0;

    public Node removeNthFromEnd(Integer n){
        // [ 0 ] -> [ 10 ] -> [ 20 ] -> [ 30 ] -> [ ]
        // dummy    head
        // slow
        // fast,
        // start both pointer one step before head that is dummy
        // because to delete current node we have to access that previous node
        // so the slow pointer will always one step back that current node

       Node dummy=new Node(0);
       dummy.next=head;
       Node slow=dummy;
       Node fast=dummy;
        for (int i = 0; i <=n; i++) {
            fast=fast.next;

        }
        while (fast!=null){
            slow=slow.next;
            fast=fast.next;
        }

        slow.next=slow.next.next;
        return dummy.next;




    }

    private Node getNextNth(Node right, Integer n) {
        int i=0;
        Node r=right;
        while (i!=n){
            r=r.next;
            i++;
        }
        return r;
    }


    public Node getHead() {
        return head;
    }
    public void displayHead(Node h){
        Node r = h;
        if (isEmpty()) return;
        while (r.next != null) {
            System.out.print(r.data + " -> ");
            r = r.next;
        }
        System.out.println(r.data);

    }

    public  void  updateTail(){
        Node r=head;
        while(r!=null && r.next!=null){
            r=r.next;
        }
        tail = r;
    }

    public void deleteItem(Integer i) {
        if (isEmpty()) return;
        if (head.data.equals(i)) {
            head = head.next;
            return;
        }
        Node r = head;
        while (r.next != null) {
            if (r.next.data.equals(i)) {
                Node t = r.next;
                r.next = r.next.next;
                return;
            }
            r = r.next;

        }
    }

    public Integer deleteAtEnd() {
        if (isEmpty()) return -1;
        Node r = head;
        if (head.next == null) {
            Integer t = head.data;
            head = null;
            return t;
        }
        while (r.next.next != null) {
            r = r.next;
        }
        Integer t = r.data;
        r.next = null;
        return t;
    }

    public Integer deleteAtStart() {
        if (isEmpty()) return -1;
        Integer t = head.data;
        head = head.next;
        return t;
    }

    public Integer deleteAtPosition(int p) {
        if (isEmpty()) return -1;
        int i = 1;
        if (p == 1) {
            Integer t = head.data;
            head = head.next;
            return t;
        }

        Node r = head;
        while (r != null && i < p - 1) {
            r = r.next;
            i++;
        }

        if (r != null && r.next != null) {
            Integer t = r.next.data;
            r.next = r.next.next;
            return t;
        } else System.out.println(p + " - Position Not found!");
        return -1;

    }


    public void create1(int[] nums) {
        //add through head
        for (int n : nums) {
            Node r = new Node(n);
            r.next = head;
            head = r;
        }
    }

    public void create2(int[] nums) {
        //add at end
        for (int n : nums)
            insertAtEnd(n);
    }

    public void insertBefore(Integer i, Integer v) {
        if (isEmpty()) return;
        if (head.next == null) {
            //single item in linked list
            if (head.data.equals(i)) {
                Node t = new Node(v);
                t.next = head;
                head = t;
                return;
            }
        }
        Node r = head;
        while (r.next != null) {
            if (r.next.data.equals(i)) {
                Node t = new Node(v);
                t.next = r.next;
                r.next = t;
                return;
            }
            r = r.next;
        }
        System.out.println(i + " - Value Not Found! ");


    }

    public void insertAfter(Integer i, Integer v) {
        if (isEmpty()) return;
        Node r = head;
        while (r != null) {
            if (r.data.equals(i)) {
                Node t = new Node(v);
                if (r.next != null) {
                    t.next = r.next;
                }
                r.next = t;
                return;
            }
            r = r.next;
        }

        System.out.println(i + " - Value Not Found! ");
    }

    public void insertAtPosition(Integer p, Integer v) {
        int i = 1;
        if (isEmpty()) return;
        Node r = head;
        if (head.next == null) {
            if (i == p) {
                Node t = new Node(v);
                t.next = head;
                head = t;
            } else System.out.println(p + " - Position Not found!");
            return;
        }
        if (i == p) {
            Node t = new Node(v);
            t.next = head;
            head = t;
            return;
        }
        while (r.next != null) {

            if (++i == p) {
                Node t = new Node(v);
                t.next = r.next;
                r.next = t;
                return;
            }
            r = r.next;
        }

        System.out.println(p + " - Position Not found!");

    }

    public void insertAtPosition2(Integer p, Integer v) {
        if (isEmpty()) return;

        Node newNode = new Node(v);
        if (p == 1) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node current = head;
        int i = 1;
        while (current != null && i < p - 1) {
            current = current.next;
            i++;
        }

        if (current != null) {
            newNode.next = current.next;
            current.next = newNode;
        } else {
            System.out.println(p + " - Position Not found!");
        }
    }


    public int countLLNodes() {
        Node r = head;
        int l = 0;
        if (r == null) return l;

        while (r != null) {//till out of list
            l++;
            r = r.next;
        }
        return l;
    }

    public boolean isEmpty() {
        boolean empty = head == null;
        if (empty) {
            System.out.println("Linked List Is Empty!!");
        }
        return empty;
    }


    public void insertAtEnd(Integer d) {
        Node newNode = new Node(d);
        //insert at head if linked-list is empty
        if (head == null) {
            head = newNode;
            return;
        }
        //if linked-list is not empty then find the last-node
        Node r = head;
        while (r.next != null) r = r.next;
        r.next = newNode;
        size++;
    }

    public void insertAtStart(Integer d) {
        Node newNode = new Node(d);
        //insert at head if linked-list is empty
        if (head == null) {
            head = newNode;
            return;
        }
        //if linked-list is not empty then put head in newNode.next and make newNode head
        newNode.next = head;
        head = newNode;
        size++;
    }

    public void display() {
        Node r = head;
        if (isEmpty()) return;
        while (r.next != null) {
            System.out.print(r.data + " -> ");
            r = r.next;
        }
        System.out.println(r.data);

    }


}
