package basic.sorting;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SelectionSort {

    //put the right element at right position

    public static void main(String[] args) {
        int[] arr = {4, 3, 1, 2, 5};
        //int[] arr={1, 1, 1, 1, 1};
        //int[] arr = {5, 4, 3, 2, 1};
        // int[] arr={1, 2, 3, 4, 5};
        //int[] arr={1};

        System.out.println(Arrays.toString(arr));
        int n = arr.length;
        selectionSort2(arr, n);
    }


    private static void selectionSort(int[] arr, int n) {

        for (int i = 0; i < n; i++) {
            int min = i;
            for (int j = i + 1; j < n - 1; j++) {
                if (arr[min] > arr[j])
                    min = j;
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        System.out.println(Arrays.toString(arr));

        /*
         * first find the min element index then replace it with first loop initial value
         * second loop help us find the 'min' index
         * after find the min index then swap elements
         * */
    }

    private static void selectionSort2(int[] arr, int n) {

        for (int i=0; i < n; i++) {
            int last =n-1-i; //imp
            int max=0;
            for (int j = 0; j <=last; j++) { // start from start
                if (arr[max] < arr[j])
                    max = j;
            }
            int temp = arr[max];
            arr[max] = arr[last];
            arr[last] = temp;
        }
        System.out.println(Arrays.toString(arr));
        /*
         * first find the max element index then replace it with Last loop initial value
         * second loop help us find the 'Max' index
         * after find the Max index then swap elements
         * */
    }

    //print array
    static void printArr(int[] array) {
        for (int a : array) {
            System.out.print(a + ", ");
        }
        System.out.println();
    }
}


/*
------------------------------------------------------------------------------------------------
        #Time complexity

                 Best               Average                Worst

                 Ω(n^2)              θ(n^2)                  θ(n^2)

 */