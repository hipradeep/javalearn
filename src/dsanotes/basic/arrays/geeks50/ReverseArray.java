package dsanotes.basic.arrays.geeks50;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        //int [] a={12, 14, 20, 3, 56, 2};
        int [] a={12, 14};
        System.out.println(Arrays.toString(a));

        reverseArray(a);
    //    meanAndDeviation();
    }

    private static void reverseArray(int[] a) {
        int i, j;
        for ( i = 0, j=a.length-1; i < j  ; i++, j--) {
            int t=a[i];
            a[i]=a[j];
            a[j]=t;
        }
        System.out.println(Arrays.toString(a));

    }

    static void meanAndDeviation(){
        System.out.print("enter total values of input : ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        float[] a=new float[n];

        for (int i = 0; i < n; i++) {
            System.out.print("enter "+(i+1)+" value ");
            a[i]=sc.nextInt();
        }

        System.out.println("Your entered values are : " );
        System.out.print(Arrays.toString(a));

        //calculate mean

        float m=0;

        for (int i = 0; i <n ; i++) {
            m=m+a[i];
        }
        float mean=m/n;
        System.out.println("\nMean is : "+ mean);

        //calcualte deviation

        float upperValue=0;
        for (int i = 0; i <n ; i++) {
            upperValue=upperValue+ (a[i]-mean)*(a[i]-mean);
        }
        double baseValue=n-1;

        double  p =upperValue/baseValue;

        double dev= Math.pow(p, 0.5);

        System.out.println("deviation is : "+dev);



    }
}

