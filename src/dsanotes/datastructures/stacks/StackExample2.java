package dsanotes.datastructures.stacks;

public class StackExample2 {
    public static void main(String[] args)  {
        Stack1 stack = new Stack1(10);

        // push items on to the stack
        stack.push(3);
        stack.push(5);
        stack.push(9);
        stack.push(1);
        stack.push(12);
        stack.push(15);

        System.out.println("Element at top of the stack: " + stack.peek());
        System.out.println("Elements: ");

        try{
        // print stack data
        while (!stack.isEmpty()) {
            int data = stack.pop();
            System.out.println(data);
        }
        //access after empty Stack
        int data = stack.pop();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}

class Stack1{
    private int size;
    private int[] stack;
    private  int top;

    public Stack1(int size) {
        this.size = size;
        stack=new int[size];
        top=-1;
    }
    public int peek() {
        //retrieve data from the top
        return stack[top];
    }
    public boolean isFull(){
        return (top == size-1);
    }
    public boolean isEmpty(){
        return (top == -1);
    }
    public void push(int e){
        if(!isFull()){
            stack[++top]=e;
        }else {
            System.out.println("Stack is full!");
        }

    }
     public int pop() throws Exception{
        if(!isEmpty()){
            return stack[top--];
        }else {
            throw new Exception("Stack is Empty!");
        }
     }
}
