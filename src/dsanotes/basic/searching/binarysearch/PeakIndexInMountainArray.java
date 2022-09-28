package dsanotes.basic.searching.binarysearch;

public class PeakIndexInMountainArray {
    //bionic array
    public static void main(String[] args) {
        int[] nums = {-1, 2, 7, 10, 12, 9, 8, 3, 1, 0};
        //int[] nums = {0, 2, 1, 0};
        int index = peakIndex(nums);

        System.out.println(index);
    }

    private static int peakIndex(int[] nums) {
        int start = 0, end = nums.length - 1;

        while (start < end) {

            int mid = start + (end - start) / 2;

            if (nums[mid] > nums[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }
}
