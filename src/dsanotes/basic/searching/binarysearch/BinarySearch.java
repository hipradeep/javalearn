package dsanotes.basic.searching.binarysearch;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {

        int[] nums = {-30, -11, 1, 2, 8, 16, 19, 23, 28, 45};
        int target=-30;
        //Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        int index=searchBinary(nums, target);
        //search in range
        //int index=searchBinary2(nums, target, 0, nums.length-1);
        System.out.println(index);
    }

    private static int searchBinary(int[] nums, int target) {

        if (nums.length==0) return -1;

        int start=0, end=nums.length-1;
        int  mid = start + (end - start) / 2;

        while (start <= end) {
            if ( target < nums[mid] ) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else if (nums[mid] == target) {
               return mid;
            }
            mid = start + (end - start) / 2;
        }
        return  -1;
    }
    private static int searchBinary2(int[] nums, int target, int start, int end) {

        if (nums.length==0) return -1;

        while (start <= end) {
            int  mid = start + (end - start) / 2;
            if ( target < nums[mid] ) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else if (nums[mid] == target) {
               return mid;
            }
        }
        return  -1;
    }
}
