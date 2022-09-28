package dsanotes.basic.searching.binarysearch;

public class IndexInInfiniteArray {
    public static void main(String[] args) {
        int[] nums = {-30, -11, 1, 2, 8, 16, 19, 23, 28, 45,100,120,121,135,188,191,201,224};
        int target = 23;
        System.out.println(findIndex(nums, target));
    }

    private static int findIndex(int[] nums, int target) {
        //finding range, start with size 1 of array
        int start = 0;
        int end = 1;

        while (target > nums[end]) {
            int sTemp = end + 1; //new start
            //new end, size of range(box) is (end -(start-1))
            //double the box
            end = end + (end - start + 1) * 2;
            start = sTemp;
        }
        return searchBinary(nums, target, start, end);
    }

    private static int searchBinary(int[] nums, int target, int start, int end) {

        if (nums.length == 0) return -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else if (nums[mid] == target) {
                return mid;
            }
        }
        return -1;
    }
}
