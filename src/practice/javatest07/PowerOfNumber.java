package practice.javatest07;

public class PowerOfNumber {

    public static void main(String[] args) {

        //power();
       // swap();
       // findASCII();
        fibonacci();

    }

    private static void fibonacci() {
        int f=0, s=1, r;
        int u=10;
        int i=0;
        while (true){
            r=f+s;
            i++;
            if (i>u) break;
            f=s;
            s=r;
            System.out.println(r);
        }

    }

    private static void findASCII() {
        char a='A';
        char z='z';

        for (char i = 'A'; i <= 'z'; i++) {
            System.out.println("ASCII for "+i+" = "+(int)i);
        }



    }

    private static void swap() {
        int a=4;
        int b=5;
        System.out.println("a : "+a+" b : "+b);
         a=a+b;
         b=a-b;
         a=a-b;

        System.out.println("a : "+a+" b : "+b);


    }

    private static void power() {
        int a = 5;
        int p = 3;

        int z = (int) Math.pow(5, 3);
        System.out.println(z);

        int n = 1;
        for (int i = 0; i < 3; i++) {
            n *= 5;
        }
        System.out.println(n);
    }
}
