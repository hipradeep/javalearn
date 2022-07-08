package dacclass.june.queue.circilarqueue;

public class CircularQueue {
    private final int size;
    private final int[] queue;
    private int front, rear;

    public CircularQueue(int size) {
        this.size = size;
        queue = new int[this.size];
        front = -1;
        rear = -1;
    }

    boolean isFull() {
        if (rear == size - 1 && front == 0) {
            return true;
        }
        if (rear == front - 1) { //front==rear+1
            return true;
        }
        return false;
    }

    boolean isEmpty() {
        if (front == -1) {
            return true;
        }
        return false;

        //bich me hum is liye check nahi karte hai, last element delete karene ke baad reset kar dete ha,
    }

    void enQueue(int item) {
        if (isFull()) {
            System.out.println("Queue is Full!");
            return;
        }
        rear = (rear + 1) % size;
        queue[rear] = item;

        if (front == -1)
            front = 0;
    }

    void enQueue2(int item) {
        if (isFull()) {
            System.out.println("Queue is Full!");
            return;
        }
        if (rear == size - 1)
            rear = 0;
        else
            rear++;

        queue[rear] = item;

        if (front == -1) front = 0;
    }

    int deQueue() {
        if (isEmpty()) {
            System.out.println("Q is Empty!");
            return -1;
        }
        int t = queue[front];

        if (front == rear) {
            front = -1;
            rear = -1;
        } else {
            front = (front + 1) % size;
        }
        return t;
    }

    void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        int i;
        for ( i = front; i != rear; i = (i + 1) % size)
            System.out.print(queue[i] + " ");
        System.out.println(queue[i]);

    }

    public static void main(String[] args) {
        CircularQueue cq = new CircularQueue(7);
        cq.enQueue(10);
        cq.enQueue(20);
        cq.enQueue(30);
        cq.enQueue(40);
        cq.enQueue(50);
        cq.enQueue(60);
        cq.enQueue(70);
        cq.display();
        System.out.println("Dequeue - " + cq.deQueue());
        System.out.println("Dequeue - " + cq.deQueue());
        System.out.println("Dequeue - " + cq.deQueue());
        cq.display();
        System.out.println("Enqueue - ");
        cq.enQueue(80);
        cq.enQueue(90);

        cq.display();

    }
}
