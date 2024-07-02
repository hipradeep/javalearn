package dacclass.assignment.jul2ArrayLinkedList;

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
    void sortArray() {
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    swap(array, j);
                }
            }
        }
    }

    private void swap(int[] arr, int j) {
        int temp = arr[j];
        arr[j] = arr[j + 1];
        arr[j + 1] = temp;
    }
    void display(){
        System.out.print("[ ");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i]+", ");
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        Q1SortArray a=new Q1SortArray(10);
        a.createArray(5);
        a.display();
        System.out.println("Sorted Array - ");
        a.sortArray();
        a.display();
    }
}
