package practice.terminators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VoidClass {
}

class Test
{
    static int[] arr = new int[]{1, 2, 3, 4};
    static void subArray( int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(arr[j]+" ");
            }
            System.out.print(",");
        }
    }
    public static void main(String[] args) {
        subArray(arr.length);
    }
}

class Solution {
    public static void main(String[] args) {
        System.out.println(findAnagrams("abab", "ab"));
    }

    public static List<Integer> findAnagrams(String s, String p) {

        List<Integer> ans=new ArrayList<>();
        for(int i=0; i<s.length()-p.length()+1; i++){
            String k=s.substring(i, i+p.length());

            if(areAnagram(k.toCharArray(), p.toCharArray() )){
                ans.add(i);
            }

        }
        return ans;
    }

   static boolean areAnagram(char[] str1, char[] str2)
    {
        int n1 = str1.length;
        int n2 = str2.length;
        if (n1 != n2)
            return false;

        Arrays.sort(str1);
        Arrays.sort(str2);

        for (int i = 0; i < n1; i++)
            if (str1[i] != str2[i])
                return false;

        return true;
    }
}