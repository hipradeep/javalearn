package assignment.apr7constructorandstatic;

public class Q15Calculation extends Calculation{

    public static void main(String[] args) {
        Q15Calculation calculation=new Q15Calculation();

        int d=calculation.division(16,10);
        System.out.println(d);
        int s=calculation.subtration(15,6);
        System.out.println(s);

    }

}

class Calculation{

    int subtration (int a,int b){

        if (b>a) {
            System.out.println("b should not be greater than a");
            return -1;
        }
        return a-b;
    }
    int division( int a,int b){

        if (b==0){
            System.out.println("b should not be zero");
            return -1;
        }
        return  a/b;
    }

}
