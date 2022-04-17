package practice;

public class AbsSumOfTwoNumber extends Sum {
    //5. Write a JAVA program for computing sumof two integersand floats using abstract classes.
    public static void main(String[] args) {
        AbsSumOfTwoNumber a = new AbsSumOfTwoNumber();
        a.sumOfFloat(2.2f, 3.3f);
        a.sumOfInt(5, 6);
    }

    @Override
    void sumOfInt(int a, int b) {
        System.out.println("");
        System.out.println(a + b);
    }

    @Override
    void sumOfFloat(float x, float y) {
        System.out.println(x + y);
    }
}

abstract class Sum {
    abstract void sumOfInt(int a, int b);

    abstract void sumOfFloat(float x, float b);
}
