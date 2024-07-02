package dacclass.assignment.apr27Exception.lab2.stats;

import java.util.Arrays;

public class StatsOperations {

    public float average(int x, int y, int z){
        return (x+y+z)/3.0f;
    }
   public int median(int x, int y, int z){
        int[] arr= new int[]{x, y, z};
        Arrays.sort(arr);
        int m=(arr.length+1)/2;
        return arr[m-1];
    }

}
