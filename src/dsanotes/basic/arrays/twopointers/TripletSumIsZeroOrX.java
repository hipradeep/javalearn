package dsanotes.basic.arrays.twopointers;

import java.util.Arrays;

public class TripletSumIsZeroOrX {
    //Given an array of distinct elements. The task is to find triplets in the array whose sum is zero.
    public static void main(String[] args) {
       // int[] arr = {1, -2, 1, 0, 5};
        int[] arr ={1, 2, 3, 4, 5};
        // int[] arr = {0, -1, 2, -3, 1};
        int n = arr.length;
        int x = 9;  //x=0;

        //tripletSumIsZero(arr, n, x);
        tripletSumIsZero2(arr, n, x);
        //findTriplets(arr, n);
    }

    private static void tripletSumIsZero2(int[] arr, int n, int x) {

        //O(n^2)
        Arrays.sort(arr);
        for (int z = 0; z < n - 1; z++) {
            helper(arr, z, x);
        }
    }

    static void helper(int[] arr, int index, int p) {

        int x = arr[index];
        int i = index + 1, j = arr.length - 1;
        while (i < j) {
            if ((arr[i] + arr[j] + x == p)) {
                System.out.println(arr[index] + " " + arr[i] + " " + arr[j]);
                 i += 1;j -= 1;
            } else if (arr[i] + arr[j] + x < p) i += 1;
            else j -= 1;
        }
    }

    static void findTriplets(int arr[], int n) {
        boolean found = false;

        Arrays.sort(arr);

        for (int i = 0; i < n - 1; i++) {
            int l = i + 1;
            int r = n - 1;
            int x = arr[i];
            while (l < r) {
                if (x + arr[l] + arr[r] == 0) {
                    System.out.print(x + " ");
                    System.out.print(arr[l] + " ");
                    System.out.println(arr[r] + " ");

                    l++;
                    r--;
                    found = true;
                } else if (x + arr[l] + arr[r] < 0)
                    l++;

                else
                    r--;
            }
        }

        if (found == false)
            System.out.println(" No Triplet Found");
    }

    private static void tripletSumIsZero(int[] arr, int n, int x) {

        //O(n^3)
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (i == j || j == k) continue;
                    if ((arr[i] + arr[j] + arr[k]) == x) {
                        System.out.println(arr[i] + " " + arr[j] + " " + arr[k]);
                    }
                }

            }
        }
    }
}
