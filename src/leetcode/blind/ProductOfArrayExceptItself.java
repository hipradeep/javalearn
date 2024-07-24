package leetcode.blind;



import java.util.Arrays;

public class ProductOfArrayExceptItself {
    public static void main(String[] args) {
        int[] nums={1,3,7,6,2};

        System.out.println(Arrays.toString(productExceptSelf(nums)));
        System.out.println(Arrays.toString(productOfArrayExceptItself(nums)));
    }

    private static int[] productOfArrayExceptItself(int [] nums) {
        int[] right =new int[nums.length];
        int prod=1;
        for(int i=nums.length-1; i>0;i--){
            prod = prod * nums[i];
            right[i]=prod;
        }
        int[] ans =new int[nums.length];
        prod=1;
        for (int i=0; i< nums.length-1;i++){
            int lp=prod;
            int rp=right[i+1];
            ans[i]=lp*rp;
            prod=prod* nums[i];

        }
        ans[nums.length-1]=prod;
        return ans;
    }

    private static int[] productExceptSelf(int[] nums) {

        int ans[] = new int[nums.length];
        int pre = 1, post = 1;

        for(int i=0;i<nums.length;i++){
            ans[i] = pre;
            pre=pre * nums[i];
        }

        for(int i=nums.length-1;i>=0;i--){
            ans[i]=ans[i] * post;
            post=post * nums[i];
        }

        return ans;
    }
}


