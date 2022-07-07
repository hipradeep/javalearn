package assignment.jul7Recursion;

public class Q7Palindrome {
    static int sum = 0;

    public static void main(String[] args) {
        int p=121;
        reverseNumber(p);
        if (p==sum) System.out.println("Palindrome");
        else System.out.println("Not Palindrome");
    }
    private static void reverseNumber(int n) {
        if (n == 0) return;
        sum = sum * 10 + n % 10;
        reverseNumber(n / 10);
    }
}


