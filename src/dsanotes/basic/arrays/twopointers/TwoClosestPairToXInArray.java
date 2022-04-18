package dsanotes.basic.arrays.twopointers;

public class TwoClosestPairToXInArray {
    //Given a sorted array and a number x, find a pair in an array whose sum is closest to x.
    public static void main(String[] args) {
        int[] arr ={1, 3, 4, 7, 10};
        int n = arr.length;
        int x = 15;

        closestPair(arr, n, x);
    }

    private static void closestPair(int[] arr, int n, int x) {
        int minDiff = Integer.MAX_VALUE;
        int k = 0, t = 0;
        int i = 0, j = n - 1;
        while (i < n && j >= 0) {

            if (i==j){
                i++; j--;
                continue;
            }

            if (Math.abs(arr[i] + arr[j] - x) < minDiff) {
                k = i;
                t = j;
                minDiff = Math.abs(arr[i] + arr[j] - x);
            }
            if (arr[i] + arr[j] > x) j--;
            else i++;
        }
        System.out.println(arr[k] + "  " + arr[t]);
    }
}
