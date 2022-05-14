package corejava.collections.list;

import java.util.LinkedList;

public class LinkedListExample2 {
    public static void main(String[] args) {
        LinkedList<Food> list = new LinkedList<>();
        list.add(new Food("Burger", 400.0, 5));
        list.add(new Food("Pizza", 150.0, 1));
        list.add(new Food("CocaCola", 335, 10));
        list.add(new Food("Bred", 550, 2));

        for (Food f : list) {
            System.out.println(f);
        }
    }
}

class Food {
    String name;
    double price;
    int qty;

    public Food(String name, double price, int qty) {
        this.name = name;
        this.price = price;
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "Food{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", qty=" + qty +
                '}';
    }
}
