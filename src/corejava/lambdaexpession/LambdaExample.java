package corejava.lambdaexpession;

public class LambdaExample implements MVP {

    public static void main(String[] args) {

        LambdaExample lambdaExample = new  LambdaExample();
        //without lambda
        lambdaExample.mvpMethod();

        //lambda expression
        Listener l = () -> {
            System.out.println("on click");
        };
        l.onClick();

        Sum s1=new Sum() {
            @Override
            public int sum1(int a, int b, int c) {
                return a+b+c;
            }
        };

        int k1=s1.sum1(4,6,6);
        System.out.println(k1);

        //shorthand
        Sum s= (a,b,c)-> a+b+c;

       int k = s.sum1(4,5, 4);
        System.out.println(k);

    }

    @Override
    public void mvpMethod() {
        System.out.println("MVPMethod");
    }
}

interface Listener {

    void onClick();
}

interface MVP {
    void mvpMethod();
}

interface Sum {
    int sum1(int a, int b, int c);
}

