package dacclass.assignment.june12;

import java.util.Arrays;

public class Q3Leaders {
    //Q 3 Given an array, print all the elements which are leaders.
    // A Leader is an element that is greater than all the elements on its right side in the array.
    public static void main(String[] args) {

        int[] arr={10, 22, 12, 3, 0, 6};
        //int[] arr={4, 7, 1, 0};

        System.out.println(Arrays.toString(arr));
        int f=0;
        for (int i = 0; i < arr.length-1; i++) {
            f=0;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    f=1; break;
                }
            }
            //printing leader elements
            if (f==0) {
                System.out.print("Leader element - ");
                System.out.println(arr[i]);
            }

        }

    }
}
