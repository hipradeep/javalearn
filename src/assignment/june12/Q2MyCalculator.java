package assignment.june12;

import java.util.Scanner;

public class Q2MyCalculator {
    //Java interface can only contain method signatures and fields. The interface canbe used to achieve polymorphism.
    // In this problem, you will practice your knowledge on interfaces. You are given an interface
    //which contains a method signature . You need to write a class called MyCalculator which implements the interface.
    // function just takes an integer as input and return the sum of all its divisors. For example divisors of 6 are 1, 2, 3 and 6,
    // so  should return 12. The value of n will be at most 1000. You just need to write the MyCalculator class only.

    public static void main(String[] args) {
        MyCalculator myCalculator=new MyCalculator();
        int n;
        int f=0;
        do {
            if(f==0) System.out.print("Enter a number : ");
            n=(new Scanner(System.in)).nextInt();
            if (n < 0 || n >1000) {
                f=1;
                if(n< 0) System.out.println("You enter negative number! ");
                System.out.print("Reenter, number must be at most 1000: ");
            }else f=0;
        }while (f==1);
        System.out.println("Sum of its dividers is : "+ myCalculator.sumOfDivisors(n));

    }
}

class MyCalculator implements Sum{

    @Override
    public int sumOfDivisors(int n) {
        int sum=0;
        for (int i = 1; i <=n ; i++) {
            if (n%i==0) sum+=i;
        }
        return sum;
    }
}

interface Sum{
    int sumOfDivisors(int n);
}