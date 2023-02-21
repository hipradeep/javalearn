package leetcode.blind;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums= {2,1,5,3};
        int target=4;

        int[] ans=twoSum(nums, target);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map=new HashMap();
        int[] ans =new int[2];

        for(int i=0; i< nums.length; i++){
            int a= target-nums[i];
            if(map.containsKey(a)){
                ans[0] = map.get(a);
                ans[1]=i;
            }else{
                map.put(nums[i], i);
            }
        }
        return ans;

    }
}
