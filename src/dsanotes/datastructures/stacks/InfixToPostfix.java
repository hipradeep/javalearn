package dsanotes.datastructures.stacks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class InfixToPostfix {
    //Stack operators = new Stack();
    Stack<Character> operators = new Stack<>();

    public static void main(String[] args) throws IOException {
        //((A–(B+C)*D))↑(E+F)  -> ABC+–D*EF+↑
        //A+B*(C^D-E) -> ABCD^E-*+
        String infix;

        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("\nEnter the infix expression you want to convert: ");
        infix = keyboard.readLine();

        System.out.println("Postfix expression for the given infix expression is:" + (new InfixToPostfix()).toPostfix(infix));
    }

    private String toPostfix(String infix) {
        {
            char symbol;
            String postfix = "";
            for (int i = 0; i < infix.length(); ++i) {
                //while there is input to be read
                symbol = infix.charAt(i);
                //if it's an operand, add it to the string
                if (Character.isLetter(symbol)) postfix = postfix + symbol;

                else if (symbol == '(') {

                    operators.push(symbol);  //push (
                    //push everything back to (
                } else if (symbol == ')') {

                    while (operators.peek() != '(') {
                        postfix = postfix + operators.pop();
                    }
                    operators.pop(); //remove '('

                } else {
                    //print operators occurring before it that have greater precedence
                    while (!operators.isEmpty() && !(operators.peek() == '(') && prec(symbol) <= prec(operators.peek()))
                        postfix = postfix + operators.pop();
                    operators.push(symbol);
                }
            }
            while (!operators.isEmpty()) postfix = postfix + operators.pop();
            return postfix;
        }
    }

    static int prec(char x) {
        if (x == '+' || x == '-') return 1;
        if (x == '*' || x == '/' || x == '%') return 2;
        return 3;
    }

    private static class Stack1 {
        char a[] = new char[100];
        int top = -1;

        void push(char c) {
            try {
                a[++top] = c;
            } catch (StringIndexOutOfBoundsException e) {
                System.out.println("Stack full, no room to push, size=100");
                System.exit(0);
            }
        }

        char pop() {
            return a[top--];
        }

        boolean isEmpty() {
            return (top == -1) ? true : false;
        }

        char peek() {
            return a[top];
        }
    }

}
