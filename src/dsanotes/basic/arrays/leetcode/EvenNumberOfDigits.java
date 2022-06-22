package dsanotes.basic.arrays.leetcode;

public class EvenNumberOfDigits {
    //Given an array nums of integers, return how many of them contain an even number of digits.
    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, 7896, 56, 458};

        int even = findNumbers(nums);
        System.out.println(even);
    }

    public static int findNumbers(int[] nums) {
        int evn = 0;
        for (int n : nums) {
            int count = 0;
            do {
                n = n / 10;
                count = count + 1;
            } while (n > 0);
            if (count % 2 == 0) {
                evn = evn + 1;
            }
        }
        return evn;
    }
}
