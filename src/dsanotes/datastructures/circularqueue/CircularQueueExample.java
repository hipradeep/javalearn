package dsanotes.datastructures.circularqueue;

public class CircularQueueExample {
    public static void main(String[] args) {

        CircularQueue circularQueue = new CircularQueue(5);

        // Fails because front = -1
        circularQueue.deQueue();

        circularQueue.enQueue(1);
        circularQueue.enQueue(2);
        circularQueue.enQueue(3);
        circularQueue.enQueue(4);
        circularQueue.enQueue(5);

        // Fails to enqueue because front == 0 && rear == SIZE - 1
        circularQueue.enQueue(6);

        circularQueue.display();

        int elem = circularQueue.deQueue();

        if (elem != -1) {
            System.out.println("Deleted Element is " + elem);
        }
        circularQueue.display();

        circularQueue.enQueue(7);

        circularQueue.display();

        // Fails to enqueue because front == rear + 1
        circularQueue.enQueue(8);
    }
}
// Circular Queue implementation in Java

 class CircularQueue {
     private final int size;    // size of the queue
     private final int[] queue;  // array to store element
     private int front, rear;    // front and rear of the stack

    CircularQueue(int size) {
        this.size = size;
        queue = new int[this.size];    //initialize array
        front = -1;                    //queue is initially empty
        rear = -1;
    }

    // Check if the queue is full
    boolean isFull() {
        if (front == 0 && rear == size - 1) {
            return true;
        }
        if (front == rear + 1) {
            return true;
        }
        return false;
    }

    // Check if the queue is empty
    boolean isEmpty() {
        if (front == -1)
            return true;
        else
            return false;
    }

    // Adding an element
    void enQueue(int element) {
        if (isFull()) {
            System.out.println("Queue is full");
        } else {
            if (front == -1)
                front = 0;
            rear = (rear + 1) % size;
            queue[rear] = element;
            System.out.println("Inserted " + element);
        }
    }

    // Removing an element
    int deQueue() {
        int element;
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return (-1);
        } else {
            element = queue[front];
            if (front == rear) {
                front = -1;
                rear = -1;
            } /* Q has only one element, so we reset the queue after deleting it. */
            else {
                front = (front + 1) % size;
            }
            return (element);
        }
    }

    void display() {
        /* Function to display status of Circular Queue */
        int i;
        if (isEmpty()) {
            System.out.println("Empty Queue");
        } else {
            System.out.println("Front -> " + front);
            System.out.println("Items -> ");
            for (i = front; i != rear; i = (i + 1) % size)
                System.out.print(queue[i] + " ");
            System.out.println(queue[i]);
            System.out.println("Rear -> " + rear);
        }
    }



}
