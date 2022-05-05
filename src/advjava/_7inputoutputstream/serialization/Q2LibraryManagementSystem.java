package advjava._7inputoutputstream.serialization;

import java.io.*;
import java.util.Scanner;

public class Q2LibraryManagementSystem {

    void writToFile() throws Exception {
        Book b = new Book();
        b.get();
        File f = new File("BookRecords.dat");
        int len = (int) f.length();
        if (len > 0) {
            Appendable o = new Appendable(new FileOutputStream("BookRecords.dat", true));
            o.writeObject(b);
        } else {
            ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream("BookRecords.dat", true));
            o.writeObject(b);
        }
    }

    void readFromFile() {
        try {
            ObjectInputStream o = new ObjectInputStream(new FileInputStream("BookRecords.dat"));
            Book r;
            do {
                r = (Book) o.readObject();
                r.display();
            }
            while (r != null);
        } catch (Exception d) {
        }
    }

    void searchFromFile() {
        Scanner s = new Scanner(System.in);
        System.out.println("enter book name you want to search");
        String b = s.next();

        try {
            ObjectInputStream o = new ObjectInputStream(new FileInputStream("BookRecords.dat"));
            Book r;
            do {
                r = (Book) o.readObject();
                if (r.getbName().equals(b))
                    r.display();
            }
            while (r != null);
        } catch (Exception d) {
        }
    }

    public static void main(String[] args) throws Exception {

        Scanner s = new Scanner(System.in);
        Q2LibraryManagementSystem r = new Q2LibraryManagementSystem();
        String choice = "";

        do {
            System.out.println("1 Add    Book data");
            System.out.println("2 view   Book data");
            System.out.println("3 search Book data");
            System.out.println("4 Exit");
            System.out.println("enter your choice");
            int y = s.nextInt();
            switch (y) {
                case 1:
                    r.writToFile();
                    break;
                case 2:
                    r.readFromFile();
                    break;
                case 3:
                    r.searchFromFile();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.print("wrong choice enetered");

            }

            System.out.println("Do you want to continue press yes or no");
            choice = s.next();
        }
        while (!choice.equals("no"));


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