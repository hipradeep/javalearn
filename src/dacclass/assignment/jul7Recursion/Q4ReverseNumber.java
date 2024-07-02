package dacclass.assignment.jul7Recursion;

public class Q4ReverseNumber {
    static int sum = 0;

    public static void main(String[] args) {
        reverseNumber(152);
        System.out.println(sum);
    }

    private static void reverseNumber(int n) {

        if (n == 0) return;
        sum = sum * 10 + n % 10;
        reverseNumber(n / 10);

    }

}
