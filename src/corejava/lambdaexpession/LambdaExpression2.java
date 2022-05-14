package corejava.lambdaexpession;

public class LambdaExpression2 {
    public static void main(String[] args) {

        Operation scSum=new Operation((a, b) -> a+b);
        Operation scMul=new Operation((a, b) -> a*b);
        Operation scDiv=new Operation((a, b) -> a/b);
        Operation scMOd=new Operation((a, b) -> a%b);

        int s= scSum.calculate.compute(4,5);
        int m= scMul.calculate.compute(4,5);
        int d= scDiv.calculate.compute(4,5);
        int mo= scMOd.calculate.compute(4,5);

        System.out.println("Sum : "+s);
        System.out.println("Mul : "+m);
        System.out.println("Div : "+d);
        System.out.println("Mod : "+mo);

    }
}
class Operation {
    Calculate calculate;
    public Operation(Calculate sumMethod) {
        this.calculate = sumMethod;
    }
}
interface Calculate {
    int compute(int a, int b);
    //int compute(int a, int b,int c);
}