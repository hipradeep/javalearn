package recursion.sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {4, 2, 1, 0, -9};
        System.out.println(Arrays.toString(arr));
        selectionSort(arr, 0, 0, 1);
        System.out.println(Arrays.toString(arr));
    }

    private static void selectionSort(int[] arr, int min, int i, int j) {
        if (i >= arr.length) return;
        if (j < arr.length) {
            if (arr[min] > arr[j]) selectionSort(arr, j, i, j + 1);
            else selectionSort(arr, min, i, j + 1);
        } else {
            swap(arr, min, i);
            selectionSort(arr, i + 1, i + 1, i + 2);
        }

    }

    static void swap(int[] arr, int first, int second) {
        int temp = 0;
        temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
