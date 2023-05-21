package leetcode.blind;

public class MergeStringAlternately {
    public static void main(String[] args) {
        String w1="abc";
        String w2="xyz";

        System.out.println(mergeStringAlternately(w1,w2));
    }

    private static String mergeStringAlternately(String w1, String w2) {
        int l1=w1.length();
        int l2=w2.length();
        StringBuffer sb=new StringBuffer();
        int len=l1+l2;
        for(int i=0; i< len ; i++ ){
            if(i<l1)
                sb.append(w1.charAt(i));
            if(i<l2)
                sb.append(w2.charAt(i));

        }
       return sb.toString();
    }

    private static String mergeStringAlternately1(String w1, String w2) {
        int l1=w1.length();
        int l2=w2.length();
        StringBuffer sb=new StringBuffer();
        int i=0;
        while(i<l1 || i<l2 ){
            if(i<l1)
                sb.append(w1.charAt(i));
            if(i<l2)
                sb.append(w2.charAt(i));
            i++;
        }
       return sb.toString();
    }
}
