package dacclass.assignment.mar25SEvaLab1;

import java.util.Scanner;

public class Q13AreaPerimeterOfRectangle {
    //Q 13  Write a Java program to print the area and perimeter of a rectangle.
    //      Input  Width = 5.5 Height = 8.5

    public static void main(String[] args) {

        float width, height, area, perimeter;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Width of Rectangle : ");
        width = sc.nextFloat();
        System.out.print("Enter Height of Rectangle : ");
        height = sc.nextFloat();

        System.out.println("Area of Rectangle : " + (width * height));
        System.out.println("Perimeter of Rectangle : " + (width + height) * 2);
    }
}
