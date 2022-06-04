package dsanotes.datastructures.queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue queue = new Queue(5);

        // deQueue is not possible on empty queue
        queue.deQueue();

        // enQueue 5 elements
        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);
        queue.enQueue(4);
        queue.enQueue(5);

        // 6th element can't be added to because the queue is full
        queue.enQueue(6);


        System.out.println("Front item is " + queue.front());

        System.out.println("Rear item is " + queue.rear());

        //deQueuing all elements
        while (!queue.isEmpty()) {
            int data = queue.deQueue();
            System.out.println(data);
        }
        // deQueue from empty queue, will print 'queue is empty'
        queue.deQueue();

    }


}

/*class Queue {
    private int front, rear, size;
    private int capacity;
    private int array[];

    public Queue(int capacity) {
        this.capacity = capacity;
        front = this.size = 0;
        rear = capacity - 1;
        array = new int[this.capacity];
    }

    // Queue is full when size becomes
    // equal to the capacity
    boolean isFull(Queue queue) {
        return (queue.size == queue.capacity);
    }

    // Queue is empty when size is 0
    boolean isEmpty(Queue queue) {
        return (queue.size == 0);
    }

    // Method to add an item to the queue.
    // It changes rear and size
    void enqueue(int item) {
        if (isFull(this))
            return;
        this.rear = (this.rear + 1)
                % this.capacity;
        this.array[this.rear] = item;
        this.size = this.size + 1;
        System.out.println(item
                + " enqueued to queue");
    }

    // Method to remove an item from queue.
    // It changes front and size
    int dequeue() {
        if (isEmpty(this))
            return Integer.MIN_VALUE;

        int item = this.array[this.front];
        this.front = (this.front + 1)
                % this.capacity;
        this.size = this.size - 1;
        return item;
    }

    // Method to get front of queue
    int front() {
        if (isEmpty(this))
            return Integer.MIN_VALUE;

        return this.array[this.front];
    }

    // Method to get rear of queue
    int rear() {
        if (isEmpty(this))
            return Integer.MIN_VALUE;

        return this.array[this.rear];
    }
}*/


class Queue {
    private final int size;    // size of the queue
    private final int[] queue;  // array to store element
    private int front, rear;    // front and rear of the stack

    public Queue(int size) {
        this.size = size;
        queue = new int[this.size];    //initialize array
        front = -1;                    //queue is initially empty
        rear = -1;
    }

    // return true if queue is full
    boolean isFull() {
        return (front == 0 && rear == size - 1);
    }

    // return true if queue is empty
    boolean isEmpty() {
        return front == -1;
    }

    //enQueue the element at rear of queue
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

    // deQueue element from front of queue and if queue is empty reset the queue
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
            //Q has only one element, so we reset the queue after deleting it.
            else {
                front++;
            }
            return element;
        }
    }

    // Method to get front of queue
    int front() {
        if (isEmpty())
            return Integer.MIN_VALUE;

        return queue[front];
    }

    // Method to get rear of queue
    int rear() {
        if (isEmpty())
            return Integer.MIN_VALUE;

        return queue[rear];
    }

    void display() {
        /* Function to display elements of Queue */
        int i;
        if (isEmpty()) {
            System.out.println("Empty Queue");
        } else {
            System.out.println("\nFront index-> " + front);
            System.out.println("Items -> ");
            for (i = front; i <= rear; i++)
                System.out.print(queue[i] + "  ");

            System.out.println("\nRear index-> " + rear);
        }
    }
}


