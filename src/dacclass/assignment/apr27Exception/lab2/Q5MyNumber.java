package dacclass.assignment.apr27Exception.lab2;

public class Q5MyNumber {

    public static void main(String[] args) {
        try {
            if (args.length == 0) throw new NoCommandLineArgsException();

            MyNumber myNumber = new MyNumber(Integer.parseInt(args[0]));

            System.out.println("Is "+args[0] + " Even : "+ myNumber.even());
            System.out.println("Is "+args[0] + " Odd : "+ myNumber.odd());
            System.out.println("Is "+args[0] + " Positive : "+ myNumber.positive());
            System.out.println("Is "+args[0] + " Negative : "+ myNumber.negative());
            System.out.println("Is "+args[0] + " Prime : "+ myNumber.prime());

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}

class NoCommandLineArgsException extends Exception {

    public NoCommandLineArgsException() {
        super("No Command Line Args Pass Exception");
    }
}


interface IntOperations {
    boolean positive();

    boolean negative();

    boolean even();

    boolean odd();

    boolean prime();
}

class MyNumber implements IntOperations {
    private int i;

    public MyNumber() {
        i = 0;
    }

    public MyNumber(int i) {
        this.i = i;
    }

    @Override
    public boolean positive() {
        return i >= 0;
    }

    @Override
    public boolean negative() {
        return i < 0;
    }

    @Override
    public boolean even() {
        return i % 2 == 0;
    }

    @Override
    public boolean odd() {
        return i % 2 != 0;
    }

    @Override
    public boolean prime() {

        int flag = 0;
        if (i == 2) return true;

        for (int j = 2; j < i / 2; j++) {
            if (i % j == 0) {
                flag = 1;
                break;
            }
        }

        return flag == 0;
    }
}