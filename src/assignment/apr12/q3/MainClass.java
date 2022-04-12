package assignment.apr12.q3;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {


        System.out.print("Enter choice : ");
        Scanner sc=new Scanner(System.in);
        String choice=sc.nextLine();

        if (choice.equalsIgnoreCase("one")){

            Phonebook.Personal personal=new Phonebook().new Personal();
            personal.putInput();
            personal.getInput();

        }else {
            Phonebook.Business personal=new Phonebook().new Business();
            personal.accept();
            personal.show();
        }
    }
}
