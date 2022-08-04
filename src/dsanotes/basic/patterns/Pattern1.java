package dsanotes.basic.patterns;

import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {

        System.out.print("Enter a number - ");
        // int n=(new Scanner(System.in)).nextInt();
        System.out.println();
        int n = 4;

        for (int i = 1; i <= n; i++) {
            int c = n - 1;
            int k = i;
            for (int j = 1; j <= i; j++) {
                System.out.print(k + " ");
                k = k + c--;
            }
            System.out.println();
        }

        System.out.println("--------------------------");

        for (int i = 1; i <= n; i++) {
            int k = i;
            for (int j = 1; j <= i; j++) {
                System.out.print(k + " ");
                k = k + (n-j);
            }
            System.out.println();
        }

    }
}
