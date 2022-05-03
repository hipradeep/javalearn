package practice.java13q;

import java.util.Scanner;

public class ArraySize {

    public static void main(String[] args) {
        System.out.print("enter array size : ");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        try{
            if (size<0){
                throw new ArraySizeException();
            }
            int[] arr=new int[size];
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
class ArraySizeException extends Exception{

    public ArraySizeException() {
        super("Array size is negative");
    }
}