package dsanotes.basic.sorting;

public class BubbleSort {

    //also known as sinking sort, exchange sort
    // with each iteration the largest element goes at end
    public static void main(String[] args) {
        // int[] arr={4, 3, 1, 2, 5};
        //int[] arr={1, 1, 1, 1, 1};
        int[] arr = {5, 4, 3, 2, 1};
        // int[] arr={1, 2, 3, 4, 5};
        //int[] arr={1};

        int n = arr.length;
        bubbleSortOpt(arr, n);
    }

    //optimise solution
    private static void bubbleSortOpt(int[] arr, int n) {
        printArr(arr);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1 - i; j++) {  //exclude that elements that reach already at end
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j);
                }
            }
        }
        printArr(arr);
        /*
         * Optimization for bubble sort , why we iterate loop for those elements which are already sorted
         * in second loop 'j<n-1-i' exclude that elements that are already sorted at end
         * */
    }


    //non optimise solution
    private static void bubbleSort(int[] arr, int n) {
        printArr(arr); //before sorting
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j);
                }
            }
        }
        printArr(arr); // after sorting
    }

    //swap elements
    private static void swap(int[] arr, int j) {
        int temp = arr[j];
        arr[j] = arr[j + 1];
        arr[j + 1] = temp;
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

                 Ω(n)               θ(n^2)                 θ(n^2)

 */