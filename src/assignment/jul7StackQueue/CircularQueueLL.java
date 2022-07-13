package assignment.jul7StackQueue;

public class CircularQueueLL {
    private  Node front;
    private  Node rear;
    private int count;

    public CircularQueueLL() {
        front = rear = null;
        count = 0;
    }

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


     void enQueue( int value)
    {
        Node temp = new Node(value);

        if (front == null)
            front = temp;
        else
            rear.next = temp;

        rear = temp;
        rear.next = front;
    }
     int deQueue()
    {
        if (front == null) {
            System.out.printf("Queue is empty");
            return Integer.MIN_VALUE;
        }


        int value;
        if (front == rear) {
            value = front.item;
            front = null;
            rear = null;
        }
        else // There are more than one nodes
        {
            Node temp = front;
            value = temp.item;
            front = front.next;
            rear.next = front;
        }

        return value;
    }
     void displayQueue()
    {
        Node temp = front;
        System.out.printf("\nElements in Circular Queue are: ");
        while (temp.next != front) {
            System.out.printf("%d ", temp.item);
            temp = temp.next;
        }
        System.out.printf("%d", temp.item);
    }

    public static void main(String[] args) {
        CircularQueueLL cl=new CircularQueueLL();

        cl.enQueue(12);
        cl.enQueue(13);
        cl.enQueue(14);
        cl.enQueue(15);

        cl.displayQueue();
        System.out.println("");
        System.out.println("DeQueue- "+cl.deQueue());
        System.out.println("DeQueue- "+cl.deQueue());
        System.out.println("DeQueue- "+cl.deQueue());

        cl.displayQueue();
    }
}
