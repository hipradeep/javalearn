package corejava.collections.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapExample {

    public static void main(String[] args) {
        Map<String, String> map=new HashMap<>();
        map.put("A", "Apple");
        map.put("B", "Boy");
        map.put("C", "Cat");
        map.put("D", "Dog");
        map.put("E", "Elephant");

        System.out.println("Map: " + map);

        // Access keys of the map
        System.out.println("Keys: " + map.keySet());

        // Access values of the map
        System.out.println("Values: " + map.values());

        // Access entries of the map
        System.out.println("Entries: " + map.entrySet());

        // Remove Elements from the map
        String value = map.remove("A");
        System.out.println("Removed Value: " + value);

        // Iterate Elements from the map
        Iterator<Map.Entry<String, String>> itr=map.entrySet().iterator();

        while (itr.hasNext()){
            Map.Entry<String, String> entry = itr.next();
            System.out.print("Key : "+entry.getKey());
            System.out.println(", Value : "+entry.getValue());
        }

        //using for loop
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.print("Key : " + entry.getKey());
            System.out.println(", Value : " + entry.getValue());
        }

     }
}
