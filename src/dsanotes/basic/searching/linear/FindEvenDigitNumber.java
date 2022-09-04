package dsanotes.basic.searching.linear;

public class FindEvenDigitNumber {
    public static void main(String[] args) {
        int[] nums = {23, 45, 1, 2, 8, 19, -30, 16, -11, 28};

        int c = findEvenDigitNumber2(nums);
        System.out.println(c);
    }

    private static int findEvenDigitNumber(int[] nums) {
        if (nums.length == 0) return -1;
        int count = 0;
        for (int a : nums) {
            a = a < 0 ? -a : a;
            if ((a + "").length() % 2 == 0) {
                count = count + 1;
            }
        }
        return count;
    }

    private static int findEvenDigitNumber2(int[] nums) {
        if (nums.length == 0) return -1;
        int count = 0;
        for (int a : nums) {
            a = a < 0 ? -a : a;
            if (((int)(Math.log10(a)) + 1) % 2 == 0) {
                count = count + 1;
            }
        }
        return count;
    }
}
