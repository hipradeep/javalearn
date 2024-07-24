package leetcode.alpha10._53_max_subarray;

public class MaxSubArray {
    //KADEN ALGORITHM
    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubArray(nums));
    }

    public static int maxSubArray(int[] nums) {
        int currsum = 0, maxsum = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            currsum = currsum + nums[i];
            maxsum = Math.max(maxsum, currsum);
            if (currsum <= 0) {
                currsum = 0;
            }
        }
        return maxsum;
    }
}
