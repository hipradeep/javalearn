package corejava.collections.list;

import java.util.*;

public class ListCollectionExamples {
    //List <data-type> list1= new ArrayList();
    //List <data-type> list2 = new LinkedList();
    //List <data-type> list3 = new Vector();
    //List <data-type> list4 = new Stack();
    public static void main(String[] args) {

        exampleArrayList();
        exampleLinkedList();
        //exampleVector();
      //  exampleStack();


    }

    private static void exampleStack() {
        Stack<String> s=new Stack<>();

        s.add("neha");

        s.add("pradeep");
        s.add("shyam");

    }

    private static void exampleVector() {
        Vector<String> v=new Vector<>();

        v.add("neha");
        v.add("pradeep");
        v.add("shyam");

    }

    private static void exampleLinkedList() {
        System.out.println("LinkedList");
        //it uses double linked list
        //inherit both list and dequeue

        LinkedList<String> ll=new LinkedList<>();

        ll.add("neha");
        ll.add("zeno");
        ll.add("pradeep");
        ll.add("pradeep");
        ll.add("shyam");
        ll.remove(1);

        System.out.println(ll);
    }

    private static void exampleArrayList() {
        System.out.println("ArrayList");
        ArrayList<String> al=new ArrayList<>();

        al.add("neha");
        al.add("zeno");
        al.add("pradeep");
        al.add("pradeep");
        al.add("shyam");
       // al.remove(1);

        System.out.println(al);
        Iterator<String> itr=al.iterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
