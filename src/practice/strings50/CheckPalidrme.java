package practice.strings50;

public class CheckPalidrme {

    public static void main(String[] arg){
        String s="c1 O$d@eeD o1c";

         s="aaBBa@";
        s="6";
        s="codingninjassajNiNgNidoc";
        s="A1b22Ba";
        s="c1 O$d@eeD o1c";
        s="aaBBa";
        s="6";
        s="N2 i&nJA?a& jnI2n";
        s="5?36@6?35";
        s="0P";
        boolean a =  checkPalindrome2(s);
        System.out.println(a);
    }
    public static boolean checkPalindrome(String str) {

        // WRITE YOUR CODE HERE
        String str1=str.toLowerCase();
        char[] alpha=str1.toCharArray();
        int l=str.length();

        String rev="";
        String mainStr="";

        for(int p=l-1; p>=0; p--){
            if(str1.charAt(p) >= 'a' && str1.charAt(p) <='z'){
                rev=rev+str1.charAt(p);
                mainStr=str1.charAt(p)+mainStr;
            }
        }
        System.out.println(rev);
        System.out.println(mainStr);
        if(mainStr.length()==0) return false;
        if(!rev.equals(mainStr)){
            return false;
        }

//
//        char[] newChar=new char[l];
//
//        int i=0;
//        for(char a: alpha){
//            if(a>= 97 && a<= 122 ){
//                newChar[i]=a;
//                i++;
//            }
//        }

//        String newStr="";
//
//        for(int k=0; k<l; k++){
//            if(newChar[k]!='\0'){
//                newStr=newStr+newChar[k];
//            }
//        }
//        System.out.println(newStr);
//        char[] alpha2=newStr.trim().toCharArray();
//        System.out.println(newStr.trim());
//        if(alpha2.length==0) return false;
//        for(int n=0, j=alpha2.length-1; n<=j; n++, j--){
//            if(alpha2[n]!=alpha2[j]){
//                return false;
//            }
//        }
        return true;

    }
    public static boolean checkPalindrome2(String str) {

        // WRITE YOUR CODE HERE
        if(str.equals(" ")) return false;
        String str1=str.toLowerCase();

        int l=str.length();
        String rev="";
        String mainStr="";

        for(int p=l-1; p>=0; p--){
            if((str1.charAt(p) >= 'a' && str1.charAt(p) <='z') || (str1.charAt(p) >= 48 && str1.charAt(p) <= 57) ){
                rev=rev+str1.charAt(p);
                mainStr=str1.charAt(p)+mainStr;
            }
        }

        if(mainStr.length()==0) return true;


        return rev.equals(mainStr);

    }
}
