package leetcode.blind;



public class MostWater {
    //11. Container With Most Water
    public static void main(String[] args) {
        int[] nums={1,8,6,2,5,4,8,3,7};

        System.out.println(maxArea(nums));
    }
    public static int maxArea(int[] height) {
        int max=0;

        int i=0, j=height.length-1;
        while ( i < j) {

                int area=(j-i)* Math.min(height[i], height[j] );
                if (area>max) max=area;

                if(height[i]<height[j]){
                    i++;
                }else if (height[i]> height[j]){
                    j--;
                }else {
                    i++;
                    j--;
                }
                
        }
        return max;

    }
    public static int maxArea2(int[] height) {
        int max=0;

        for (int i = 0; i < height.length; i++) {
            for (int j = i+1; j < height.length; j++) {
                int area=(j-i)* Math.min(height[i], height[j] );
                if (area>max) max=area;

                }

        }
        return max;

    }
}
