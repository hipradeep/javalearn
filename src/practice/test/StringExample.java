package practice.test;

import java.util.Arrays;

public class StringExample {
}

class Str2{
    public static void main(String[] args) {
        String str1="7";
        String str2="pradeep8";
        System.out.println(str1.concat(str2));
        System.out.println(concat(str1, str2));
    }
    public static String concat(String str1, String str2) {
        int otherLen = str2.length();
        if (otherLen == 0) {
            return str1;
        }
        int len = str1.length();
        char[] buf = Arrays.copyOf(str1.toCharArray(), len + otherLen);
        str2.getChars(0,otherLen, buf, len);
        return new String(buf);
    }
}

class Str1{

    public static void main(String[] args) {
        String str1="313";
        String str2="";

        //s1>s2 => 1
        //s1<s2 => -1
        //s1=s2 => 0
        System.out.println(str1.compareTo(str2));
        System.out.println("--");
        //internal working
        System.out.println(compareTo(str1,str2));
    }
    static int compareTo(String s1, String s2) {
        int length1 = s1.length();
        int length2 = s2.length();
        int limit = Math.min(length1, length2);
        char v1[] = s1.toCharArray();
        char v2[] = s2.toCharArray();

        int i = 0;
        while (i < limit) {
            char ch1 = v1[i];
            char ch2 = v2[i];
            if (ch1 != ch2) {
                System.out.println(ch1+" "+(int)ch1);
                System.out.println(ch2+" "+(int)ch2);
                return ch1 - ch2;
            }
            i++;
        }
        return length1 - length2;
    }
}

class Example{
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }


    private static int getI(int i) {
        return ++i;
    }
    private static int getII(int i) {
        return i++;
    }
    private static int getIII(int i) {
        return i+1;
    }
}

