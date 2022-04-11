package dacclass.apr11.LabTest_pradeepMaurya;

import java.util.Arrays;
import java.util.Scanner;

public class Q3ArrayTest {
    //Q 3  Define a class  ArrayTest .in class define and array of size 10 .
    //a) create method getArray to get value of array from user .
    //b) create method showArray to display all values of array to user.
    //c) create searchArray method to search particular record in given array using linear search .
    //d) create sortArray method that sort given array to ascending order and display after sorting.
    //e) In main method call all above methods


    int[] arr=new int[10];

    public void getArray() {
        System.out.println("Enter the values of array of size 10");
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter value at "+(i+1) +" : ");
            arr[i]=sc.nextInt();
        }
    }
    public void showArray(){
        System.out.print("Array is : ");
        System.out.println(Arrays.toString(arr));
    }

    public void searchArray(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter value to be search in array : ");
        int n=sc.nextInt();
        int flag=0;
        int p=0;
        for (int i = 0; i < arr.length; i++) {
            if (n==arr[i]){
                flag=1;
                p=i;
                break;
            }
        }
        if (flag==1) System.out.println(n+" found in array at position "+(p+1));
        else System.out.println(n+" not found in array" );
    }
    public void sortArray(){
        System.out.println("Sorted array in ascending order");
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        Q3ArrayTest arrayTest=new Q3ArrayTest();

        arrayTest.getArray();
        arrayTest.showArray();
        arrayTest.searchArray();
        arrayTest.sortArray();
    }
}
