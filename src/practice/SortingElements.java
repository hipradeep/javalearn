package practice;

import java.util.Arrays;

public class SortingElements {
    //1. Write a Java program for Sorting elements of an array
    public static void main(String[] args) {
        int[] a = {1, 10, 2, 3, 6, 5};

        //printing without sorting
        System.out.println(Arrays.toString(a));
        //sorting array
        Arrays.sort(a);
        //printing after sorting
        System.out.println(Arrays.toString(a));


    }
}
