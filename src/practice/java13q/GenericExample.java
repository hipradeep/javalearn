package practice.java13q;

import java.util.Arrays;
import java.util.List;

public class GenericExample {
    public static void main(String[] args)
    {

        List<Integer> list1 = Arrays.asList(3, 2, 4, 7,1, 7);
        System.out.println("sum is:" + sum(list1));

        List<Double> list2 = Arrays.asList(7.5, 2.2, 4.6, 8.6);

        System.out.print("sum is:" + sum(list2));
    }

    private static double sum(List<? extends Number> list)
    {
        double sum = 0.0;
        for (Number i : list) {
            sum += i.doubleValue();
        }

        return sum;
    }
}
