package dacclass.assignment.mar25SEvaLab1;

import java.util.Scanner;

public class Q10ReverseOfNumber {

    //Q 10  print reverse of number

    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Entre a number : ");
        num = sc.nextInt();
        int sum = 0;

        while (num!= 0) {
            sum = sum * 10 + num % 10;
            num /= 10;
        }
        System.out.println(sum);
    }

    //no need
    static int countsDigits(int n) {
        int count = 0;
        while (n != 0) {
            n /= 10;
            ++count;
        }
        return count;
    }
}
