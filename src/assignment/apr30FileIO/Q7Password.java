package assignment.apr30FileIO;

import java.util.Scanner;

public class Q7Password {
    public static void main(String[] args) {
        int count = 0;
        int flage = 0;
        do {
            System.out.print("Enter password : ");
            String pass = new Scanner(System.in).nextLine();
            System.out.print("Enter confirm password : ");
            String conPass = new Scanner(System.in).nextLine();

            if (conPass.equals(pass)) {
                break;
            } else {
                if ((count+=1) < 3)
                System.out.println("Try one more time");
            }

        } while (count != 3);

        if (count < 3) {
            System.out.println("Password match");
        } else {
            System.out.println("You failed!");

        }
    }
}
