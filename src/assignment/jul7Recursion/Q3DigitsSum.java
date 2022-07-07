package assignment.jul7Recursion;

public class Q3DigitsSum {
    public static void main(String[] args) {

        int sum=digitSum(1480);
        System.out.println("sum - "+ sum);
    }

    private static int digitSum(int n) {
        if(n<=0) return 0;

        return n%10 + digitSum(n/10);

    }
}
