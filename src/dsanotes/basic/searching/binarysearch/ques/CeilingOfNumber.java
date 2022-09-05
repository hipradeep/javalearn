package dsanotes.basic.searching.binarysearch.ques;

public class CeilingOfNumber {
    public static void main(String[] args) {

        int[] nums = {-30, -11, 1, 2, 8, 16, 19, 23, 28, 45};

        int target=24;

        int a = ceilingOfNumber(nums, target);
        System.out.println(a);
    }

    private static int ceilingOfNumber(int[] nums, int target) {
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
        return nums[start]; // returning ceiling
    }
}
