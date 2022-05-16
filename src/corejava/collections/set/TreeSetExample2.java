package corejava.collections.set;

import java.util.TreeSet;

public class TreeSetExample2 {
    public static void main(String[] args) {
        TreeSet<Man> mens=new TreeSet<>();
        mens.add(new Man("Pradeep", 25));
        mens.add(new Man("Zebra", 10));
        mens.add(new Man("Nagu", 30));
        mens.add(new Man("Bholu", 11));
        mens.add(null);

        System.out.println(mens);

    }
}
class Man implements Comparable<Man>{
    String name;
    int age;

    public Man(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Man o) {
        return this.name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return "Man{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
