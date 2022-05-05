package dacclass.may04Generic;

public class GenericExamples {
    public static void main(String[] args) {
        MyGenClass<Integer> ni = new MyGenClass<>();
        System.out.println(ni.add(10, 20));
        MyGenClass<Float> ni2 = new MyGenClass<>();
        System.out.println(ni2.add(1.0f, 20.0f));
        MyGenClass<String> ni3 = new MyGenClass<>();
        System.out.println(ni3.add("10", "20"));

    }
}

class MyGenClass<T> {
    T a;
    T b;


    T add(T a, T b) {
        if (a instanceof Integer && b instanceof Integer) {
            Integer i = (Integer) a + (Integer) b;
            return (T) (i);
        }

        if (a instanceof Float && b instanceof Float)
            return (T) (Float.valueOf((Float) a + (Float) b));
        if (a instanceof String && b instanceof String)
            return (T) ((String) a + (String) b);
        return null;
    }

}
