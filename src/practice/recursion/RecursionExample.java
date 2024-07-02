package practice.recursion;

public class RecursionExample {
    public static void main(String[] args) {
        System.out.println(sum(345));
    }

    private static int  sum(int n){
        if(n ==0) return 0;

         return n%10 + sum(n/10);
    }




    private static void print(int n) {

        if (n<1) {
            //System.out.println(n);
            return;
        }
        System.out.println(n);
        print(n-1);
        System.out.println(n);
    }





    static int factorial(int n) {
        if (n == 0) return 1;
        return n *  factorial(n-1);
    }
}
