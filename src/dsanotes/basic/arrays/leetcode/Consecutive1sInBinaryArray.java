package dsanotes.basic.arrays.leetcode;

public class Consecutive1sInBinaryArray {
    public static void main(String[] args) {

        int[] nums={0,1,1,0,1,1,0,1,1,1};

        int max=findMaxConsecutiveOnes(nums);
        System.out.println(max);
    }

    public static int findMaxConsecutiveOnes(int[] nums) {

        int cont=0;
        int max=0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 1){
                cont=cont+1;
                if (cont>max){
                    max=cont;
                }
            }else {
                cont=0;
            }
        }
        return max;
    }
}

