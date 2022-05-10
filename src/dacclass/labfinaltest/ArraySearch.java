package dacclass.labfinaltest;

import java.util.Scanner;

public class ArraySearch {
    public static void main(String[] args) {

        int ARR_LENGTH = 10;
        int[] arr = new int[ARR_LENGTH];

        System.out.println("Enter Array elements : ");
        input(arr);

        System.out.println("-----------------------");
        System.out.println("Search element in array records");
        searchInArray(arr);

        System.out.println("-----------------------");
        System.out.println("Displaying array records");
        display(arr);
    }

    private static void display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] +", ");
        }
    }

    private static void searchInArray(int[] arr) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter element to search in record - ");
        int sData = sc.nextInt();
        int flag = 0;

        for (int i = 0; i < arr.length; i++) {
            if (sData == arr[i]) {
                flag = 1;
                System.out.println("Record found!");
                break;
            }
        }

        if (flag == 0) System.out.println("Record Not Found");

    }

    private static void input(int[] arr) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Array[" + i + "] - ");
            arr[i] = sc.nextInt();
        }
    }
}
