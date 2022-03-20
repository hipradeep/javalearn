package dsanotes.recursion.sorting;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {9, 6, 8};
        System.out.println(Arrays.toString(arr));
        bubbleSort2(arr, 0, 0);
       // bubbleSort(arr, arr.length-1, 0);
        System.out.println(Arrays.toString(arr));
    }

    static void bubbleSort2(int[] arr, int n, int j) {
        if (n > arr.length ) return;

        if (j < arr.length-1) {
            if (arr[j] > arr[j + 1])
                swap(arr, j, j + 1);
            bubbleSort2(arr, n, j + 1);
        } else
            bubbleSort2(arr, n + 1, 0);
    }

    static void bubbleSort(int[] arr, int n, int j) {
        if (n == 0) return;
        if (j < n) {
            if (arr[j] > arr[j + 1])
                swap(arr, j, j + 1);
            bubbleSort(arr, n, j + 1);
        } else
            bubbleSort(arr, n - 1, 0);
    }

    static void swap(int[] arr, int first, int second) {
        int temp = 0;
        temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
