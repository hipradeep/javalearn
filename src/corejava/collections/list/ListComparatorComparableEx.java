package corejava.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ListComparatorComparableEx {
    public static void main(String[] args) {

        // list1();

        //list2();

       list3();

        //list4();

    }

    private static void list4() {
        ArrayList<Product1> list = new ArrayList<>();

        list.add(new Product1("Abc", 56.2, 10));
        list.add(new Product1("laptop", 156.2, 1));
        list.add(new Product1("mouse", 45.2, 5));
        list.add(new Product1("Mobile", 4000.2, 20));

        System.out.println(list);

        Collections.sort(list, new Product1Comparator<Product1>());

        System.out.println(list);
    }

    private static void list3() {
        ArrayList<Product1> list = new ArrayList<>();
        list.add(new Product1("Abc", 56.2, 10));
        list.add(new Product1("ZLaptop", 156.2, 1));
        list.add(new Product1("Mouse", 45.2, 5));
        list.add(new Product1("Bobile", 4000.2, 20));

        System.out.println(list);
        System.out.println("Sort by price");
        Collections.sort(list, new Comparator<Product1>() {
            @Override
            public int compare(Product1 o1, Product1 o2) {
                if (o1.getPrice() > o2.getPrice())
                    return 1;
                else if (o1.getPrice() < o2.getPrice())
                    return -1;
                else return 0;
            }
        });

        System.out.println(list);

        System.out.println("Sort by qty");
        Collections.sort(list, new Comparator<Product1>() {
            @Override
            public int compare(Product1 o1, Product1 o2) {
                if (o1.getQty() > o2.getQty())
                    return 1;
                else if (o1.getQty() < o2.getQty())
                    return -1;
                else return 0;
            }
        });

        System.out.println(list);

        System.out.println("Sort by name");
        Collections.sort(list, new Comparator<Product1>() {
            @Override
            public int compare(Product1 o1, Product1 o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        System.out.println(list);
    }

    private static void list2() {
        ArrayList<Product> list = new ArrayList<>();

        list.add(new Product("Abc", 56.2));
        list.add(new Product("laptop", 156.2));
        list.add(new Product("mouse", 45.2));
        list.add(new Product("Mobile", 4000.2));

        System.out.println(list);

        //using comparable
        Collections.sort(list);

        System.out.println(list);
    }

    private static void list1() {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(5);
        list.add(51);
        list.add(15);
        list.add(50);

        System.out.println(list);

        Collections.sort(list);

        System.out.println(list);
    }
}

class Product1 {
    private String name;
    private double price;
    private int qty;


    public Product1(String name, double price, int qty) {
        this.name = name;
        this.price = price;
        this.qty = qty;
    }

    public int getQty() {
        return qty;
    }

    @Override
    public String toString() {
        return "Product1{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", qty=" + qty +
                '}';
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}


class Product1Comparator<P> implements Comparator<Product1>{



    @Override
    public int compare(Product1 o1, Product1 o2) {
        if (o1.getPrice() > o2.getPrice())
            return 1;
        else if (o1.getPrice() < o2.getPrice())
            return -1;
        else return 0;
    }
}

class Product implements Comparable<Product> {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public int compareTo(Product o) {
        if (this.getPrice() > o.getPrice())
            return 1;
        else if (this.getPrice() < o.getPrice())
            return -1;
        else return 0;

    }
}
