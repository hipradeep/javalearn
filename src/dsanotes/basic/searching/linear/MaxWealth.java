package dsanotes.basic.searching.linear;

public class MaxWealth {
    public static void main(String[] args) {
        //return the max sum of array
        int[][] arr = new int[][]{{3, 2, 1}, {1, 2, 7}, {2, 14}};
        int max = find(arr);
        System.out.println(max);
    }

    private static int find(int[][] arr) {
        int max = 0;
        for (int[] a : arr) {
            int sum=0;
            for (int b : a) {
                sum=sum+b;
            }
            if (max<sum) max=sum;
        }
        return max;
    }
}
