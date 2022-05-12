package corejava.wrapperclasses;

public class Example1 {

    public static void main(String[] args) {
      //  method1();
        method2();

    }

    private static void method2() {
        String s1="pradeep";
        String s2="maurya";
        System.out.println(s1.compareTo(s2));

        String s3="pradeep";
        String s4="pradeep";
        System.out.println(s3.compareTo(s4));

        String s5="pramesh";
        String s6="pradeep";
        System.out.println(s5.compareTo(s6));
    }

    private static void method1() {
        Integer i=20;
        Integer j=30;
        System.out.println(i.compareTo(j));

        Integer m=100;
        Integer k=50;
        System.out.println(m.compareTo(k));

        Integer x=50;
        Integer y=50;
        System.out.println(x.compareTo(y));
    }
}
