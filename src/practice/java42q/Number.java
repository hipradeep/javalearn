package practice.java42q;

public class Number {
    //15. Create class Number with only one private instance variableas a double primitive type.
    // To include the following methods(include respective
    //constructors) isZero( ), isPositive(), isNegative( ), isOdd( ), isEven( ),isPrime(), isAmstrong()
    // the above methods returnboolean primitive type.
    //getFactorial(), getSqrt(), getSqr(), sumDigits(), getReverse() theabove methods return double
    // primitive type. void listFactor(), void dispBinary().
    private double d;

    public Number(double d) {
        this.d = d;
    }

    boolean isZero() {
        return d == 0;
    }

    boolean isPositive() {
        return d > 0;
    }

    boolean isNegative() {
        return d < 0;
    }

    boolean isOdd() {
        return d % 2 != 0;
    }

    boolean isEven() {
        return d % 2 == 0;
    }

    boolean isPrime() {
        int count = 0;
        if (d == 1) {
            return false;
        }
        for (int i = 2; i <= d / 2; i++) {
            if (d % i == 0) {
                count += 1;
            }
        }
        if (count > 0) {
            return false;
        } else {
            return true;
        }
    }

    boolean isAmstrong() {
        //153 = 1*1*1 + 5*5*5 + 3*3*3
        double a, result = 0;
        a = d;
        while (a != 0) {
            result += Math.pow(a % 10, 3);
            a /= 10;
        }
        return result == d;
    }


    double getFactorial() {
        if (d < 0) {
            return -1;
        }
        long p = 1;
        if (d == 0) return p;
        for (int i = 1; i <= d; i++) {
            p = p * i;
        }
        return p;
    }

    double getSqrt() {
        return Math.sqrt(d);
    }

    double getSqr() {
        return d * d;
    }

    double sumDigits() {
        double x=d;
        int sum = 0;
        while (x != 0) {
            sum += x % 10;
            x /= 10;
        }
        return sum;
    }

    double getReverse() {
        String input = String.valueOf(d);
        String reversed = new StringBuffer(input).reverse().toString();
        return Double.parseDouble(reversed);
    }

    void listFactor() {

        for (int i = 1; i <= d; i++) {
            if (d % i == 0) {
                System.out.print(i + " ");
            }
        }
    }

    void dispBinary() {
        String binaryString = Long.toBinaryString(Double.doubleToLongBits(d));
        System.out.println(binaryString);
    }

    public static void main(String[] args) {
         Number n=new Number(45);
        System.out.println( "is Zero  : "+n.isZero());
        System.out.println( "is Positive  : "+n.isPositive());
        System.out.println( "is Negative  : "+n.isNegative());
        System.out.println( "is Odd  : "+n.isOdd());
        System.out.println( "is Even  : "+n.isEven());
        System.out.println( "is Prime  : "+n.isPrime());
        System.out.println( "is Amstrong  : "+n.isAmstrong());
        System.out.println( "Sum of digits  : "+n.sumDigits());
        System.out.println( "Factorial  : "+n.getFactorial());
        System.out.println( "Sqrt  : "+n.getSqrt());
        System.out.println( "Sqr  : "+n.getSqr());
         n.dispBinary();
        n.listFactor();
        System.out.println( "\nReverse : "+n.getReverse());


    }
}
