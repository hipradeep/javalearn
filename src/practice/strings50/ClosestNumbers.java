package practice.strings50;

import java.util.Arrays;

public class ClosestNumbers {

    public static void main(String[] args) {
        int[] nums={12, 45, 47, 87};
        System.out.println(closestNumber(nums));

    }

    private static StringBuilder closestNumber(int[] dat) {
       // int[] result = new int[dat.length];
        int n=dat.length;

        StringBuilder result= new StringBuilder();
        Arrays.sort(dat);
        int minDiff = Integer.MIN_VALUE;

        for(int i = 0; i < n - 1; i++) {
            if(dat[i + 1] - dat[i] <= minDiff) {
                if(dat[i + 1] - dat[i] == minDiff) {
                    result.append(dat[i]).append(" ").append(dat[i + 1]);
                } else {
                    result = new StringBuilder(dat[i] + " " + dat[i + 1]);
                }
                minDiff = dat[i + 1] - dat[i];
            }

        }
        return result;
    }

}
