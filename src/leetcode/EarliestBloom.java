package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EarliestBloom {

    public static void main(String[] args) {
        int[] plantTime ={1,4,3};
        int[] growTime ={2,3,1};

        System.out.println( earliestFullBloom(plantTime, growTime));

    }

    public static int earliestFullBloom(int[] plantTime, int[] growTime) {
        int n = growTime.length;
        List<Integer> indices = new ArrayList<>();
        for (int i = 0; i < n; ++i) {
            indices.add(i);
        }
        System.out.println(indices.toString());
        Collections.sort(indices, Comparator.comparingInt(i -> -growTime[i]));

        System.out.println(indices.toString());
        int max = 0;
        for (int i = 0, plantSum = 0; i < n; ++i) {
            int idx = indices.get(i);
            int time = plantSum + plantTime[idx] + growTime[idx];
            max = Math.max(max, time);
            plantSum += plantTime[idx];
        }
        return max;
    }
}
