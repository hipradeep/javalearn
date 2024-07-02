package dacclass.assignment.mar16lab3;

import java.util.Scanner;

public class Lab16MarCheckAlphabets {


    public static void main(String[] args) {

        char c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a character : ");
        c=sc.next().charAt(0);

        if(c >=65 && c <=90){
            System.out.println(c+" Capital Case");
        }else if (c >=97 && c <=122){
            System.out.println(c+" Lower Case");
        }else {
            System.out.println("Entered wrong character");
        }
    }
}
