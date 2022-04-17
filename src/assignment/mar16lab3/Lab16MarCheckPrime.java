package assignment.mar16lab3;

import java.util.Scanner;

public class Lab16MarCheckPrime {
    public static void main(String[] args) {

        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number : ");
        num = sc.nextInt();

        int count=0;

        if(num==1){
            System.out.println(num+" is Not Prime Number");
            return;
        }
        for(int i=2; i<=num/2; i++ ){
            if (num%i == 0) {
                count += 1;
            }
        }
        if (count>0){
            System.out.println(num+" is Not Prime Number");
        }else {
            System.out.println(num+" is Prime Number");
        }
    }
}
