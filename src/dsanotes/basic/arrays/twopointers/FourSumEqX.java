package dsanotes.basic.arrays.twopointers;

import java.util.Arrays;

public class FourSumEqX {
    //Find four elements that sum to a given value
    public static void main(String[] args) {

        int[] arr ={10, 20, 30, 40, 1, 2};

        int n = arr.length;
        int x = 91;

        tripletSumIsZero2(arr, n, x);

    }

    private static void tripletSumIsZero2(int[] arr, int n, int x) {

        //O(n^3)
        Arrays.sort(arr);
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n ; j++) {
                    int k= j+1, p = arr.length - 1;
                    while (k < p) {
                        if ((arr[i] + arr[j] +arr[k] +arr[p] == x)) {
                            System.out.println(arr[i] + " " + arr[j] + " " + arr[k]+" "+arr[p]);
                            k += 1;p -= 1;
                        } else if (arr[i] + arr[j] +arr[k] +arr[p] < x) k += 1;
                        else p -= 1;
                    }
            }
        }


    }


}
