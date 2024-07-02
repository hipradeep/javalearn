package dacclass.assignment.mar31ArrayLab;

import java.util.Scanner;

public class Q2MainClass {


    public static void main(String[] args) {

        Q1ArrayQuestions q1=new Q1ArrayQuestions();
        q1.takeInput();
        q1.printArray();
        int flag=0;
        do{
            System.out.println("     1: Count even numbers in array");
            System.out.println("     2: Reverse array");
            System.out.println("     3: Find Sum of array elements ");
            System.out.println("     4: Copy array in another array ");
            System.out.println("     5: Find largest element array ");
            System.out.println("     6: Check element exists in the array ");
            System.out.println("     7: Apply Bubble Sort on array ");
            System.out.println("     8: Exit");
            Scanner sc=new Scanner(System.in);
            int choice;
            System.out.print("Enter your choice : ");
            choice=sc.nextInt();
            switch (choice){
                case 1:{
                    q1.evenCount();
                    break;
                }
                case 2: {
                    q1.reverseArray();
                    break;
                }
                case 3: {
                    int sumArr = q1.sumOfArray();
                    System.out.println("Sum of Array : " + sumArr);
                    break;
                }
                case 4: {
                    q1.copyArrayInAnotherArray();
                    break;
                }
                case 5: {
                    q1.largestElementInArray();
                    break;
                }
                case 6: {
                    System.out.print("Enter element to check : ");
                    int z = sc.nextInt();
                    System.out.println("Is "+z+" present in array : "+  q1.checkElementInArray( z));
                    break;
                }
                case 7:{
                    q1.sortingArrayUsingBubbleSort();
                    break;
                }  case 8:{
                    flag=1;
                    break;
                }
                default:{
                    System.out.println("wrong choice ");
                }

            }

        }while (flag!=1);



    }
}
