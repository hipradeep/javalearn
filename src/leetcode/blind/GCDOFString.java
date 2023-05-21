package leetcode.blind;

public class GCDOFString {

    public static void main(String[] args) {
        String w1="abcabc";
        String w2="abc";

        System.out.println(gcdOfStrings(w1,w2));
    }

    private static String gcdOfStrings(String w1, String w2) {
        int n1=w1.length();
        int n2=w2.length();
        if(!(w1 + w2).equals(w2 + w1)) return "";
        return w1.substring(0, gcd(n1,n2));
    }

    public static int gcd(int x, int y) {
        if (y == 0) return x;
         else return gcd(y, x % y);
    }

}
