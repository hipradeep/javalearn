package dsanotes.basic.searching.binarysearch;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {

        int[] nums = {-30, -11, 1, 2, 8, 16, 19, 23, 28, 45};
        int target=-30;
        //Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        int index=searchBinary(nums, target, 0, nums.length-1);
        System.out.println(index);
    }

    private static int searchBinary(int[] nums, int target, int start, int end) {

        if (nums.length==0) return -1;
       // int  mid = (start + end) / 2;
        int  mid = start + (end - start) / 2;

        while (start <= end) {
            if (nums[mid] > target) {
                end = mid - 1;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else if (nums[mid] == target) {
               return mid;
            }
            mid = (start + end) / 2;
        }
        return  -1;
    }
}
