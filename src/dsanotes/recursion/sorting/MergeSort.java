package dsanotes.recursion.sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {10, -12, 2};
        int n = arr.length;

        mergeSort(arr, 0, n - 1);
        System.out.println(Arrays.toString(arr));
    }

    private static void mergeSort(int[] arr, int s, int e) {
        if (s >= e) return;
        int mid = (s + e) / 2;
        mergeSort(arr, s, mid);
        mergeSort(arr, mid + 1, e);
        mergeArray(arr, s, e);
    }

    private static void mergeArray(int[] arr, int s, int e) {
        int mid = (s + e) / 2;
        int l1 = mid - s + 1, l2 = e - mid;
        int[] arr1 = new int[l1];
        int startIndex = s;
        for (int i = 0; i < l1; i++) {
            arr1[i] = arr[startIndex++];
        }
        int[] arr2 = new int[l2];
        int midIndex = mid + 1;
        for (int i = 0; i < l2; i++) {
            arr2[i] = arr[midIndex++];
        }
        int i = 0, j = 0, k = s;
        while (i < l1 && j < l2) {
            if (arr1[i] < arr2[j]) arr[k++] = arr1[i++];
            else arr[k++] = arr2[j++];
        }
        for (; i < l1; i++)
            arr[k++] = arr1[i];
        for (; j < l2; j++)
            arr[k++] = arr2[j];
    }
}
