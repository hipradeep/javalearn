package corejava.collections.queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class LinkedListExample {


    public static void main(String[] args) {
        // Creating Queue using the LinkedList class
        Queue<Integer> numbers = new LinkedList<>();

        // offer elements to the Queue
        numbers.offer(1);
        numbers.offer(2);
        numbers.offer(3);
        numbers.offer(5);
        numbers.offer(6);
        numbers.offer(7);
        numbers.offer(8);
        numbers.offer(9);
        numbers.add(10);
        System.out.println("Queue: " + numbers);

        // Access elements of the Queue
        int accessedNumber = numbers.peek();
        System.out.println("Accessed Element: " + accessedNumber);

        // Remove elements from the Queue
        int removedNumber = numbers.poll();
        System.out.println("Removed Element: " + removedNumber);
        // Remove elements from the Queue
        int removedNumber2 = numbers.remove();
        System.out.println("Removed Element2: " + removedNumber2);

        // Remove elements from the Queue
        boolean removedNumber3 = numbers.remove(3);
        System.out.println("Removed Element2: " + removedNumber3);

        System.out.println("Updated Queue: " + numbers);


        Iterator<Integer> iterator = numbers.iterator();

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

    }


}
