package assignment.mar25SEvaLab1;

import java.util.Scanner;

public class Q6SecurityStaff {
    //Q 6  write a program  to ask name and code (String) of security staff .
    //if code =="COOLCOOL" then print "welcome user" else Ask him to reenter code.
    // and maximum chance to enter code is 3.After third attempt print "GoBack".

    public static void main(String[] args) {

        String name, code;
        int count=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Name : ");
        name=sc.nextLine();
        System.out.print("Enter Security Code : ");
        do {
            if (count!=0)
            System.out.print("Re-enter Security Code : ");
            code=sc.nextLine();

            if (code.equals("COOLCOOL")){
                System.out.println("Welcome "+name);
                break;
            }else {
                System.out.println("Security Code Not Match");
                count+=1;
            }

        }while (count<3);

        if (count==3) System.out.println("Go Back");

    }
}
