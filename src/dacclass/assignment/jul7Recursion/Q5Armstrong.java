package dacclass.assignment.jul7Recursion;

public class Q5Armstrong {
    static int sum=0;
    public static void main(String[] args) {
        int p=153;
        armstrong(p);
        if (p==sum) System.out.println("Armstrong");
        else System.out.println("Not Armstrong");
    }

    private static void armstrong(int n) {

        if (n == 0) return;
        int K=n%10;
        sum = sum  + (K*K*K);
        armstrong(n / 10);

    }
}
