package practice.arvind;

public class Stack {
    int[] stack;
    int top;
    int size;

    public Stack(int size) {
        this.size = size;
        this.top=-1;
        stack=new int[size];
    }

    public boolean isEmpty() {
        return top == -1;
    }
    public boolean isFull() {
        return top == size - 1;
    }
    public boolean push(int value) {
        if (isFull()) {
            return false;
        }
        stack[++top] = value;
        return true;
    }

    public Integer pop() {
        if (isEmpty()) {
            return null;
        }
        return stack[top--];
    }

    public Integer peek() {
        if (isEmpty()) {
            return null;
        }
        return stack[top];
    }


}

class Abc{
    public static void main(String[] args) {
        Stack stack=new Stack(5);
        stack.push(100);
        stack.push(200);
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        stack.push(500);

        System.out.println(stack.push(500));
        System.out.println(stack.push(500));
        System.out.println(stack.push(500));
        System.out.println(stack.push(500));
        System.out.println(stack.peek());
    }
}



