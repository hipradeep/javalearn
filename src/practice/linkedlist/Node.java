package practice.linkedlist;

class Node {
    final Integer data;
    Node next;

    Node(Integer data, Node next) {
        this.data = data;
        this.next = next;
    }

    Node(Integer data) {
        this.data = data;
        this.next = null;
    }
}
