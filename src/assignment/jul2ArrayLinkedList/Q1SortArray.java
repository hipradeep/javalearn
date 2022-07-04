package assignment.jul2ArrayLinkedList;

import java.util.Scanner;

public class Q1SortArray {
    //Write a program to sort an array
    int[] array;
    int capacity;
    int size;

    public Q1SortArray(int capacity) {
        this.capacity = capacity;
        this.array=new int[capacity];
        this.size=0;
    }

    void createArray(int n) {
        if (n > capacity) {
            System.out.println("Can't create array");
            return;
        }
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element at index-" + i + " : ");
            array[i] = (sc.nextInt());
            size++;
        }
    }
    void createArr(int[] a) {
        if (a.length > capacity) {
            System.out.println("Can't create array");
            return;
        }
        for (int p : a) {
            array[size++] = p;
        }
    }


    //bubble sort
    void sortArray(){
        //array

        for (int i = 0; i <=size; i++) {
            for (int j = 0; j <=size; j++) {

                //if ()
            }

        }
    }
}
