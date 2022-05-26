package practice.test;

import java.util.Arrays;

public class SelectionSort {


    public static void main(String[] args) {
        int[] arr = {4, 3, 1, 2, 5};

        System.out.println(Arrays.toString(arr));
        int n = arr.length;
        selectionSort2(arr, n);
    }


    private static void selectionSort2(int[] arr, int n) {

        for (int i=0; i < n; i++) {
            int last =n-1-i;
            int max=0;
            for (int j = 0; j <=last; j++) {
                if (arr[max] < arr[j])
                    max = j;
            }
            int temp = arr[max];
            arr[max] = arr[last];
            arr[last] = temp;
        }
        System.out.println(Arrays.toString(arr));

    }

}
