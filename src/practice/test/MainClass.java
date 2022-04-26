package practice.test;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class MainClass {

    public static void main(String[] args) {
        Set<Student> ts1 = new TreeSet<Student>();

        ts1.add(new Student("Raju", 23, 8.5f));
        ts1.add(new Student("Ram", 25, 7.5f));
        ts1.add(new Student("Raju", 20, 4.5f));
        ts1.add(new Student("Ramesh", 30, 8.6f));
        ts1.add(new Student("Pradeep", 23, 8.3f));


        Set<Student2> ts2 = new TreeSet<Student2>();

        ts2.add(new Student2("Mahesh", 23, 4.6f));
        ts2.add(new Student2("Rakesh", 22, 7.5f));
        ts2.add( new Student2("Raj", 21, 5.0f));
        ts2.add(new Student2("Kumar", 24, 8.6f));
        ts2.add(new Student2("Vicky", 28, 8.3f));

        Set<Student3> ts3 = new TreeSet<Student3>();

        ts3.add(new Student3("Ajit", 20, 4.6f));
        ts3.add(new Student3("Rakesh", 22, 7.5f));
        ts3.add(new Student3("Ramesh", 23, 6.0f));
        ts3.add( new Student3("Saurabh", 25, 7.6f));
        ts3.add( new Student3("Rakesh", 28, 8.3f));


        //by name
        Set<Student> revSet = new TreeSet<>(Collections.reverseOrder());
        revSet.addAll(ts1);
        //by age
        Set<Student2> revSet2 = new TreeSet<>(Collections.reverseOrder());
        revSet2.addAll(ts2);

         //by cgpa
        Set<Student3> revSet3 = new TreeSet<>(Collections.reverseOrder());
        revSet3.addAll(ts3);

        for(Student revStu : revSet){
            System.out.println(revStu.toString());
        }
        System.out.println("===================================");

        for(Student2 revStu : revSet2){
            System.out.println(revStu.toString());
        }

        System.out.println("===================================");

        for(Student3 revStu : revSet3){
            System.out.println(revStu.toString());
        }

    }
}


