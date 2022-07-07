package assignment.jul7Recursion;

public class Q2PrimeNumber {
    public static void main(String[] args) {

        int k=19;
        if (checkPrime(k, 2)) {
            System.out.println(k+ " is Prime Number ");
        } else {
            System.out.println(k+ " is NOT Prime Number ");
        }
    }

    private static boolean checkPrime(int n, int i) {

        if (i==n/2+1)
            //we reach at last
            return true;
        else if (n % i == 0)
            return false;
        else {
            return checkPrime(n, i + 1);
        }

    }

}
