package dacclass.june.stack;

public class Stack {
    int[] stack;
    int MAX;
    int top;

    public Stack(int MAX) {
        stack=new int[MAX];
        this.MAX = MAX;
        this.top=-1;
    }

    //check empty
    boolean isEmpty(){
        return top==-1;
    }
    //check is full
    boolean isFull(){
        return top==MAX-1;
    }

    //push
    void push(int item){
        if (isFull()){
            System.out.println("Stack is full");
            return;
        }
            stack[++top]=item;

    }

    //pop
    int pop(){
        if (isEmpty()){
            System.out.println("Stack Is Empty!");
            return 0;
        }
        return stack[top--];
    }

    int peek(){
        if (isEmpty()){
            System.out.println("Stack Is Empty!");
            return 0;
        }else {
            return stack[top];
        }
    }
    int size(){
        return top+1;
    }
    void display(){
        System.out.print("[ ");
        for (int i = 0; i <=top; i++) {
            System.out.print(stack[i]+", ");
        }
        System.out.println(" ]");
    }


    public static void main(String[] args) {
        Stack stack=new Stack(10);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.display();
        System.out.print("Pop - ");
        System.out.println(stack.pop());
        stack.display();
        System.out.print("Peek - ");
        System.out.println(stack.peek());
        System.out.print("Size - ");
        System.out.println(stack.size());

    }
}
