package dsanotes.basic.sorting;

import java.util.Arrays;

public class MergeSort {


    public static void main(String[] args) {
        //int[] nums = {1, 3, 5, 7};
        int[] nums= { 12, 11, 13, 5, 6, 7 };
        int l=0;
        int h=nums.length-1;

        System.out.println("\nUnSorted array");
        System.out.println(Arrays.toString(nums));

        mergeSort(nums,l, h);

        System.out.println("\nSorted array");
        System.out.println(Arrays.toString(nums));
    }

    private static void mergeSort(int[] nums, int l, int h) {

        if (l<h){
            int mid =(l+h)/2;
            mergeSort(nums, l,mid);
            mergeSort(nums, mid+1, h);
            merge(nums,l, mid, h);
        }
    }


    private static void merge(int arr[], int l, int mid, int h)
    {

        int n1 = mid - l + 1;
        int n2 = h - mid;

        //Create temp arrays
        int L[] = new int[n1];
        int R[] = new int[n2];


        //Copy data to temp arrays
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[mid + 1 + j];

        int i = 0, j = 0;


        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
}
