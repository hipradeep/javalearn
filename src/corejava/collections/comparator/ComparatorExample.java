package corejava.collections.comparator;

import javax.swing.*;
import java.util.Arrays;
import java.util.Comparator;

public class ComparatorExample {
    public static void main(String[] args) {
        int[][] numbers = new int[][]{{11,22}, {3,5}, {3, 8}};
        int[] nums =new int[]{1,2,13,4,5,6,7,8};
        //
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

        Arrays.sort(numbers, Comparator.comparing(a-> a[1]));

        System.out.println(Arrays.deepToString(numbers));
    }
}
