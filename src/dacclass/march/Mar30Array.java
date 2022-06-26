package dacclass.march;

import dsanotes.utils.Utils;

import java.util.Arrays;
import java.util.Scanner;

public class Mar30Array {
    public static void main(String[] args) {

        //sum of rows
        int arr[][] = Utils.simpleMultidimensionalArray;
        //int arr[][]=new int[4][4];

        Scanner sc = new Scanner(System.in);

//        for (int i=0; i< 4; i++){
//            for (int j = 0; j < 4; j++) {
//                System.out.print("Enter number :");
//                arr[i][j]=sc.nextInt();
//            }
//        }
       Utils.printMultidimensionalArray(arr);
        System.out.println("  ");
        int sum = 0;
        for (int i = 0; i < 4; i++) {
            sum = 0;
            for (int j = 0; j < 4; j++) {
                sum += arr[i][j];
                Utils.printArrayElement(arr[i][j]);
            }
            // System.out.println("Sum if "+(i+1)+" Row "+ sum);
            System.out.println(" => " + sum);
        }


    }

    private static void showArray1(int x) {
        if (String.valueOf(x).length()==1)
            System.out.print(x + "   ");
        else   System.out.print(x + "  ");
    }

    private static void showArray(int[][] arr) {
        int rows = arr. length;
        int column = arr[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < column; j++) {
                if (String.valueOf(arr[i][j]).length()==1)
                     System.out.print(arr[i][j] + "   ");
                else   System.out.print(arr[i][j] + "  ");
            }
            System.out.println(" ");
        }
    }


}

class BinarySearch {
    // rule array should be sorted order
    //fallow divide and conquer
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements: ");
        n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Elements are: ");
        for (int i = 0; i < n; i++) {
            //System.out.print(array[i] + "\t");
            System.out.println(a[i]);
        }
        System.out.println("Enter element to be search : ");
        int num =sc.nextInt();


        int start = 0, end = a.length - 1, mid = (start + end) / 2;

        while (start <= end) {
            if (a[mid] > num) {
                end = mid - 1;
            } else if (a[mid] < num) {
                start = mid + 1;
            } else if (a[mid] == num) {
                System.out.println("Record Found at " + mid);
                break;
            }
            mid = (start + end) / 2;
        }
        if (start > end) {
            System.out.println("Record Not Found");
        }


    }


}

class LinearSearch {

    public static void main(String[] args) {

        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements: ");
        n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Elements are: ");
        for (int i = 0; i < n; i++) {
            //System.out.print(array[i] + "\t");
            System.out.println(a[i]);
        }
        System.out.println("Enter element to be search : ");
        int num =sc.nextInt();

        int flag = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == num) {
                flag = 1;
                System.out.println("Found at " + i);
                break;
            }
        }
        if (flag == 0) System.out.println("Record not found");
    }
}

class BubbleSort {
    public static void main(String[] args) {
        int a[] = {10, 20, 22, 23, 45, 66};
        int temp;
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                }
            }

        }
        System.out.println(Arrays.toString(a));
    }
}

