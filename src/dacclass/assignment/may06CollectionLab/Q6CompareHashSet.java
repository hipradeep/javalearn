package dacclass.assignment.may06CollectionLab;

import java.util.HashSet;

public class Q6CompareHashSet {
    //Q 7 write a java program to compare two hashSet
    public static void main(String[] args) {
        HashSet<String> hashSet1 = new HashSet<>();
        hashSet1.add("abc");
        hashSet1.add("xyz");
        hashSet1.add("pqr");
        hashSet1.add("lbh");


        HashSet<String> hashSet2 = new HashSet<>();
        hashSet2.add("cde");
        hashSet2.add("xyz");
        hashSet2.add("lmn");
        hashSet2.add("lbh");


        boolean value = hashSet1.equals(hashSet2);


        System.out.println("Are both set equal: " + value);
    }
}
