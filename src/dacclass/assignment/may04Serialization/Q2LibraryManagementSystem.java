package dacclass.assignment.may04Serialization;

import java.io.*;
import java.util.Scanner;

public class Q2LibraryManagementSystem {

    //create desktop  application for library mgt system
    //
    //define class book having fields like bname ,aname ,price and get method and display;
    //
    //define other methods like
    //    writeToFile()
    //  readfromFile()
    //  searchfromFile()
    //
    //In main.kotlin.main design menu driven application
    // 1) store data to file
    // 2) read data fom file
    // 3) search data from file
    // 4) exit

    public static void main(String[] args) throws Exception {

        Scanner s = new Scanner(System.in);
        BookRecords bookRecords = new BookRecords();
        String choice = "";

        do {
            System.out.println("1 Add Book data");
            System.out.println("2 View Book data");
            System.out.println("3 Search Book data");
            System.out.println("4 Exit");
            System.out.println("enter your choice");
            int y = s.nextInt();
            switch (y) {
                case 1 -> bookRecords.writToFile();
                case 2 -> bookRecords.readFromFile();
                case 3 -> bookRecords.searchFromFile();
                case 4 -> System.exit(0);
                default -> System.out.print("wrong choice entered");
            }

            System.out.println("Do you want to continue press yes or no");
            choice = s.next();
        }
        while (!choice.equals("no"));


    }
}

class BookRecords {
    private static final String bookRecordPath = "C:\\Users\\prade\\IdeaProjects\\javalearn\\src\\assignment\\may04Serialization";
    private static final String recordName = "\\BookRecords.dat";
    private final String recordPath = bookRecordPath + recordName;

    void writToFile() throws Exception {

        Book book = new Book();
        book.get();
        File recordFile = new File(recordPath);
        int len = (int) recordFile.length();
        if (len > 0) {
            Appendable appendable = new Appendable(new FileOutputStream(recordPath, true));
            appendable.writeObject(book);
        } else {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(recordPath, true));
            objectOutputStream.writeObject(book);
            objectOutputStream.close();
        }
    }

    void readFromFile() throws IOException {

        ObjectInputStream objectInputStream = null;
        try {
            objectInputStream = new ObjectInputStream(new FileInputStream(recordPath));
            Book book = null;
            do {
                book = (Book) objectInputStream.readObject();
                book.display();
            }
            while (book != null);
        } catch (Exception ignored) {
        } finally {

            if (objectInputStream != null) objectInputStream.close();
        }
    }

    void searchFromFile() throws IOException {
        Scanner s = new Scanner(System.in);
        System.out.println("enter book name you want to search");
        String b = s.next();
        ObjectInputStream objectInputStream = null;
        try {
            objectInputStream = new ObjectInputStream(new FileInputStream(recordPath));
            Book book = null;
            do {
                book = (Book) objectInputStream.readObject();
                if (book.getbName().equals(b))
                    book.display();
            }
            while (book != null);
        } catch (Exception d) {
        } finally {
            if (objectInputStream != null) objectInputStream.close();
        }
    }
}

class Book implements Serializable {
    private String bName;
    private String aName;
    private double bPrice;

    public void get() {

        System.out.println("Book employee details : ");
        System.out.print("Name  : ");
        bName = new Scanner(System.in).nextLine();
        System.out.print("Author : ");
        aName = new Scanner(System.in).nextLine();
        System.out.print("Price : ");
        bPrice = new Scanner(System.in).nextDouble();
    }

    public void display() {
        System.out.println("Book details " +
                "\n Name - " + bName +
                "\n Author  - " + aName +
                "\n Price - " + bPrice

        );
    }

    public String getbName() {
        return bName;
    }

    public String getaName() {
        return aName;
    }

    public double getbPrice() {
        return bPrice;
    }
}

class Appendable extends ObjectOutputStream {
    public Appendable(OutputStream r) throws Exception {
        super(r);
    }

    protected void writeStreamHeader() {
    }
}