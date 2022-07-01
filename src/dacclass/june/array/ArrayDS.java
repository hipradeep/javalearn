package dacclass.june.array;

import java.util.Scanner;

public class ArrayDS {
    int[] array;
    int capacity; //max element can be store n array
    int size; // current size of array

    public ArrayDS(int capacity) {
        array = new int[capacity];
        this.capacity = capacity;
        size = 0;
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

    void display() {
        for (int i = 0; i < size; i++) {
            if (i == 0) System.out.print("[ " + array[i] + ", ");
            else if (i == size - 1) System.out.print(array[i] + " ]");
            else System.out.print(array[i] + ", ");
        }
        System.out.println("");
    }

    void insertAtEnd(int item) {
        if (size == capacity) {
            System.out.println("Can't create array");
            return;
        }
        array[size++] = item;
    }

    void insertAtFirst(int item) {
        if (size == capacity) {
            System.out.println("Can't create array");
            return;
        }
        for (int i = size; i > 0; i--) {
            array[i] = array[i - 1];
        }
        array[0] = item;
        size++;
    }

    void insertAtIndex(int index, int item) {
        if (index > size || index > capacity || size == capacity) {
            System.out.println("Cant insert");
            return;
        }
        for (int i = size; i > index; i--) {
            array[i] = array[i - 1];
        }
        array[index] = item;
        size++;
    }

    int removeFromFirst() {
        if (size <= 0) {
            System.out.println("Array is Empty!");
            return 0;
        }
        int temp = array[0];
        for (int i = 0; i < size; i++) {
            array[i] = array[i + 1];
        }
        size--;
        return temp;
    }

    int removeFromLast() {
        int temp = array[size - 1];
        size--;
        return temp;
    }

    int removeFromIndex(int index) {
        if (index< size) {
            System.out.println("Invalid Index!");
            return 0;
        }

        int temp = array[index];
        for (int i = index; i < size; i++) {
            array[i] = array[i + 1];
        }
        size--;
        return temp;
    }

    void searchElement(int item){
        boolean flag=false;
        for (int t: array             ) {
            if (item==t){
                flag=true;
                System.out.println(item+" Found");
                break;
            }
        }
        if ( !flag)    System.out.println(item+" Not Found");

    }


    public static void main(String[] args) {
        ArrayDS arr = new ArrayDS(10);
       // arr.createArray(3);
        arr.createArr(new int[]{11,22,33});
        arr.display();
        arr.insertAtEnd(10);
        arr.display();
        arr.insertAtFirst(45);
        arr.display();
        arr.insertAtIndex(4, 55);
        arr.display();
        arr.insertAtIndex(0, 66);
        arr.display();
        System.out.println(arr.removeFromFirst());
        arr.display();
        System.out.println(arr.removeFromLast());
        arr.display();
        System.out.println(arr.removeFromIndex(5));
        arr.display();
        System.out.println(arr.removeFromIndex(0));
        arr.display();
        arr.searchElement(66);
        arr.searchElement(11);
    }


}
