package dsanotes.basic.searching.linear;

public class StringChar {
    public static void main(String[] args) {
        String str="pradeep";
        char target='a';
        //int index=searchChar(str, target);
        int ch=searchChar2(str, target);
        System.out.println((char) ch);
    }

    private static int searchChar2(String str, char target) {
        if (str.length()<=0) return -1;
        for (char a:  str.toCharArray()) {
            if (a==target) return target;
        }
        return -1;
    }
    private static int searchChar(String str, char target) {
        if (str.length()<=0) return -1;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)==target) return i;
        }
        return -1;
    }
}
