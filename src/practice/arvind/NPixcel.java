package practice.arvind;


import java.util.ArrayList;
import java.util.List;

public class NPixcel {
    public static int[] createRectangle(int n) {
        List<int[]> factors = new ArrayList<>();

        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                int[] pair = {i, n / i};
                factors.add(pair);
            }
        }

        int minDifference = Integer.MAX_VALUE;
        int[] bestPair = null;

        for (int[] factorPair : factors) {
            int a = factorPair[0];
            int b = factorPair[1];
            if (a <= b && b - a < minDifference) {
                minDifference = b - a;
                bestPair = factorPair;
            }
        }

        if (bestPair == null) {
            return null; // No valid rectangle dimensions found
        }

        return bestPair;
    }

    public static void main(String[] args) {
        int n = 8;
        int[] rectangleDimensions = createRectangle(n);
        if (rectangleDimensions != null) {
            System.out.println(rectangleDimensions[0] + " " + rectangleDimensions[1]);
        } else {
            System.out.println("No valid rectangle dimensions found.");
        }
    }
}