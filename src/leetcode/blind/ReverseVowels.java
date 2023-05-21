package leetcode.blind;

public class ReverseVowels {

    public static void main(String[] args) {
        String s="hello";
        System.out.println(reverseVowels(s));
    }

    public static String reverseVowels(String s) {
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if( !isChar(s.charAt(i))){
                i++;
                continue;
            }
            if( !isChar(s.charAt(j))){
                j--;
                continue;
            }
            char temp= s.charAt(i);
            s = s.substring(0, i) + s.charAt(j)  + s.substring(i + 1);
            s = s.substring(0, j) + temp  + s.substring(j + 1);
            i++;
            j--;
        }
        return  s;
    }

    private static boolean isChar(char t){
        return t=='a' || t=='A'|| t=='e'||t=='E'||t=='i'||t=='I'||t=='u'||t=='U'|t=='o'|t=='O';
    }
}