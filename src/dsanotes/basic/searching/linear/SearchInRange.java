package dsanotes.basic.searching.linear;

public class SearchInRange {
    public static void main(String[] args) {
        int[] nums = {23, 45, 1, 2, 8, 19, -3, 16, -11, 28};
        int target = 19;

        int index=searchInRange(nums,target, 3, 6);
        System.out.println(index);
    }

    //start and end included
    private static int searchInRange(int[] nums,int target, int start, int end) {
        if (start > end) return -1;
        if (nums.length <= 0) return -1;

        for (int i = start; i <= end; i++) {
            if (nums[i] == target) return i;
        }
        return -1;
    }
}
