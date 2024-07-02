package dacclass.assignment.apr27Exception.lab2.maths;

public class MathsOperations {

    public static int maxOfThree(int x, int y, int z) {
        if (x > y && x > z) return x;
        else if (y > x && y > z) return y;
        else return z;
    }
    public static int minOfThree(int x, int y, int z) {
        if (x < y && x < z) return x;
        else if (y < x && y < z) return y;
        else return z;
    }
}
