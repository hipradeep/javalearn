package assignment;

import java.util.Scanner;

public class QuestionLab {
    static String banner="welcome to IMS";
    public static void main(String[] args) {
        bannerMethod();
        Inventory inventory=new Inventory();
        inventory.input();
        inventory.show();
    }
    static void bannerMethod(){
        System.out.println(banner);
    }
}

class Inventory{
    String productName;
    float productPrice;
    int productQty;

    void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Product name : ");
        productName=sc.nextLine();
        System.out.println("Product price : ");
        productPrice=sc.nextFloat();
        System.out.println("Product quantity : ");
        productQty=sc.nextInt();
    }

    void show(){
        System.out.println("Product details : ");
        System.out.println(" name : "+ productName);
        System.out.println(" price : "+ productPrice);
        System.out.println(" quantity : "+ productQty);
        System.out.println(" discount : "+ discount(productPrice));

    }
    float discount(float price){

        if (price> 3000)
            return (price*10)/100f;
        else return (price*9)/100f;
    }
}
