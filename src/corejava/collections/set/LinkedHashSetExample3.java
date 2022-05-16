package corejava.collections.set;

import java.util.LinkedHashSet;

public class LinkedHashSetExample3 {
    public static void main(String[] args) {
        LinkedHashSet<Box> lhs = new LinkedHashSet<>();
        lhs.add(new Box("Square", 4));
        lhs.add(new Box("Qube", 4));
        lhs.add(new Box("Rectangle", 4));

        System.out.println(lhs);
    }
}

class Box {
    String name;
    int height;

    public Box(String name, int height) {
        this.name = name;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Box{" +
                "name='" + name + '\'' +
                ", height=" + height +
                '}';
    }
}
