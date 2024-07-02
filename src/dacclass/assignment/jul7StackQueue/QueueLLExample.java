package dacclass.assignment.jul7StackQueue;

public class QueueLLExample {
    private Node front, rear;
    private int count;

    public QueueLLExample() {
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

    void enQueue(int item) {
        Node t = null;
        t = new Node(item);
        if (t == null) {
            System.out.println("Queue id full!");
        } else {
            if (rear == null) {
                front = rear = t;
            }else {
                rear.next = t;
                rear = t;
            }
            count++;
        }
    }

    int deQueue() {
        if (front == null) {
            System.out.println("Queue id Empty!");
            return -1;
        }
        Node t = front;
        if (front == rear) {
            //last element
            front = null;
            rear = null;
        } else {
            front = front.next;
        }
        count--;
        return t.item;
    }

    void display() {
        if (front == null) {
            System.out.println("Queue is Empty!");
            return;
        }
        Node r = front;
        while (r != null) {
            System.out.print(r.item + ", ");
            r = r.next;
        }

        System.out.println("");
    }

    public static void main(String[] args) {
        QueueLLExample q = new QueueLLExample();
        q.enQueue(10);
        q.enQueue(20);
        //q.enQueue(30);
        //q.enQueue(40);
        System.out.print("Queue elements - ");
        q.display();
        System.out.println("");
        System.out.println("DeQueue - " + q.deQueue());
        System.out.println("DeQueue - " + q.deQueue());
        System.out.println("");

        System.out.print("Queue elements - ");
        q.display();
        System.out.println("");
        System.out.println(q.count);

    }
}
