package assignment.mar28SEvaLab2;

import java.util.Scanner;

public class Q1DigitSumCount {
    //Q 1 wap to ask a number and print sum and count and average  of digits .

    public static void main(String[] args) {
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number : ");
        num=sc.nextInt();

        System.out.println("Sum of digits : "+sumOfDigits(num));
        System.out.println("Number of digits : "+countDigits(num));
        System.out.println("Average  of digits : "+avgOfDigits(num));



    }

    private static float avgOfDigits(int n) {
        int sum=0;
        float count=0;

        while(n!=0){
            sum+=n%10;
            count+=1;
            n/=10;
        }
        return sum/count;
    }

    private static int countDigits(int n) {
        int count=0;
        while(n!=0){
            count+=1;
            n/=10;
        }
        return count;
    }

    static int sumOfDigits(int n){
            int sum=0;

            while(n!=0){
                sum+=n%10;
                n/=10;
            }
            return sum;
    }
}
