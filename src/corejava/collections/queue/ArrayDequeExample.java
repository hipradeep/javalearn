package corejava.collections.queue;

import java.util.ArrayDeque;

public class ArrayDequeExample {

        public static void main(String[] args) {
            // Creating Deque using the ArrayDeque class
            ArrayDeque<Integer> numbers = new ArrayDeque<>();

            // add elements to the Deque
            numbers.offer(1);
            numbers.offer(1);
            numbers.offerLast(2);
            numbers.offerFirst(3);
           // numbers.offer(null);//exception
            System.out.println("Deque: " + numbers);

            // Access elements of the Deque
            int firstElement = numbers.peekFirst();
            System.out.println("First Element: " + firstElement);

            int lastElement = numbers.peekLast();
            System.out.println("Last Element: " + lastElement);

            // Remove elements from the Deque
            int removedNumber1 = numbers.pollFirst();
            System.out.println("Removed First Element: " + removedNumber1);

            int removedNumber2 = numbers.pollLast();
            System.out.println("Removed Last Element: " + removedNumber2);

            System.out.println("Updated Deque: " + numbers);
        }
}
