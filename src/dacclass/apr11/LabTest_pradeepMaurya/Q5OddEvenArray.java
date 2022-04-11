package dacclass.apr11.LabTest_pradeepMaurya;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Q5OddEvenArray {

    //Q 5 Write a program to define two array evenarray and oddarray of size 10 .
    //create even() method that store  even number to EvenArray[]  and display them
    //create odd() method that store  even number to OddArray[]  and display them
    public static void main(String[] args) {

        int[] evenArray=new int[10];
        int[] oddArray=new int[10];
        int flag=0;

        while (flag==0){
            System.out.println("Choose option");
            System.out.println("1. Create array of Even numbers ");
            System.out.println("2. Create array of Odd numbers ");
            System.out.println("3. Exit");
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter option  : ");
            int choice=sc.nextInt();
            switch (choice){
                case 1: {
                    getEvenArray(evenArray);
                    showArray(evenArray);
                    break;
                }
                case 2: {
                    getOddArray(oddArray);
                    showArray(oddArray);
                    break;
                }
                case 3:{
                    flag=1;
                    break;
                }
                default:{
                    System.out.println("You enter wrong option!,Enter again");
                    break;
                }
            }


        }
    }
    private static void showArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    private static void getOddArray(int[] oddArray) {
        System.out.println("Enter 10 odd numbers");
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < oddArray.length; i++) {
            int a=sc.nextInt();
            int flag=0;
            while (flag==0){
                if (a%2!=0){
                    flag=1;
                    oddArray[i]=a;
                    break;
                }else{
                    System.out.println("You enter Even number!, enter again ");
                    a=sc.nextInt();
                }
            }
        }
    }


    private static void getEvenArray(int[] evenArray) {
        System.out.println("Enter 10 even numbers");
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < evenArray.length; i++) {
            int a=sc.nextInt();
            int flag=0;
            while (flag==0){
                if (a%2==0){
                    flag=1;
                    evenArray[i]=a;
                    break;
                }else {
                    System.out.println("You enter Odd number!, enter again ");
                    a=sc.nextInt();
                }

            }
        }
    }

}
