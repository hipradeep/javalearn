package dacclass.assignment.mar28SEvaLab2;

import java.util.Scanner;

public class Q2AutomorphicNumber {
    //Q 2 wap to check whether a single digit number is automorphic number or not .
    //automorphic number is number whose square ends with number itself  i.e.     5 * 5 =25
    //if automorphic display "its automorphic number else not automorphic .

    public static void main(String[] args) {
        int num;

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a single digit number : ");
        num=sc.nextInt();

        int sqr=num*num;

        if (sqr%10==num) System.out.println("its automorphic number");
        else System.out.println("not automorphic");

    }
}
