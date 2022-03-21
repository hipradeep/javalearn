package dsanotes.recursion.sorting;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr={45,20,25,56,14,78};
        int n=arr.length;

        mergeSort(arr, 0, n-1);
    }

    private static void mergeSort(int[] arr, int s, int e) {
        if(s>=e) return;

        int mid =(s+e)/2;
        System.out.println("mid "+mid);

        mergeSort(arr,s, mid);
        mergeSort(arr, mid+1, e);
        mergeArray(arr, s,e);
    }

    private static void mergeArray(int[] arr, int s, int e) {
        int mid =(s+e)/2;
        int l1=mid-s+1;
        int l2=e-mid;

        //while(s< mid && )
    }
}
