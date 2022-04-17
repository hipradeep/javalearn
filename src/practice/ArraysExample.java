package practice;

import java.util.Arrays;

public class ArraysExample {
    //24.Write a program to calculate the following
    //1 Find the length of array.
    //2 Demonstrate a one-dimensional array.
    //3 Demonstrate a two-dimensional array.
    //4 Demonstrate a multi-dimensional array.
    public static void main(String[] args) {

        lengthOfArray_1_2();
        twoDimensionalArray_3();
        multiDimensionalArray_4();


    }

    private static void multiDimensionalArray_4() {
        System.out.println("============multi-dimensional=============");
        int[][][] arr = { {{1, 2}, {3, 4}}, {{5, 6}, {7, 8}} };
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                for (int k = 0; k < arr[i][j].length; k++) {
                    System.out.print( " "+arr[i][j][k]);
                }
                System.out.println();

            }

            System.out.println();
        }
    }

    private static void twoDimensionalArray_3() {
        System.out.println("============two-dimensional=============");
        int[][] arr = {{1, 2}, {3, 4}};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                System.out.print( " "+arr[i][j]);
            }
            System.out.println();
        }
    }

    private static void lengthOfArray_1_2() {
        System.out.println("==========one-dimensional===============");
        int[] a={10, 2, 4, 6, 12, 2, 1, 8, 6, 5}; //one-dimensional array.
        System.out.println("Array length +"+a.length);
        System.out.println(Arrays.toString(a));
    }
}
