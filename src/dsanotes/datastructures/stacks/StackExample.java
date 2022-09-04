package dsanotes.datastructures.stacks;

public class StackExample {
    public static void main(String[] args) {
        // make a new stack
        Stack stack = new Stack(10);

        // push items on to the stack
        stack.push(3);
        stack.push(5);
        stack.push(9);
        stack.push(1);
        stack.push(12);
        stack.push(15);

        System.out.println("Element at top of the stack: " + stack.peek());
        System.out.println("Elements: ");

        // print stack data
        while (!stack.isEmpty()) {
            int data = stack.pop();
            System.out.println(data);
        }

        System.out.println("Stack full: " + stack.isFull());
        System.out.println("Stack empty: " + stack.isEmpty());

    }
}

class Stack {
    private final int size;           // size of the stack
    private final int[] intArray;     // stack storage
    private int top;              // top of the stack


    public Stack(int size) {
        this.size = size;
        intArray = new int[size];   //initialize array
        top = -1;                   //stack is initially empty
    }

    // push item on the top of the stack
    public void push(int data) {

        if (!isFull()) {
            // increment top by 1 and insert data
            intArray[++top] = data;
        } else {
            System.out.println("Cannot add data. Stack is full.");
        }
    }


    // pop item from the top of the stack
    public int pop() {
        //retrieve data and decrement the top by 1
        return intArray[top--];
    }


    // view the data at top of the stack
    public int peek() {
        //retrieve data from the top
        return intArray[top];
    }

    // return true if stack is full
    public boolean isFull() {
        return (top == size - 1);
    }


    // return true if stack is empty
    public boolean isEmpty() {
        return (top == -1);
    }
}

