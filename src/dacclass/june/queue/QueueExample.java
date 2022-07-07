package dacclass.june.queue;

public class QueueExample {
    private final int size;
    private final int[] queue;
    private int front, rear;

    public QueueExample(int size) {
        this.size = size;
        queue = new int[this.size];
        front = -1;
        rear = -1;
    }
    boolean isFull() {
        return (front == 0 && rear == size - 1);
    }
    boolean isEmpty() {
        return front == -1;
    }
    void enQueue(int element) {
        if (isFull()) {
            System.out.println("Queue is full");
        } else {
            if (front == -1)
                front = 0;
            rear++;
            queue[rear] = element;
        }
    }
    public int deQueue() {
        int element;
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return (-1);
        } else {
            element = queue[front];
            if (front >= rear) {
                front = -1;
                rear = -1;
            }
            else {
                front++;
            }
            return element;
        }
    }
    int front() {
        if (isEmpty())
            return Integer.MIN_VALUE;

        return queue[front];
    }
    int rear() {
        if (isEmpty())
            return Integer.MIN_VALUE;

        return queue[rear];
    }
    void display() {
        int i;
        if (isEmpty()) {
            System.out.println("Empty Queue");
        } else {
            System.out.println("\nFront index-> " + front);
            System.out.print("Items -> ");
            for (i = front; i <= rear; i++)
                System.out.print(queue[i] + "  ");

            System.out.println("\nRear index-> " + rear);
        }
    }
    public static void main(String[] args) {
        QueueExample q=new QueueExample(8);
        q.enQueue(10);
        q.enQueue(20);
        q.enQueue(30);
        q.enQueue(40);
        q.enQueue(50);

        q.display();
        System.out.println("Front - "+q.front());
        System.out.println("Rear - "+q.rear());
        System.out.println("");
        System.out.println("DeQueue - "+q.deQueue());
        System.out.println("DeQueue - "+q.deQueue());

        System.out.println("");
        System.out.println("Front - "+q.front());
        System.out.println("Rear - "+q.rear());
        System.out.println("");

        q.display();


    }
}
