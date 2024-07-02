package dacclass.assignment.mar25SEvaLab1;

import java.util.Scanner;

public class Q16_20Bookstore {

    //Q 16 create a class bookstore having  fields like book-name,qty and price.
    //define tho methods input and display() call both methods in main.kotlin.main

    //Q 17 in same above question define another method chekprice that return integer value
    // i.e discounted amount if price>5000 discount is 200 rs else 100 rs.

    //Q 18 In same above question define static variable college-name.

    //Q 19 in above question define static method to initialization
    //all static method in and call static method in main.kotlin.main.

    //Q 20 create another class maiBookstore that contains main.kotlin.main method and call above clas methods in it.
    public static void main(String[] args) {

//        BookStore bookStore = new BookStore();
//        //BookStore.collageName = "C-DAC Noida";
//        BookStore.setCollageName("C-DAC Noida");  //static method
//        bookStore.input();
//        bookStore.display();
    }
}

class MainBookStore {

    public static void main(String[] args) {
        BookStore bookStore = new BookStore();
        //BookStore.collageName = "C-DAC Noida";
        BookStore.setCollageName("C-DAC Noida");  //static method
        bookStore.input();
        bookStore.display();
    }
}

class BookStore {
    static String collageName;
    String bookName;
    int qty;
    float price;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter book name : ");
        bookName = sc.nextLine();
        System.out.print("Enter books quantity : ");
        qty = sc.nextInt();
        System.out.print("Enter book price : ");
        price = sc.nextFloat();

    }

    //display book details
    void display() {
        System.out.println(
                "Book details :\n" +
                        "Name - " + bookName + "\n" +
                        "Quantity - " + qty + "\n" +
                        "Price - " + price + "\n" +
                        "Discount - " + discount() + "\n" +
                        "Collage Name - " + collageName

        );
    }

    // return discount
    int discount() {
        if (price > 5000)
            return 200;
        else return 100;
    }

    //static method to set collage name
    static void setCollageName(String cn) {
        collageName = cn;
    }
}
