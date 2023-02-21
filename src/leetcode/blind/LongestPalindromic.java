package leetcode.blind;

public class LongestPalindromic {
    //5. Longest Palindromic
    public static void main(String[] args) {

        String s = "babad";
        //s="cbbd";

        // System.out.println(longestPalindrome(s));
        System.out.println(longestPalindromeOdd(s));
        //System.out.println(longestPalindromeEven(s));
    }

    private static String longestPalindrome(String s) {
        String ans = "";
        int sLen = 0;
        for (int i = 0; i < s.length(); i++) {
            //Odd
            int l = i;
            int r = i;
            while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
                if ((r - l + 1) > sLen) {
                    ans = s.substring(l, r + 1);
                    sLen = r - l + 1;
                }
                l -= 1;
                r += 1;

            }
            //even
            l = i;
            r = i + 1;
            while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
                if ((r - l + 1) > sLen) {
                    ans = s.substring(l, r + 1);
                    sLen = r - l + 1;
                }
                l -= 1;
                r += 1;

            }
        }
        return ans;
    }

    private static String longestPalindromeOdd(String s) {
        String ans = "";
        int sLen = 0;
        for (int i = 0; i < s.length(); i++) {
            //Odd
            int l = i;
            int r = i;
            while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
                if ((r - l + 1) > sLen) {
                    ans = s.substring(l, r + 1);
                    sLen = r - l + 1;
                }
                l -= 1;
                r += 1;

            }

        }
        return ans;
    }

    private static String longestPalindromeEven(String s) {
        String ans = "";
        int sLen = 0;
        for (int i = 0; i < s.length(); i++) {
            //even
            int l = i;
            int r = i + 1;
            while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
                if ((r - l + 1) > sLen) {
                    ans = s.substring(l, r + 1);
                    sLen = r - l + 1;
                }
                l -= 1;
                r += 1;

            }
        }
        return ans;
    }
}
