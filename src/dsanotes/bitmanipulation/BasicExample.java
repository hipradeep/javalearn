package dsanotes.bitmanipulation;

import java.util.Scanner;

public class BasicExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //day1(sc);
      day2(sc);


    }

  private static void day2(Scanner sc) {
    int n = sc.nextInt();
    //System.out.println("Binary ("+n+") - "+Integer.toBinaryString(n));
    System.out.println("Binary ("+n+") - "+printWithLeadingZeros(n));
    System.out.println("Binary ("+-n+") - "+Integer.toBinaryString(-n));
    System.out.println("1's Complement - "+~n);
    System.out.println("1's Complement - "+Integer.toBinaryString(~n));
    System.out.println("2's Complement - "+~n+1);
    System.out.println("2's Complement - "+Integer.toBinaryString(~n+1));
    System.out.println("RSB Mask - "+printWithLeadingZeros(n & -n));

  }

  public static String printWithLeadingZeros(int n) {
    return String.format("%32s", Integer.toBinaryString(n)).replace(' ', '0');
  }

  private static void day1(Scanner sc) {
    int n = sc.nextInt();
    int i = sc.nextInt();
    int k = sc.nextInt();
    int j = sc.nextInt();
    int l = sc.nextInt();

    int onMask = (1 << i);
    int offMask = ~(1 << k);
    int toggleMask = (1 << j);
    int checkMask = (1 << l);

    System.out.println(n | onMask);
    System.out.println(n & offMask);
    System.out.println(n ^ toggleMask);
    System.out.println((n & checkMask) != 0);
  }
}
