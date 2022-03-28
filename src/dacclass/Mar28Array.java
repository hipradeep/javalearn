package dacclass;

import java.util.Arrays;
import java.util.Scanner;

public class Mar28Array {
    //wap to define an array of size 10 .Ask value from user and count even or odd number in given array
    //and print them

    //wap to ask 5 names from user in an array and search for particular name in array

    //wap to ask 5 names from user and print their initial letter in capital

    //ex neha Neha ajay Ajay

    public static void main(String[] args) {



        countEvenAndOdd();
        //firstLatterUpperCase(name);
        //findParticularName(name);




    }

    private static void countEvenAndOdd() {
        int NUM=5;
        int number[] = new int[NUM];
        for (int i = 0; i < NUM; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter " + (i + 1) + " number : ");
            number[i] = sc.nextInt();
        }

        int count=0;
        for (int i = 0; i <NUM ; i++) {
            if (number[i]%2==0){
                count=count+1;
            }
        }
        System.out.println("Even numbers : "+ count);
        System.out.println("Odd numbers : "+ (number.length - count));
    }

    private static void findParticularName() {
        String name[] = new String[5];

        for (int i = 0; i < 5; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter " + (i + 1) + " name : ");
            name[i] = sc.nextLine();
        }
        String search;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name to search : ");
        search=sc.nextLine();
        int flag=0;
        for (int i = 0; i < 5; i++) {
            if (name[i].equals(search)){
                System.out.println("Name found");
                flag=1;
                break;
            }
        }

        if (flag==0) System.out.println("Name not found");

    }

    private static void firstLatterUpperCase() {
        String nam[] = new String[5];

        for (int i = 0; i < 5; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter " + (i + 1) + " name : ");
            nam[i] = sc.nextLine();
        }
        System.out.println(Arrays.toString(nam));
        for (int i = 0; i < 5; i++) {
            System.out.println(nam[i].substring(0, 1).toUpperCase() + nam[i].substring(1));

        }
    }

}
