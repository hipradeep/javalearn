package practice.test;

import java.util.Scanner;

public class Potato {

    public static void main(String[] args) {

        Aaloo[] aaloos = new Aaloo[2];

        for (int i = 0; i < aaloos.length; i++) {
            System.out.println("Aaloo object "+(i+1));
            System.out.print("enter qty : ");
            double p = new Scanner(System.in).nextDouble();
            System.out.print("enter price : ");
            double p1 = new Scanner(System.in).nextDouble();
            aaloos[i] = new Aaloo(p, p1);
        }

        for (int i = 0; i < aaloos.length; i++) {
            System.out.println(aaloos[i].toString());
        }

    }
}

class Aaloo {
    double qty;
    double price;

    public Aaloo(double qty, double price) {
        this.qty = qty;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Aaloo{" +
                "qty=" + qty +
                ", price=" + price +
                '}';
    }
}