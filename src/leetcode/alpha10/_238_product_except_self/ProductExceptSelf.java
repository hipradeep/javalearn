package leetcode.alpha10._238_product_except_self;

import java.util.Arrays;

public class ProductExceptSelf {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int[] nums1 = {-1, 1, 0, -3, 3};

        System.out.println(Arrays.toString(productExceptSelf(nums)));
        System.out.println(Arrays.toString(productExceptSelf(nums1)));
    }

    private static int[] productExceptSelf(int[] nums) {
        int  n = nums.length;
        int[] res = new int[n];
        int left =1, right =1;

        for (int i = 0; i < n; i++) {
            res[i] = left;
            left =left* nums[i];
        }

        for (int i = n-1; i >=0 ; i--) {
            res[i] = res[i] * right;
            right =right* nums[i];
        }
        return  res;

    }


    public static int[] productExceptSelf33(int[] nums) {
        int ans[] = new int[nums.length];
        int pre = 1, post = 1;

        for (int i = 0; i < nums.length; i++) {
            ans[i] = pre;
            pre *= nums[i];
        }
        for (int i = nums.length - 1; i >= 0; i--) {
            ans[i] *= post;
            post *= nums[i];
        }
        return ans;
    }

    public static int[] productExceptSelf1(int[] nums) {
        int n = nums.length;
        int ans[] = new int[n];

        for (int i = 0; i < n; i++) {
            int pro = 1;
            for (int j = 0; j < n; j++) {
                if (i == j) continue;
                pro *= nums[j];
            }
            ans[i] = pro;
        }
        return ans;
    }

    //this solution is failed for if array contain 0
    private static int[] productExceptSelf2(int[] nums) {
        int[] ans = new int[nums.length];
        int allProd = 1;
        for (int k : nums) {
            allProd = allProd * k;
        }
        for (int i = 0; i < nums.length; i++) {
            ans[i] = allProd / nums[i];
        }

        return ans;
    }
}
