package dsanotes.basic.searching.binarysearch;

public class FloorOfNumber {
    public static void main(String[] args) {
       // int[] nums = {-30, -11, 1, 2, 8, 16, 19, 23, 28, 45};
        int[] nums = {1, 3, 12, 15, 16, 18};

        int target=13;
        int a = floorOfNumber(nums, target);
        System.out.println(a);
    }

    private static int floorOfNumber(int[] nums, int target) {
        if (nums.length==0) return -1;
        int start=0, end=nums.length-1;
        int  mid = start + (end - start) / 2;

        while(start<=end){
            if(target > nums[mid]){
                start=mid+1;
            }else if (target < nums[mid]) {
                end = mid - 1;
            } else if (nums[mid] == target) {
                return nums[mid]; //or exact same number
            }
            mid = start + (end - start) / 2;
        }
        //when while loop is break start=end +1;
        return nums[end]; // returning floor
    }
}
