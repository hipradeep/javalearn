package dacclass.assignment.apr27Exception.lab1;

public class Q5CLALessThan10 {

    public static void main(String[] args) {

        int s = 0;
        for (String a : args) {


            try {

                int p=0;
                try {
                     p = Integer.parseInt(a);
                    s += p;

                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }

                if (p < 10) throw new LessThan10Exception("Less Than 10 Exception");

            } catch (LessThan10Exception c) {
                System.out.println(c.getMessage());

            }

        }

        System.out.println("sum of args is : " + s);

    }
}

class LessThan10Exception extends Exception {

    public LessThan10Exception(String msg) {
        super(msg);
    }
}
