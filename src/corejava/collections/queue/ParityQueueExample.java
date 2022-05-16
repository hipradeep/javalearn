package corejava.collections.queue;

import java.util.PriorityQueue;

public class ParityQueueExample {
    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(4);
        pq.add(2);
        // numbers.add(null); //compile-time error
        System.out.println(pq);

        pq.offer(1);
        pq.offer(3);
        System.out.println(pq);
        System.out.println("head : " + pq.element());
        System.out.println("head : " + pq.peek());

        pq.remove();
        System.out.println(pq);
        pq.poll();
        System.out.println(pq);
    }
}
