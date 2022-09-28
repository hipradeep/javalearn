package dsanotes.basic.searching.binarysearch.ques;

public class FirstAndLastIndex {
    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        //            0  1  2  3  4  5

        int target=8;

        int[] a = firstAndLastNumber(nums, target);
        System.out.println(a[0] +" "+a[1]);
    }

    private static int[] firstAndLastNumber(int[] nums, int target) {

     int[] index={-1, -1};
        int start=search(nums, target, true);
        int end=search(nums, target, false);
        index[0]=start;
        index[1]=end;
        return index;
    }
    static int search(int[] nums, int target, boolean isStartIndex){
        int i=-1;
        int start=0, end=nums.length-1;

        while(start<=end){
            int  mid = start + (end - start) / 2;
            if(target > nums[mid]){
                start=mid+1;
            }else if (target < nums[mid]) {
                end = mid - 1;
            } else if (nums[mid] == target) {
                i=mid;
                if (isStartIndex) end=mid-1;
                else start=mid+1;
            }
        }
        return i;
    }
}
