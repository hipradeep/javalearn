package assignment.mar15lab1;

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        String productName;
        float productPrice, discount;


        Scanner sc=new Scanner(System.in);
        System.out.println("Enter product name : ");
        productName=sc.nextLine();
        System.out.println("Enter product price : ");
        productPrice=sc.nextFloat();

        if (productPrice> 2000)
        discount=(productPrice*10)/100f;
        else discount=(productPrice*7)/100f;

        System.out.println("Product details : ");
        System.out.println("Product name : "+ productName);
        System.out.println("Product price : "+ productPrice);
        System.out.println("Discount : "+ discount);


    }
}

