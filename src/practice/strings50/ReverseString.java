package practice.strings50;

import java.util.Arrays;

public class ReverseString {

    public static void main(String[] args){

        Solution soil=new Solution();

        String s1="i.like.this.program.very.much";
        String sp="\\.";
        String s2="i like this program very much";
        String sp2=" ";
        String s3="i-like-this-program-very-much";
        String sp3="-";
        String s4="i@like@this@program@very@much";
        String sp4="@";
        System.out.println(soil.reverseWords(s4, sp4));
    }
}
class Solution
{
    //Function to reverse words in a given string.
    String reverseWords(String S, String seperator)
    {
        // code here

        String str="";

        String words[]=S.split(seperator);

        for(int i = words.length - 1; i>=0;  i--)
        {
            str=str+words[i];
            if(i!=0)
                str=str+seperator;
        }
        return str;
    }
}

/*




*
*
*
* */