package dsanotes.basic.arrays.geeks50;

public class MaxMinInArray {
    public static void main(String[] args) {
        //int[] a={10,4,12,18,25,22,5};
        //int[] a={1,1,1,1,1,1,1};
        int[] a={11,13, 15};


        findMin(a);
        findMax(a);
    }

    private static void findMax(int[] a) {
        int max=0;

        for (int i = 0 ; i <a.length ; i++) {
            if (a[i] > a[max]){
                max=i;
            }
        }
        System.out.println("Max index is :"+max+ " value is : "+a[max]);

    }

    private static void findMin(int[] a) {
        int min=0;

        for (int i = 0 ; i <a.length ; i++) {
            if (a[i] < a[min]){
                min=i;
            }
        }
        System.out.println("Min index is :"+min+ " value is : "+a[min]);
    }
}
