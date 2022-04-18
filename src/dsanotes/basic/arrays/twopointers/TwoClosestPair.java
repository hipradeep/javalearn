package dsanotes.basic.arrays.twopointers;

public class TwoClosestPair {
    //Given two sorted arrays and a number x, find the pair whose sum is closest to x
    // and the pair has an element from each array.
    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 7};
        int[] brr = {10, 20, 30, 40};
        int an = arr.length;
        int bn = brr.length;
        int x = 50;

        //closestPairs(arr, brr, an, bn, x);
        closestPairsTwoPointer(arr, brr, an, bn, x);
    }

    private static void closestPairsTwoPointer(int[] arr, int[] brr, int an, int bn, int x) {
        // O(n)
        int minDiff = Integer.MAX_VALUE;
        int i = 0, j = bn - 1;
        int k = 0, t = 0;
        while (i < an && j >= 0) {

            if (Math.abs(arr[i] + brr[j] - x) < minDiff) {
                k = i;
                t = j;
                minDiff = Math.abs(arr[i] + brr[j] - x);
            }
            if (arr[i] + brr[j] > x) j--;
            else i++;
        }
        System.out.println(arr[k] + "  " + brr[t]);

    }

    private static void closestPairs(int[] arr, int[] brr, int an, int bn, int x) {

        //O(n^2)
        int minDiff = Integer.MAX_VALUE;

        int k = 0, t = 0;
        for (int i = 0; i < an; i++) {
            for (int j = 0; j < bn; j++) {
                int p = (arr[i] + brr[j]) - x;  //Math.abs(arr[i] + brr[j] - x);
                p = (p < 0) ? -p : p;
                if (p < minDiff) {
                    k = i;
                    t = j;
                    minDiff = (arr[i] + brr[j]) - x;
                    minDiff = (minDiff < 0) ? -minDiff : minDiff;
                }
            }
        }
        System.out.println(arr[k] + "  " + brr[t]);

    }


}
