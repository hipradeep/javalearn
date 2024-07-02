package dacclass.assignment.jul7Recursion;

public class Q1Factorials {

    public static void main(String[] args) {

        int n=5;
       int num= factorials(n);
        System.out.println("Factorials of "+n+" is - "+num);
    }

    private static int factorials(int n) {
        if (n<=1) return 1;
        return n* factorials(n-1);


    }
}
