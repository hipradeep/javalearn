package java_v;

import java.io.Closeable;

public class Java10Example {
    static class Book implements AutoCloseable{
        public void close() {
            System.out.println("D");
        }
    }

    static class Cart implements Closeable {
        public void close() {
            System.out.println("W");
            throw new RuntimeException();
        }
    }

    public static void main(String[] args) {
        var d = new Book();
        try ( d ; Cart w = new Cart()){
            System.out.println("T");
        }
        catch(Exception e) {
            System.out.println("E");
        }
        finally {
            System.out.println("P");
        }
    }
}
