package dsanotes.basic.arrays.twopointers;

import java.util.Arrays;

public class TripletSumOfTwoEqThird {
    //Given an array of distinct elements. The task is to find triplets in the array whose sum is zero.
    public static void main(String[] args) {
       // int[] arr = {1, -2, 1, 0, 5};
        int[] arr ={1, 2, 3, 4, 5};
       // int[] arr ={5, 32, 1, 7, 10, 50, 19, 21, 2};

        int n = arr.length;
        int x = 0;  //x=0;

        tripletSumOfTwoEqThird(arr, n, x);

    }

    private static void tripletSumOfTwoEqThird(int[] arr, int n, int x) {

        //O(n^2)
        Arrays.sort(arr);

        for (int z =n-1; z >0; z--) {
            helper(arr, z, x);
        }
    }

    static void helper(int[] arr, int index, int p) {

        int x = -arr[index];
        int i = 0, j = index - 1;
        while (i < j) {
            if ((arr[i] + arr[j] + x == p)) {
                System.out.println(arr[index] + " " + arr[i] + " " + arr[j]);
                 i += 1;j -= 1;
            } else if (arr[i] + arr[j] + x < p) i += 1;
            else j -= 1;
        }
    }

}
