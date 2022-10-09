package practice.strings50;

import java.util.Arrays;

public class ReverseStringArray {

    public static void main(String[] arg) {
//        Solution1 sol = new Solution1();
//
//        String[] s = {"h", "e", "l", "l", "o"};
//
//        System.out.println(Arrays.toString(s));
//        sol.reverseString(s);
//        System.out.println(Arrays.toString(s));

        System.out.println(isPalindrome("geeg"));

    }

    static boolean isPalindrome(String s) {
        String str = "";
        if (s.length() == 0) return false;

        for (int i = s.length() - 1; i >= 0; i--) {
            str = str + s.charAt(i);
        }
//        if(s.equalsIgnoreCase(str)){
//            return true;
//        }
        if (s.equals(str)) {
            return true;
        }
        return false;
    }

}

class Solution1 {
    public void reverseString(String[] s) {
        int l = s.length;
        for (int i = l - 1, j = 0; j <= i; i--, j++) {
            String temp = s[j];
            s[j] = s[i];
            s[i] = temp;
        }
    }
}
