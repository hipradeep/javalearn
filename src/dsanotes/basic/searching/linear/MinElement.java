package dsanotes.basic.searching.linear;

public class MinElement {
    public static void main(String[] args) {
        int[] nums = {23, 45, 1, 2, 8, 19, -3, 16, -11, 28};

        int min = findMin(nums);
        int max = findMax(nums);
        System.out.println("max - "+max+ " Min - "+min);
    }

    private static int findMax(int[] nums) {
        if (nums.length <= 0) return -1;
        int max = nums[0];
        for (int m : nums) {
            if (m > max) max = m;
        }
        return max;
    }
    private static int findMin(int[] nums) {
        if (nums.length <= 0) return -1;
        int min = nums[0];
        for (int m : nums) {
            if (m < min) min = m;
        }
        return min;
    }
}
