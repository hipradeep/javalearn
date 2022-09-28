package dsanotes.basic.searching.binarysearch;

public class SearchInMountainArray {
    //bionic array
    public static void main(String[] args) {
        int[] nums = {-1, 2, 7, 10, 12, 9, 8, 3, 1, 0};
        //int[] nums = {0, 2, 1, 0};
        int target = 9;
        
        int index = searchInMountain(nums, target);
        System.out.println(index);
    }

    private static int searchInMountain(int[] nums, int target) {
        int peakIndex = peakIndex(nums);
        if (nums[peakIndex]==target){
            return peakIndex;
        }
      int ft = searchBinary(nums, target, 0,peakIndex);

        if (ft==-1){
          ft =  searchBinary(nums, target, peakIndex+1,nums.length-1);
        }
        return ft;
    }

    private static int searchBinary(int[] nums, int target, int start, int end) {

        boolean isAsc = nums[start] < nums[end];

        while(start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target < nums[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > nums[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
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
