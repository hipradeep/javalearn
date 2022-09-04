package dsanotes.basic.searching.linear;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] nums = {
                {23, 4, 1},
                {18, 12, 3, 9},
                {78, 99, 34, 56},
                {18, 12}
        };

        int target=99;

        int[] index=findNum(nums, target);
        System.out.println(Arrays.toString(index));
        System.out.println(findMax(nums));
    }

    private static int[] findNum(int[][] nums, int target) {
        if(nums.length<=0) return new int[]{-1, -1};
        for (int row = 0; row < nums.length; row++) {
            for (int i = 0; i <nums[row].length ; i++) {
                if (target==nums[row][i]) return new int[]{row, i};
            }
        }
        return new int[]{-1, -1};
    }
    private static int findMax(int[][] nums) {
        if(nums.length<=0) return -1;
        int max=nums[0][0];
        for (int[] num : nums) {
            for (int j : num) {
                if (max < j) max = j;

            }
        }
        return max;
    }
}
