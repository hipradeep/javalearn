package leetcode.alpha10._56_merge_intervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeIntervals {
    public static void main(String[] args) {

        //int[][] nums = new int[][]{{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        int[][] nums = new int[][]{{1, 4}, {4, 5}};
        System.out.println(Arrays.deepToString(merge(nums)));
        System.out.println(Arrays.deepToString(merge2(nums)));
        System.out.println(Arrays.deepToString(merge3(nums)));
        System.out.println(Arrays.deepToString(merge4(nums)));
    }

    private static int[][] merge4(int[][] nums) {
        List<int[]> ans = new ArrayList<>();

        Arrays.sort(nums, Comparator.comparingInt(a -> a[0]));
        int lastInx=-1;
        for (int[] interval : nums)
            if (ans.isEmpty() || ans.get(lastInx)[1] < interval[0]) {
                ans.add(interval);
                lastInx++;
            } else {
                ans.get(lastInx)[1] = Math.max(ans.get(lastInx)[1], interval[1]);
            }

        return ans.toArray(new int[ans.size()][]);
    }

    private static int[][] merge3(int[][] nums) {
        List<int[]> ans = new ArrayList<>();

        Arrays.sort(nums, (a, b) -> (a[0] - b[0]));

        for (int[] interval : nums)
            if (ans.isEmpty() || ans.get(ans.size() - 1)[1] < interval[0])
                ans.add(interval);
            else
                ans.get(ans.size() - 1)[1] = Math.max(ans.get(ans.size() - 1)[1], interval[1]);

        return ans.toArray(new int[ans.size()][]);
    }


    private static int[][] merge(int[][] nums) {

        Arrays.sort(nums, Comparator.comparing(a -> a[0]));
        //Arrays.sort(nums, (a, b) -> (a[0] - b[0]));
        List<int[]> result = new ArrayList<>();
        result.add(new int[]{nums[0][0], nums[0][1]});

        int lastInx = 0;

        for (int[] k : nums) {
            int s = k[0];
            int e = k[1];

            if (s <= result.get(lastInx)[1]) {
                if (e > result.get(lastInx)[1]) {
                    result.get(lastInx)[1] = e;
                }
            } else {
                result.add(new int[]{s, e});
                lastInx++;
            }

        }

        return result.toArray(new int[result.size()][]);


    }

    public static int[][] merge2(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        List<int[]> result = new ArrayList<>();
        result.add(new int[]{intervals[0][0], intervals[0][1]});
        int lastIdx = 0;
        for (int[] interval : intervals) {
            int s = interval[0];
            int e = interval[1];
            if (s <= result.get(lastIdx)[1]) {
                if (e > result.get(lastIdx)[1]) {
                    result.get(lastIdx)[1] = e;
                }
            } else {
                result.add(new int[]{s, e});
                lastIdx++;
            }
        }
        return result.toArray(new int[result.size()][]);
    }
}
