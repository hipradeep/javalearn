package assignment.mar21Lab;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        CubeSquare cubeSquare=new CubeSquare();

        int flag=0;
        do {

        System.out.println("Enter 1 for Cube");
        System.out.println("Enter 2 for Square");
        System.out.println("Enter 3 for Greater");
        System.out.println("Enter 0 for Exit");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
            switch (choice) {
                case 1 : {
                    System.out.print("Enter value of a for cube : ");
                    cubeSquare.cube(sc.nextInt());
                    break;
                }
                case 2 : {
                    System.out.print("Enter value of b for square : ");
                    cubeSquare.square(sc.nextInt());
                    break;
                }
                case 3 : {
                    System.out.println("Enter value for greater");
                    System.out.print("Enter value of a : ");
                    int a= sc.nextInt();
                    System.out.print("Enter value of b : ");
                    int b= sc.nextInt();
                    System.out.print("Enter value of c : ");
                    int c= sc.nextInt();
                    cubeSquare.greater(a, b, c);
                    break;
                }
                case 0 : {
                    System.out.println("You Exit Successfully ");
                    flag = 1;
                    break;
                }
                default : System.out.println("Please Enter correct choice");
            }
        }while (flag==0);

    }

}

class CubeSquare {

    void cube(int a) {
        System.out.println("Cube a "+a);
    }

    void square(int b) {
        System.out.println("Square b "+b);
    }

    void greater(int a, int b, int c) {
        System.out.println("Greater a- " +a+" b- "+ b +" c- "+c);
    }
}