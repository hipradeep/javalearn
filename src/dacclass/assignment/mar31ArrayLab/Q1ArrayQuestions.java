package dacclass.assignment.mar31ArrayLab;

import java.util.Arrays;
import java.util.Scanner;

public class Q1ArrayQuestions {
     int[] arr;
     int size;

    public static void main(String[] args) {
        Q1ArrayQuestions q=new Q1ArrayQuestions();
        q.takeInput();
        q.printArray();
        q.evenCount();
        q.reverseArray();
        int sumArr = q.sumOfArray();
        System.out.println("Sum of Array : " + sumArr);

        q.copyArrayInAnotherArray();

        q.largestElementInArray();

        int z = 20;
        boolean isElementPresent = q.checkElementInArray( z);
        System.out.println("Is "+z+" present in array : "+ isElementPresent);

        q.sortingArrayUsingBubbleSort();



    }

    public  void sortingArrayUsingBubbleSort() {
        for (int i = 0; i <arr.length -1 ; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] > arr[j]){
                    int t=arr[i];
                    arr[i]=arr[j];
                    arr[j]=t;
                }
            }
        }

        System.out.print("Bubble sort on array: ");
        System.out.println(Arrays.toString(arr));
    }

    public  boolean checkElementInArray( int z) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == z)
                return true;
        }
        return false;
    }

    public  void largestElementInArray() {
        int max = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        System.out.print("Largest Element In Array : ");
        System.out.println(arr[max]);
    }

    public  void copyArrayInAnotherArray() {
        int[] b = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            b[i] = arr[i];
        }
        System.out.print("Copy of Array is in another array: ");
        System.out.println(Arrays.toString(b));
    }

    public  int sumOfArray() {
        int sum = 0;
        for (int a : arr) {
            sum += a;
        }
        return sum;
    }

    public  void reverseArray() {


        int i, j;
        for (i = 0, j = arr.length - 1; i <= j; i++, j--) {
            int t = arr[i];
            arr[i] = arr[j];
            arr[j] = t;
        }
        System.out.print("Reverse of Array is : ");
        System.out.println(Arrays.toString(arr));
    }

    public  void evenCount() {
        int eCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0)
                eCount += 1;
        }
        System.out.println("Total number of even numbers : " + eCount);
    }

    public  void printArray() {
        System.out.print("Array is : ");
        System.out.println(Arrays.toString(arr));
    }

    public  void takeInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of Array : ");
        size = sc.nextInt();
        arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter " + (i + 1) + " number of array : ");
            arr[i] = sc.nextInt();
        }
    }

}
