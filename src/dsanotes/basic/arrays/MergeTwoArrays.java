package dsanotes.basic.arrays;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class MergeTwoArrays {
    public static void main(String[] args) {
        int[] a = {1, 3, 5, 7};
        int[] b = {2, 4, 6, 8};
        int m = a.length;
        int n = b.length;
      //  mergeTwoArray1(a, b, m, n);
        mergeTwoArrayUsingMap(a, b, m, n);
    }

    //Time Complexity : O(n1 + n2)
    private static void mergeTwoArray1(int[] a, int[] b, int m, int n) {

        int[] c = new int[m + n];
        int i = 0, j = 0, k = 0;

        while (i < m && j < n) {
            if (a[i] < b[j]) c[k++] = a[i++];
            else c[k++] = b[j++];
        }
        // Store remaining elements of first array
        //for ( ; i < m; i++) c[k++] = a[i];
        while (i < m)   c[k++] = a[i++];

        // Store remaining elements of second array
        //for (; j < n; j++)   c[k++] = b[j];
        while (j < n)  c[k++] = b[j++];

        System.out.println(Arrays.toString(c));
    }

    private static void mergeTwoArrayUsingMap(int[] a, int[] b, int m, int n){

        //tree map maintain sorted order
        Map<Integer,Boolean> c = new TreeMap<Integer,Boolean>();

        for(int i = 0; i < n; i++)
        {
            c.put(a[i], true);
        }
        for(int i = 0;i < m;i++)
        {
            c.put(b[i], true);
        }

        for(Map.Entry<Integer, Boolean> entry : c.entrySet()) {
            System.out.println( entry.getKey());
        }

    }
}
