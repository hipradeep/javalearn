package assignment.jul2ArrayLinkedList;

import java.util.Scanner;

public class Q2SumAvgOfArray {
    //Write a program to calculate sum and average using an array.
    int[] array;
    int capacity;
    int size;
    public Q2SumAvgOfArray(int capacity) {
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
    void display(){
        System.out.print("[ ");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i]+", ");
        }
        System.out.println("]");
    }
    //sum of array
    int sumOfArray(){
        int sum=0;
        for (int i = 0; i < size; i++) {
            sum=sum+array[i];
        }
        return sum;
    }
    //avg of array
    float avgOfArray(){
        int sum=0;
        for (int i = 0; i < size; i++) {
            sum=sum+array[i];
        }
        return sum/(float)size;
    }
    public static void main(String[] args) {
        Q2SumAvgOfArray a=new Q2SumAvgOfArray(10);
        a.createArray(5);
        a.display();
        System.out.print("Sum Of Array - ");
        System.out.println(a.sumOfArray());
        System.out.print("Average of Array Elements - ");
        System.out.println( a.avgOfArray());
    }
}
