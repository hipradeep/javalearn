package basicjava.basics;

import java.util.Scanner;

public class SwitchTemp {
    public static void main(String[] args) {


        boolean isExit = false;
        do {
            System.out.println("Choose the File Process type :- ");
            System.out.println("1 : File Process WITHOUT Thread");
            System.out.println("2 : File Process WITH  Thread ");
            System.out.println("3 : Exit");
            System.out.print("Enter option : ");

            int ch = (new Scanner(System.in)).nextInt();

            switch (ch) {
                case 1:
                    System.out.println("Option 1");
                    break;
                case 2:
                    System.out.println("Option 2");
                    break;
                case  3:
                    System.out.println("Option 3");
                    isExit=true;
                    break;
                default:
                    System.out.println("------------------------------");
                    System.out.println("You enter wrong option");
                    System.out.println("------------------------------");
            }


        } while (!isExit);


    }
}
