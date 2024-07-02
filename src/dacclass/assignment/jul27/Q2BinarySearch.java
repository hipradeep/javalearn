package dacclass.assignment.jul27;

import java.util.Scanner;

public class Q2BinarySearch {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements: ");
        n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Elements are: ");
        for (int i = 0; i < n; i++) {
            //System.out.print(array[i] + "\t");
            System.out.println(a[i]);
        }
        System.out.println("Enter element to be search : ");
        int num =sc.nextInt();


        int start = 0, end = a.length - 1, mid = (start + end) / 2;

        while (start <= end) {
            if (a[mid] > num) {
                end = mid - 1;
            } else if (a[mid] < num) {
                start = mid + 1;
            } else if (a[mid] == num) {
                System.out.println("Record Found at " + mid);
                break;
            }
            mid = (start + end) / 2;
        }
        if (start > end) {
            System.out.println("Record Not Found");
        }

    }
}
