package corejava.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArrayListExample3 {
    public static void main(String[] args) {
        ArrayList<Book> bookList = new ArrayList<>();
        bookList.add(new Book("Java", 400.0, 5));
        bookList.add(new Book("PHP", 150.0, 1));
        bookList.add(new Book("Kotlin", 335, 10));
        bookList.add(new Book("Dart", 550, 2));

        System.out.println("Initial List");
        for (Book b : bookList) {
            System.out.println(b.toString());
        }
        System.out.println("Sort by name");
        Collections.sort(bookList, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.name.compareTo(o2.name);
            }
        });

        // Collections.sort(bookList, Comparator.comparing(o -> o.name));
        // bookList.sort(Comparator.comparing(o -> o.name));

        for (Book b : bookList) {
            System.out.println(b.toString());
        }
        System.out.println("Sort by price");
        Collections.sort(bookList, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                if (o1.price > o2.price) return 1;
                else if (o1.price < o2.price) return -1;
                else return 0;
            }
        });

        //ascending order
        // bookList.sort(Comparator.comparingDouble(o -> o.price));
        //descending order
        //bookList.sort((o1, o2) -> Double.compare(o2.price, o1.price));

        for (Book b : bookList) {
            System.out.println(b.toString());
        }

        System.out.println("Sort by qty");
        Collections.sort(bookList, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return Integer.compare(o1.qty, o2.qty);
            }
        });

        for (Book b : bookList) {
            System.out.println(b.toString());
        }
    }
}

class Book {
    String name;
    double price;
    int qty;

    public Book(String name, double price, int qty) {
        this.name = name;
        this.price = price;
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", qty=" + qty +
                '}';
    }
}
