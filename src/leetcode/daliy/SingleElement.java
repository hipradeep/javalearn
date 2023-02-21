package leetcode.daliy;

public class SingleElement {
    public static void main(String[] args) {

        int[] nums={1,1,2,3,3,4,4,8,8};
        System.out.println(singleNonDuplicate(nums));
    }
    public static int singleNonDuplicate(int[] nums) {

            int l = 0;
            int r = nums.length - 1;

            while (l < r) {
                int m = (l + r) / 2;
                if (m % 2 == 1)
                    --m;
                if (nums[m] == nums[m + 1])
                    l = m + 2;
                else
                    r = m;
            }

            return nums[l];

    }
}
