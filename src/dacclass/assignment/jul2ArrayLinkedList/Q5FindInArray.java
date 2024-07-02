package dacclass.assignment.jul2ArrayLinkedList;

import java.util.Scanner;

public class Q5FindInArray {
    //Write a program to find a given number in an array.
    int[] array;
    int capacity;
    int size;

    public Q5FindInArray(int capacity) {
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
    int findElement(int item){
        for (int i = 0; i < size; i++) {
            if (item==array[i]) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Q5FindInArray a=new Q5FindInArray(10);
        a.createArray(5);
        a.display();
        System.out.println("Search 40 in Array ");
       int index= a.findElement(40);
       if (index==-1){
           System.out.println("Element Not Found!");
       }else {
           System.out.println("Element found at index - "+index);
       }

    }
}
