package practice.java13q;

import java.io.*;

public class SeriliazationBook {

        public static void main(String[] args)throws Exception
        {
            book b= new book();
            b.accept();
            //this is called seriliazation  / marshalling
            FileOutputStream f= new FileOutputStream("book.dat");

            ObjectOutputStream oi= new ObjectOutputStream(f);

            oi.writeObject(b);// this will write object data to file after conevrting it binary form

            oi.close();

            //deserialization

            ObjectInputStream k= new ObjectInputStream(new FileInputStream("book.dat"));

            book m=(book) k.readObject();
            m.display();
            k.close();


    }

}


class book implements Serializable
{
    String bname;
    int price;
    void accept()
    {
        bname="java";
        price=233;

    }
    void display()
    {
        System.out.println(bname +"  "+ price);
    }
}
