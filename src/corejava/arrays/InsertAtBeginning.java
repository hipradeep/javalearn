package corejava.arrays;

import java.util.Arrays;

public class InsertAtBeginning {
    public static void main(String[] args) {
        int[] nums =new int[6];
        nums[0]=10;
        nums[1]=2;
        nums[2]=6;
        nums[4]=7;
        nums[5]=5;
        System.out.println(Arrays.toString(nums));

        int k=20;

        for (int i = nums.length-1; i>0; i--) {
            nums[i]=nums[i-1];
        }

        nums[0]=k;
        System.out.println(Arrays.toString(nums));

    }
}
