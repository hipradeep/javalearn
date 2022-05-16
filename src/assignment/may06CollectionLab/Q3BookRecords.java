package assignment.may06CollectionLab;

import java.util.ArrayList;
import java.util.ListIterator;

public class Q3BookRecords {
    //Q 3 Write program for maintaining book record of library .
    //use ArrayList Class to hold an multiple book record and display all book record using iterator .
    //b) traverse arraylist and store each book record in class object and display book name
    public static void main(String[] args) {

        ArrayList<Book> books=new ArrayList<>();
        books.add(new Book("Java", "Kathy Sierra, Bert Bates"));
        books.add(new Book("PHP", "Robin Nixon"));
        books.add(new Book("Kotlin", "Svetlana Isakova, Bruce Eckel"));
        books.add(new Book("Dart", "Jonathan Sande, Matt Galloway"));

        ListIterator<Book> itr=books.listIterator();
        while (itr.hasNext()) System.out.println(itr.next().getbName());

    }
}

class Book{
    private String bName;
    private String authorName;

    public Book(String bName, String authorName) {
        this.bName = bName;
        this.authorName = authorName;
    }

    public String getbName() {
        return bName;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bName='" + bName + '\'' +
                ", authorName='" + authorName + '\'' +
                '}';
    }
}