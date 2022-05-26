package corejava.collections.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        Map<String, String> map=new LinkedHashMap<>();
        map.put("A", "Apple");
        map.put("B", "Boy");
        map.put("C", "Cat");
        map.put("D", "Dog");
        map.put("E", "Elephant");


        //using for loop
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.print("Key : " + entry.getKey());
            System.out.println(", Value : " + entry.getValue());
        }

    }
}
