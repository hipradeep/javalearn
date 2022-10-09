package practice;
import java.util.*;
public class SortingAlgo {
    public static void main(String[] arge){
        int[] nums={12,55,10,2,30};
        System.out.println(Arrays.toString(nums));
        selectionSortAsc(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void insertionSort(int[] nums){
        int n=nums.length;
        for(int i=0; i<n-1; i++ ){
            for(int j=i+1; j>0; j--){
                if(nums[j-1] > nums[j]){
                    int temp =nums[j-1];
                    nums[j-1]=nums[j];
                    nums[j]=temp;
                }
            }
        }

    }
    static void bubbleSort(int[] nums){
        int n=nums.length;
        for(int i=0; i<n; i++){
            for(int j=1; j< n-1-i; j++){
                if(nums[j-1] > nums[j]){
                    int temp = nums[j-1];
                    nums[j-1]=nums[j];
                    nums[j]=temp;
                }
            }
        }
    }
    static void selectionSortDesc(int[] nums){
        int n=nums.length;
        for(int i=0;  i<n; i++){
            int max=i;
            for(int j=i+1; j<n; j++){
                if(nums[j] > nums[max]){
                    max=j;
                }
            }
            int temp=nums[max];
            nums[max]=nums[i];
            nums[i]=temp;
        }
    }
    static void selectionSortAsc(int[] nums){
        int n=nums.length;
        for(int i=0;  i<n; i++){
            int min=i;
            for(int j=i+1; j<n; j++){
                if(nums[j] < nums[min]){
                    min=j;
                }
            }
            int temp=nums[min];
            nums[min]=nums[i];
            nums[i]=temp;
        }
    }
}
