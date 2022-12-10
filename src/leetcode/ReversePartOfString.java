package leetcode;

public class ReversePartOfString {
    //leetcode -2000
    public static void main(String[] args) {
        String word="abcdefd";
        String ch="d";
        final int i = word.indexOf(ch) + 1;
      String ans=  new StringBuilder(word.substring(0, i))
                .reverse()
                .append(word.substring(i))
                .toString();

        System.out.println(ans);
    }
}
