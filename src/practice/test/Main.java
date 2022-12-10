package practice.test;

import java.util.Arrays;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        System.out.println("Start");
        fun2();
        System.out.println("end");

        int m = max(5, 4);
        System.out.println(m);
        System.out.println(max(5, 4));
    }
    int func1() {
        int b = 100;
        int x = 5 + b;
        return x;
    }
    String func4() {

        return "pradeep";
    }
    static void fun2() {
        System.out.println("pradeep");
        System.out.println("arvind");
        System.out.println("abhishek");
        System.out.println("chandan");
        System.out.println("robert");
        System.out.println("vickey");
    }
    static int max(int x, int y) {
        if (x > y) {
            return x;
        } else {
            return y;
        }
    }
}

class StreamExample {
    public static void main(String[] args) {
        String[] arr = new String[]{"a", "b", "c"};
        Stream<String> streamOfArrayFull = Arrays.stream(arr);
        Stream<String> streamOfArrayPart = Arrays.stream(arr, 1, 3);
        Stream<String> streamBuilder =Stream.<String>builder().add("a").add("b").add("c").build();
        Stream<String> streamGenerated = Stream.generate(() -> "element").limit(10);
        Stream<Integer> streamIterated = Stream.iterate(40, n -> n + 2).limit(20);

        System.out.println(Arrays.toString(streamOfArrayFull.toArray()));
        System.out.println(Arrays.toString(streamOfArrayPart.toArray()));
        System.out.println(Arrays.toString(streamBuilder.toArray()));
        System.out.println(Arrays.toString(streamGenerated.toArray()));
        System.out.println(Arrays.toString(streamIterated.toArray()));


    }
}
