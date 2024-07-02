package dacclass.assignment.mar23String;

public class CompareString {
    public static void main(String[] args) {
        String str1="Pradeep";
        String str2="Pradeep";

        System.out.println("----------------------------------");
        if (str1==str2) System.out.println("String addresses are same");
        else System.out.println("String addresses are not same");

        if (str1.equals(str2)) System.out.println("String values are same");
        else System.out.println("String values are not same");

        System.out.println("----------------------------------");
        String str3=new String("Pradeep");
        String str4=new String("Pradeep");
        if (str3==str4) System.out.println("String addresses are same");
        else System.out.println("String addresses are not same");

        if (str3.equals(str4)) System.out.println("String values are same");
        else System.out.println("String values are not same");
    }
}
