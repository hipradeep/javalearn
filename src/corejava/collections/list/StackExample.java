package corejava.collections.list;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<String> stringStack=new Stack<>();
        stringStack.add("pradeep");
        stringStack.push("maurya");
        stringStack.push("lko");
        System.out.println(stringStack);

        System.out.println("Pop : "+stringStack.pop());
        System.out.println("peek : "+stringStack.peek() );

        System.out.println(stringStack);
    }
}
