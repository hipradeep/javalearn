package practice;

public class StringMethods {
    public static void main(String[] args) {

        // create a string
        String greet = "Hello! World";
        System.out.println("String: " + greet);

        // get the length of greet
        int length = greet.length();
        System.out.println("Length: " + length);

        String first = "Java ";

        // join two strings
        String joinedString = first.concat(greet);
        System.out.println("Joined String: " + joinedString);

       // compare first and greet
        boolean result2 = first.equals(greet);
        System.out.println("Strings first and second are equal: " + result2);

        //toLowerCase
        String lc=greet.toLowerCase();
        //toUpperCase
        String uc=greet.toUpperCase();
        System.out.println("Strings to Upper case and Lower Case : " + lc+"  "+uc);

        // contains()
        System.out.println("is 'hello' contain in greet string  : " + greet.contains("Hello"));

        //substring()
        System.out.println("Subsring of greet string  : " + greet.substring(5));

        //replace()
        System.out.println("Replace 'He' to 'Go' in greet string  : " + greet.replace("He", "Go"));

        //charAt()
        System.out.println("Char at 5 index in greet string  : " + greet.charAt(5));
        //indexOf()
        System.out.println("Index of 'W' in greet string  : " + greet.indexOf("W"));
    }
}
