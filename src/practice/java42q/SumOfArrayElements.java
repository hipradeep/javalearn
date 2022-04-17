package practice.java42q;

public class SumOfArrayElements {
    //26. Write a user-defined function to find the sumof an arraypassed as argument.
    //-Write a program that declares an array of 10 elements andusesthis function to
    //a) Find the sum of all elements.
    //b) Find the sum of first 5 elements.
    //c) Find the sum of last 5 elements.

    public static void main(String[] args) {
        int[] a={10, 2, 4, 6, 12, 2, 1, 8, 6, 5};

        sumOfElements(a);
        sumOf5Elements(a);
       sumOfLast5Elements(a);
    }

    private static void sumOfLast5Elements(int[] a) {
        int sum=0;
        for (int i = a.length-1; i >a.length-1-5 ; i--) {
            sum=sum+a[i];
        }
        System.out.println("Sum of Last 5 elements : "+sum);
    }

    private static void sumOf5Elements(int[] a) {
        int sum=0;
        for (int i = 0; i <5 ; i++) {
            sum=sum+a[i];
        }
        System.out.println("Sum of 5 elements : "+sum);
    }

    private static void sumOfElements(int[] a) {
        int sum=0;
        for (int j : a) {
            sum =sum+j;
        }
        System.out.println("Sum of elements : "+sum);
    }
}
