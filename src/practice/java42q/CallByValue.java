package practice.java42q;

public class CallByValue {
    //30. Write a program for the following
    //1. Example for call by value.
    //2. Example for call by reference.
    public static void main(String[] args) {

        int sum = sumOf2Num(5, 6); // call by value
        System.out.println(sum);

        //call by reference not exits in java.
    }

    private static int sumOf2Num(int i, int i1) {
        return i + i1;
    }

}

