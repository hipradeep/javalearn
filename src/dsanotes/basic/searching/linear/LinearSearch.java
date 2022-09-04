package dsanotes.basic.searching.linear;

public class LinearSearch {
    public static void main(String[] args) {

        int[] nums = {23, 45, 1, 2, 8, 19, -3, 16, -11, 28};
        int target = 19;
        //int targetIndex=linerSearch(nums, target);
        int targetNumber = linerSearch2(nums, target);

        System.out.println(targetNumber);
    }

    //return target
    private static int linerSearch3(int[] nums, int target) {
        if (nums.length <= 0) return -1;

        for (int a : nums) {
            if (a == target) return a;
        }
        return -1;
    }

    //return target
    private static int linerSearch2(int[] nums, int target) {
        if (nums.length <= 0) return -1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) return target;
        }
        return -1;
    }


    //return target index
    private static int linerSearch(int[] nums, int target) {
        if (nums.length <= 0) return -1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) return i;
        }
        return -1;
    }
}
