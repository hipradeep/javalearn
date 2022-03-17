package assignment.mar17lab4_loop;

import java.util.Scanner;

public class Lab4CheckPrime {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number : ");
        num = sc.nextInt();

        int flag=0;

        if(num==1){
            System.out.println(num+" is Not Prime Number");
            return;
        }
        for(int i=2; i<=num/2; i++ ){
            if (num % i == 0) {
                flag = 1;
                break;
            }
        }

        if (flag==1){
            System.out.println(num+" is Not Prime Number");
        }else {
            System.out.println(num+" is Prime Number");
        }
    }
}
