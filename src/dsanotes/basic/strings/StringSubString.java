package dsanotes.basic.strings;

public class StringSubString {
    public static void main(String[] args) {
        String str="pradeep";
                  //0123456

        //beginIndex – the beginning index, inclusive.
        //endIndex – the ending index, exclusive
        System.out.println(str.substring(0,2));
        System.out.println(str.substring(2,2));
        //str.substring(2) -> inclusive
        System.out.println(str.substring(2));
    }
}
