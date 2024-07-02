package dsanotes.bitmanipulation;

import java.util.Scanner;

public class KernighanAlgo {
    //Kernighan Algorithm - use to count the number of 1s in binary string or numbers
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num=scanner.nextInt();

        System.out.println("Binary ("+num+") - "+Integer.toBinaryString(num));
        int counter =0;
        while(num!=0){
            int rsb = num & -num;
            num -= rsb;
            counter++;
        }
        System.out.println("Number of 1s - "+counter);
    }
}
