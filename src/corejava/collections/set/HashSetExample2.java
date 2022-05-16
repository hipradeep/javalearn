package corejava.collections.set;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;

public class HashSetExample2 {
    public static void main(String[] args) {
        HashSet<Gift> giftHashSet=new HashSet<Gift>();
        giftHashSet.add(new Gift("Red Car", 5, 70.50));
        giftHashSet.add(new Gift("Lite", 2, 17.00));
        giftHashSet.add(new Gift("Dogs", 1, 100.00));
        System.out.println(giftHashSet);

        //Collections.sort(giftHashSet);

    }
}
class Gift implements Comparable<Gift>{
    String name;
    int qty;
    double price;

    public Gift(String name, int qty, double price) {
        this.name = name;
        this.qty = qty;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Gift{" +
                "name='" + name + '\'' +
                ", qty=" + qty +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Gift o) {
        return this.name.compareTo(o.name);
    }
}
