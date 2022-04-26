package practice.java42q;

public class AbsSumOfTwoNumber extends Sum implements Sum1{
    //5. Write a JAVA program for computing sumof two integersand floats using abstract classes.
    public static void main(String[] args) {
        AbsSumOfTwoNumber a = new AbsSumOfTwoNumber();
        a.sumOfFloat(2.2f, 3.3f);
        a.sumOfInt(5, 6);
        a.sumTwox(4,6);
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

    @Override
    public void sumTwox(int a, int b) {
        System.out.println(a + b);
    }
}

abstract class Sum {

    abstract void sumOfInt(int a, int b);
    abstract void sumOfFloat(float x, float b);


}

interface Sum1 {
    int abc=100;
    void sumTwox(int a, int b);

}
