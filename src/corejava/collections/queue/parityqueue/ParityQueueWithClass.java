package corejava.collections.queue.parityqueue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class ParityQueueWithClass {
    public static void main(String[] args) {

        PriorityQueue<Animal> pq = new PriorityQueue<>(5, new AnimalComparator());

        pq.add(new Animal("rabbit", 2));
        pq.add(new Animal("rat", 1));
        pq.add(new Animal("ox", 8));
        pq.add(new Animal("goat", 6));
        pq.add(new Animal("cow", 7));

        while (!pq.isEmpty()) {
            System.out.println(pq.poll().getName());
        }

    }
}

class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

class AnimalComparator implements Comparator<Animal> {

    @Override
    public int compare(Animal o1, Animal o2) {
        if (o1.getAge() < o2.getAge())
            return -1;
        else if (o1.getAge() > o2.getAge())
            return 1;
        return 0;
    }
}

class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
