package practice.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OOOP {
    public static void main(String[] args) {
//        ConcurrentHashMap<String, Integer> concurrentHashMap=new ConcurrentHashMap<>();
//        concurrentHashMap.put("A", 1);
//        concurrentHashMap.put("B", 2);
//        concurrentHashMap.put("C", 3);
//        concurrentHashMap.put("D", 4);
//
//        concurrentHashMap.forEach(  (k, v),2 -> System.out.printf("    k: %s, v: %s%n", k, v+""+ Thread.currentThread().getName())); //foreach function

        List<String> dataList= Arrays.asList("Code", "I", "JAva");
        List<String> sorData=dataList
                .stream()
                .sorted(String::compareTo)
                .collect(Collectors.toList());

        List<String> sorData3=dataList
                .stream()
                .sorted((str1, str2)-> str1.compareTo(str2))
                .collect(Collectors.toList());




    }
}

class LambdaTest{
    final static String lang="java";

    public static void main(String[] args) {
        LT lt= m-> System.out.println(lang+m);
        lt.sMsg("pr");
    }
}

interface LT{
    void sMsg(String str);
}


class ReplaceString{

    public static void main(String[] args) {
        String originalSting="Lorem Ipsum is simply dummy text of the printing and typesetting industry.";

        int totalWords=1;
        for (int i = 0; i < originalSting.length(); i++) {
            if (originalSting.charAt(i)== 32){
                ++totalWords;
            }
        }

        Stack stack=new Stack(totalWords);
        for (int i = 0; i < originalSting.length(); i++) {
            if (originalSting.charAt(i)== 32){
                ++totalWords;
            }
        }


        System.out.println(totalWords);
    }
   static class Stack{
        int[] stack;
        int SIZE;
        int top;

        public Stack(int SIZE) {
            stack=new int[SIZE];
            this.SIZE = SIZE;
            this.top=-1;
        }
        boolean isEmpty(){
            return top==-1;
        }
        //check is full
        boolean isFull(){
            return top==SIZE-1;
        }

        //push
        void push(int item){
            if (isFull()){
                System.out.println("Stack is full");
                return;
            }
            stack[++top]=item;

        }
    }


}


class P0p1{
    public static void main(String[] args) {
        System.out.println(-6%3);
        System.out.println(-5%3);
        System.out.println(-4%3);
        System.out.println(-3%3);
        System.out.println(-2%3);
        System.out.println(-1%3);
        System.out.println(-0%3);
    }
}



