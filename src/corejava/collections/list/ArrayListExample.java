package corejava.collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListExample {

    public static void main(String[] args) {

        //type1();
        type2();
    }

    private static void type2() {
        ArrayList<String> al=new ArrayList<>();
        al.add("pradeep");
        al.add("maurya");
        al.add("raju");
        al.add("sanju");


        System.out.println(al.indexOf("pradeep"));
        ListIterator<String> listIterator=al.listIterator();


        while (listIterator.hasNext()){
            listIterator.add("pop");
            //System.out.println(listIterator.previous());
            System.out.println(listIterator.nextIndex()+" at index "+listIterator.next());

        }
        while (listIterator.hasNext()){
            //listIterator.add("pop");
            //System.out.println(listIterator.previous());
            System.out.println(listIterator.nextIndex()+" aat index "+listIterator.next());

        }
    }

    private static void type1() {
        ArrayList<String> al=new ArrayList<>();

        al.add("neha");
        al.add("zeno");
        al.add("pradeep");
        al.add("pradeep");
        al.add("shyam");
        al.set(1, "pradeep");
        al.set(0, "pradeep1");
        // al.remove(1);

        System.out.println(al);
        Iterator<String> itr=al.iterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
