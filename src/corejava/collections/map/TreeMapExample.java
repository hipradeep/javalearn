package corejava.collections.map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        Map<String, String> map=new TreeMap<>();
        map.put("A", "Apple");
        map.put("E", "Elephant");
        map.put("C", "Cat");
        map.put("B", "Boy");
        map.put("D", "Dog");

        //using for loop
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.print("Key : " + entry.getKey());
            System.out.println(", Value : " + entry.getValue());
        }
    }
}
