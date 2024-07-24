package leetcode.alpha10._3_longest_substring;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {
    public static void main(String[] args) {

        String s="abcabcbb";
        String s1="bbbbb";
        String s2="pwwkew";
        String s3="a";

        System.out.println(lengthOfLongestSubstring(s));
        System.out.println(lengthOfLongestSubstring(s1));
        System.out.println(lengthOfLongestSubstring(s2));
        System.out.println(lengthOfLongestSubstring(s3));
    }

    public static int lengthOfLongestSubstring(String s) {
        int ans = 0;
        int[] count = new int[128];

        for (int l = 0, r = 0; r < s.length(); ++r) {
            ++count[s.charAt(r)];
            while (count[s.charAt(r)] > 1)
                --count[s.charAt(l++)];
            ans = Math.max(ans, r - l + 1);
        }
        return ans;
    }
    public static int lengthOfLongestSubstring3(String s) {

        Set<Character> set=new HashSet<>();
        int res=0;
        int l=0;
        for(int r=0;r<s.length();r++) {
            //remove all duplicate s.charAt(r)
            while (set.contains(s.charAt(r))) {
                set.remove(s.charAt(l));
                l++;
            }
            //add next r char
            set.add(s.charAt(r));
            //find max of res and windows size
            res = Math.max(res, r - l + 1);
        }
            return res;
    }


    public static int lengthOfLongestSubstring2(String s) {
        Set<Character> set=new HashSet<>();
        int maxLength=0;
        int left=0;
        for(int right=0;right<s.length();right++){

            if(set.contains(s.charAt(right))){
                while(s.charAt(left)!=s.charAt(right)){
                    set.remove(s.charAt(left));
                    left++;
                }
                set.remove(s.charAt(left));left++;
                set.add(s.charAt(right));
            }else{
                set.add(s.charAt(right));
                maxLength=Math.max(maxLength,right-left+1);
            }

        }
        return maxLength;
    }
}
