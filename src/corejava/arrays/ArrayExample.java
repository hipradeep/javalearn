package corejava.arrays;

public class ArrayExample {

    public static   void main(String[] args) {

        String[] str = new String[10];
        int[] arrInt = new int[10];
        float[] arrFloat = new float[10];
        arrFloat[2] = 2.0f;
        arrFloat[3] = 2;
        // arrFloat[4] = 4.0; //Required type: float,  Provided: double

        System.out.println(str);  //[Ljava.lang.String;@119d7047
        System.out.println(str[0]);  //null
        System.out.println(arrInt[0]);  //0
        System.out.println(arrFloat[0]);  //0.0
        System.out.println(arrFloat[2]);  //2.0
        System.out.println(arrFloat[3]);  //2.0

        //---length
        //The number of elements currently in the array
        // ---capacity
        //The number of elements the array could hold, if it was full
        //The Array's capacity must be decided when the Array is created
        //The capacity cannot be changed later.
        //if we put elements beyond its capacity it will shoe - ArrayIndexOutOfBoundsException

        //checking capacity of array
        int capacity=str.length;
        System.out.println(capacity);



    }
}
