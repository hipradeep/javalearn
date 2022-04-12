package advjava._6autoboxing;

import java.util.ArrayList;

public class AutoboxExample {
    //The automatic conversion of primitive data types into its equivalent Wrapper type is known as boxing
    // and opposite operation is known as unboxing.

    //Autoboxing - Primitive Type to Wrapper Object
    //Unboxing - Wrapper Objects to Primitive Types


    public static void main(String[] args) {


        int a = 56;
        // autoboxing
        Integer aObj = a;
//or
        Integer aObj2 = Integer.valueOf(a);

        // unboxing
        int b = aObj;

//--------------------------------------------//


        ArrayList<Integer> list = new ArrayList<>();

        //autoboxing
        list.add(5);
        list.add(6);

        System.out.println("ArrayList: " + list);

        // unboxing
        int c = list.get(0);
        System.out.println("Value at index 0: " + c);
    }


}
