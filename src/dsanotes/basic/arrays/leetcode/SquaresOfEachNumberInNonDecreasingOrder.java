package dsanotes.basic.arrays.leetcode;

public class SquaresOfEachNumberInNonDecreasingOrder {
    //Given an integer array nums sorted in non-decreasing order,
    // return an array of the squares of each number sorted in non-decreasing order.
    public static void main(String[] args) {
        int[] nums = {-4, -1, 0, 3, 10};
    }

    public static int[] sortedSquares(int[] nums) {
        int[] arr = new int[nums.length];

        for (int n : nums) {
            int k=n*n;

            for (int i = 0; i < arr.length; i++) {
                    if (k > arr[i]) {
                        for (int j = 0; j < arr.length; j++) {

                        }

                    }else {

                    }


            }

        }


        return arr;

    }
}
