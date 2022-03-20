package dsanotes.recursion;

class RecursionLevel1 {
    static int sum = 0;
    static int c = 0;

    public static void main(String[] args) {

        System.out.println(countTheSpteps(41));

    }

    // System.out.println(countTheSpteps(41));
    static int countTheSpteps(int n) {
        // count the steps to reduse value to 0
        return countStepHelper(n, 0);
    }

    private static int countStepHelper(int n, int i) {
        if (n == 0)
            return i;
        if (n % 2 == 0) {
            return countStepHelper(n / 2, i + 1);
        } else {
            return countStepHelper(n - 1, i + 1);
        }
    }
    //  System.out.println(countNumbers2(1140500410, 4));
    static int countNumbers2(int n, int i) {
        // count digits in number
        return counttNumbersHealper(n, i, 0);
    }

    static int counttNumbersHealper(int n, int i, int c) {
        if (n == 0)
            return c;
        if (n % 10 == i) {
            return counttNumbersHealper(n / 10, i, c + 1);
        } else {
            return counttNumbersHealper(n / 10, i, c);
        }
    }

    // countNumbers1(11425041);
    // System.out.println(c);
    static void countNumbers1(int n) {
        // count Number using third variable , c
        System.out.println(n);
        if (n == 0)
            return;
        if (n % 10 == 1) {
            c = c + 1;
            System.out.println(1);
        }
        countNumbers1(n / 10);
    }

    // System.out.println( isPalindrom(11211));
    static boolean isPalindrom(int n) {
        // chacking number is palindrom or not
        return n == rev3(n);
    }

    // System.out.println( rev3(14523004));
    static int rev3(int n) {
        // revers number
        int d = (int) Math.log10(n) + 1;
        return hepler(n, d);
    }

    static int hepler(int n, int digits) {
        if (n % 10 == n)
            return n;
        int rem = n % 10;
        return (int) (rem * Math.pow(10, digits - 1) + hepler(n / 10, digits - 1));
    }

    // rev2(1234);
    // System.out.println(sum); -> 4321
    static void rev2(int n) {
        // revers number using third variable, sum
        if (n == 0)
            return;
        sum = sum * 10 + n % 10;
        rev2(n / 10);
    }

    // rev1(1234) --> 4 3 2 1
    static void rev1(int n) {
        // print digis from end to start, print single single digits
        if (n % 10 == n) {
            System.out.print(" " + n);
            return;
        }
        System.out.println(n % 10);
        rev1(n / 10);
    }

    static int productOfDigits(int n) {
        // Product of digits
        if (n % 10 == n)
            return n;
        return n % 10 * productOfDigits(n / 10);
    }

    static int sumOfDigits(int n) {
        // Sum of digits
        if (n == 0)
            return 0;
        return n % 10 + sumOfDigits(n / 10);
    }

    static void printAllNumberTill_n(int n) {
        // Print all number till n
        if (n < 1)
            return;

        printAllNumberTill_n(n - 1);
        System.out.print(" " + n);
    }

    static void printAllNumberTill_0(int n) {
        // Print all number till 0
        if (n < 1)
            return;
        System.out.print(" " + n);
        printAllNumberTill_0(n - 1);

    }

    static void printAllNumberTillBoth(int n) {
        // Print both
        if (n < 1)
            return;
        System.out.print(" " + n);
        printAllNumberTillBoth(n - 1);
        System.out.print(" " + n);
    }

}