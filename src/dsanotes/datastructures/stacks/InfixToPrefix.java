package dsanotes.datastructures.stacks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class InfixToPrefix {
    Stack<Character> operators = new Stack<>();
    public static void main(String[] args) throws IOException {
        //((A–(B+C)*D))↑(E+F)  -> ABC+–D*EF+↑
        //A+B*(C^D-E) -> ABCD^E-*+
        String infix;

        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("\nEnter the infix expression you want to convert: ");
        infix = keyboard.readLine();

        System.out.println("Postfix expression for the given infix expression is:" + (new InfixToPrefix()).toPrefix(infix));
    }
    String toPrefix(String infix){
        {
            char symbol;
            String prefix = "";
            for (int i = infix.length()-1 ; i >=0; --i) {
                //while there is input to be read
                symbol = infix.charAt(i);
                //if it's an operand, add it to the string
                if (Character.isLetter(symbol)) prefix = symbol + prefix ;

                else if (symbol == ')') {

                    operators.push(symbol);  //push (
                    //push everything back to (
                } else if (symbol == '(') {

                    while (operators.peek() != '(') {
                        prefix =  operators.pop() + prefix ;
                    }
                    operators.pop(); //remove '('

                } else {
                    //print operators occurring before it that have greater precedence
                    while (!operators.isEmpty() && !(operators.peek() == ')') && prec(symbol) <= prec(operators.peek()))
                        prefix = operators.pop() + prefix;
                    operators.push(symbol);
                }
            }
            while (!operators.isEmpty()) prefix =  operators.pop() + prefix;
            return prefix;
        }
    }
    static int prec(char x) {
        if (x == '+' || x == '-') return 1;
        if (x == '*' || x == '/' || x == '%') return 2;
        return 3;
    }
}
