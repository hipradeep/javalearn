package practice;

public class EqualExample {

    public static void main(String[] args) {
        String str1=new String("Abc");
        String str2=new String("Abc");

        if (str1==str2) System.out.println("both string objects are equal");
        else   System.out.println("both string objects are not equal");

        if (str1.equals(str2)) System.out.println("both string value are equal");
        else   System.out.println("both string value are not equal");

    }
}
