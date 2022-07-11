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

    //insert at front
    void enQueue_front(int item){
        if (front==0 && rear==size-1){
            System.out.println("Queue is full!");
            return;
        }
        if (front==rear+1){
            System.out.println("Queue is full!");
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

    // insert at rear
    void enQueue_rear(int item){
        if (front==0 && rear==size-1){
            System.out.println("Q is full");
            return;
        }
        if (front==rear+1){
            System.out.println("Q is Full");
            return;
        }
        if (front==-1 & rear==-1){
            front=rear=0;
            queue[rear]=item;
            return;
        }
        rear++;
        queue[rear]=item;

    }

    //delete from front
    int deQueue_front(){

        if (front==-1){
            System.out.println("Q is Empty!");
            return -1;
        }
        int t=queue[front];
        if (front==rear){
            front=rear=-1;
            return t;
        }
        if (front==size-1  ){
            front=0;
        }else {
            front=front+1;
        }

        return t;
    }

    //delete from rear
    int deQueue_rear(){
        if (front==-1){
            System.out.println("Q is Empty!");
            return -1;
        }
        int t=queue[rear];
        if (front==rear){
            front=rear=-1;
            return t;
        }
        if (rear==0 ){
            rear=size-1;
        }else {
            rear=rear-1;
        }

        return t;
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
        d.enQueue_rear(10);
        d.enQueue_front(20);
        d.enQueue_rear(30);
        d.enQueue_rear(40);
        d.enQueue_rear(50);
        d.enQueue_rear(60);
        d.display();
        System.out.println(d.deQueue_rear());
        System.out.println(d.deQueue_front());
        System.out.println(d.deQueue_front());
        System.out.println(d.deQueue_rear());
        System.out.println(d.deQueue_rear());
        d.display();
    }

}

/*
* Deque
* - Insertion At front end
* - insertion at rear end
* - deletion at front end
* - deletion at rear end
*
*
*
*
* */
