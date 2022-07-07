package dacclass.june.recursion;

public class Recursion {
    public static void main(String[] args) {

//        int s= sumOfUptoN(3);
//        System.out.println(s);

        call(3);
    }
    static void call(int n){
        if (n>0){
            call(--n);
            System.out.println(n);;
            call(--n);
        }
    }

    private static int sumOfUptoN(int n) {
        if (n<=1) return 1;
        return n + sumOfUptoN(n-1);
    }
}
