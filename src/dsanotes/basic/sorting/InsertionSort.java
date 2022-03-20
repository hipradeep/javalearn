package dsanotes.basic.sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        // int[] arr={4, 3, 1, 2, 5};
        //int[] arr={1, 1, 1, 1, 1};
        int[] arr = {5, 4, 3, 2, 1};
        // int[] arr={1, 2, 3, 4, 5};
        //int[] arr={1};
        System.out.println(Arrays.toString(arr));
        int n = arr.length;
        insertionSort(arr, n);

    }

    private static void insertionSort(int[] arr, int n) {
        for (int i = 0; i < n-1; i++) {
            for(int j=i+1; j>0; j--){
                if (arr[j] < arr[j-1]){
                    swap(arr, j, j-1);
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        /*
        *   In INSERTION Sort, the array is divide in two sub-array, one is already sorted and from second one we pick
        *   one element and put it into sorted array
        *   we compare picked elements from end of  sorted array, if picked element is greater than the end element of sorted array
        *   then no need to check further
        *
        *       5   4   3   2   1
        *       i=0, j=1
        *       arr[1]<arr[0] (4<5) true, swap
        *       4   5   3   2   1
        *       i=1, j=2
        *       arr[2]<arr[1] (3<5) true, swap
        *       4   3   5   2   1
        *       i=1, j=1 (j--)
        *       arr[1]<arr[0] (3<4) true, swap
        *       3   4   5   2   1
        *       i=2, j=3
        *       arr[3] < arr[2] (2<5) true, swap
        *       3   4   2   5   1
        *       i=2, j=2 (j--)
        *       arr[2] < arr[1] (2<4) true, swap
        *       3   2   4   5   1
        *       i=2, j=1 (j--)
        *       arr[1],arr[0] (2<3) true, swap
        *       2   3   4   5   1
        *       i=3 j=4
        *       arr[4] < arr[3] (1<5) true, swap
        *       2   3   4   1   5
        *       i=3 j=3
        *       arr[3] < arr[2] (1<4) true, swap
        *       2   3   1   4   5
        *       i=3 j=2
        *       arr[2] < arr[1] (1<3) true, swap
        *       2   1   3   4   5
        *       i=3 j=1
        *       arr[1] < arr[0] () true, swap
        *       1   2   3   4   5
        *       i=4 > (4-1) n-1
        *       exit loop
        *
        * */
    }

    static void swap(int[] arr, int first, int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
