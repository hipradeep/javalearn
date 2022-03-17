package recursion.sorting;

public class BubbleSort {

    public static void main(String[] args) {

    }

    static void bubbleSort(int[] arr, int i){

        int temp=0;

        if(arr[i] > arr[i+1]){
            temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
            bubbleSort(arr, i+1);
        }else {
            bubbleSort(arr, 0);
        }

    }
}
