package dacclass.june.queue;

public class Deque {
    private final int size;
    private final int[] queue;
    private int front, rear;

    public Deque(int size) {
        this.size = size;
        queue = new int[this.size];
        front = -1;
        rear = -1;
    }

    void enQueue_front(int item){
        if (front==0 && rear==size-1){
            System.out.println("Queue is full!");
            return;
        }
        if (front==rear+1){
            System.out.println("Queue is full$!");
            return;
        }
        //if empty
        if (front==-1 && rear==-1){
            front=rear=0;
            queue[front]=item;
            return;
        }
        if (front==0){
            front=size-1;
        }else {
            front=front-1;
        }
        queue[front]=item;
    }


    void display(){
        if (front==-1){
            System.out.println("Queue is empty!");
            return;
        }
        int i;
        for (i=front; i!=rear; i=(i+1)%size)
            System.out.print(queue[i]+", ");
        System.out.println(queue[i]);
    }

    public static void main(String[] args) {
        Deque d=new Deque(5);
        d.enQueue_front(10);
        System.out.println("f - "+d.front);
        System.out.println("r - "+d.rear);
        d.enQueue_front(20);
        System.out.println("f - "+d.front);
        System.out.println("r - "+d.rear);
        d.enQueue_front(30);
        System.out.println("f - "+d.front);
        System.out.println("r - "+d.rear);
        d.enQueue_front(40);
        System.out.println("f - "+d.front);
        System.out.println("r - "+d.rear);
        d.enQueue_front(50);
        System.out.println("f - "+d.front);
        System.out.println("r - "+d.rear);

        d.display();
    }

}
