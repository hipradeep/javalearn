package dsanotes.basic.sorting;

public class MergeSort {


    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 7};
        int l=0;
        int h=nums.length-1;

        mergeSort(nums,l, h);
    }

    private static void mergeSort(int[] nums, int l, int h) {

        if (l<h){
            int mid =(l+h)/2;
            mergeSort(nums, l,mid);
            mergeSort(nums, mid+1, h);
            merge(nums,l, mid, h);
        }
    }

    private static void merge(int[] nums, int l, int mid, int h) {

    }
}
