package dsanotes.basic.arrays.leetcode;

public class Consecutive1sInBinaryArray {
    //Given a binary array, find the maximum number of consecutive 1s in this array.
    public static void main(String[] args) {

        int[] nums={0,1,1,0,1,1,0,1,1,1};

        int max=findMaxConsecutiveOnes(nums);
        System.out.println(max);
    }

    public static int findMaxConsecutiveOnes(int[] nums) {

        int cont=0;
        int max=0;
        for (int num : nums) {
            if (num == 1) {
                cont = cont + 1;
                if (cont > max) {
                    max = cont;
                }
            } else {
                cont = 0;
            }
        }
        return max;
    }
}

