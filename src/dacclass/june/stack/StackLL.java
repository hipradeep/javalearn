package dacclass.june.stack;

public class StackLL {
    private Node top;
    private int size;

    private static class Node {
        int item;
        Node next;

        public Node(int item) {
            this.item = item;
            this.next = null;
        }
    }

    void push(int item) {
        Node t = null;
        t = new Node(item);
        if (t == null) {
            System.out.println("Node Cant Insert!");
        }
        if (top != null) {
            t.next = top;
        }
        top = t;
        size++;
    }
    int pop(){

        if (top==null){
            System.out.println("Stack is empty!");
            return 0;
        }
        Node t=top;
        top=top.next;
        size--;
        return t.item;
    }
    int peek(){
        if (top==null){
            System.out.println("Stack is empty!");
            return 0;
        }
        return top.item;
    }

    void display(){
        Node r=top;
        System.out.print("[ ");
        while (r!=null){
            System.out.print(r.item+", ");
            r=r.next;
        }
        System.out.println(" ]");
    }
    public static void main(String[] args) {
        StackLL ll=new StackLL();
        ll.push(42);
        ll.push(43);
        ll.push(44);
        ll.push(45);
        ll.display();
        System.out.print("Peek - ");
        System.out.println(ll.peek());
        System.out.print("Pop - ");
        System.out.println( ll.pop());
        ll.display();
    }

}
