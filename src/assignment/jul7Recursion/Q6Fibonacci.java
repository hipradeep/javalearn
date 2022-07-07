package assignment.jul7Recursion;

public class Q6Fibonacci {
    public static void main(String[] args) {

        printFibo(9);
    }

    static void printFibo(int k){
        if (k<=0) return;
        printFibo(k-1);
        System.out.println( fibonacci(k-1));
    }

    static int fibonacci(int n)
    {
        if (n <= 1)
            return n;
        return fibonacci(n-1) + fibonacci(n-2);
    }
}
