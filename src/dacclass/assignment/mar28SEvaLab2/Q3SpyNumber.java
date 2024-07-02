package dacclass.assignment.mar28SEvaLab2;

import java.util.Scanner;

public class Q3SpyNumber {
    //Q 3 wap to check any number is spy number or not
    //example
    //1124 is spy  i.e      1+1+2+4  =8
    //              and     1*1*2*4   = 8

    public static void main(String[] args) {
        int num;

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a single digit number : ");
        num=sc.nextInt();
        int sum=0;
        int mul=1;

        while (num!=0){

            sum=sum+num%10;
            mul=mul*num%10;
            num/=10;
        }

        if (sum==mul) System.out.println("It is a SPY number");
        else System.out.println("Not a SPY number");
    }
}
