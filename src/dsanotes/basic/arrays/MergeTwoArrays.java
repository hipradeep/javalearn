package dsanotes.basic.arrays;

import java.util.Arrays;

public class MergeTwoArrays {
    public static void main(String[] args) {
        int[] a = {7};
        int[] b = {};
        int m = a.length;
        int n = b.length;
        mergeTwoArray1(a, b, m, n);
    }

    private static void mergeTwoArray1(int[] a, int[] b, int m, int n) {

        int[] c = new int[m + n];
        int i = 0, j = 0, k = 0;

        while (i < m && j < n) {
            if (a[i] < b[j])
                c[k++] = a[i++];
            else c[k++] = b[j++];
        }
        for ( ; i < m; i++) {
            c[k++] = a[i];
        }
        for (; j < n; j++) {
            c[k++] = b[j];
        }

        System.out.println(Arrays.toString(c));
    }
}
