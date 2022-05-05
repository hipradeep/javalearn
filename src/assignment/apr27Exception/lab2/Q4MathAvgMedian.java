package assignment.apr27Exception.lab2;

import assignment.apr27Exception.lab2.maths.MathsOperations;
import assignment.apr27Exception.lab2.stats.StatsOperations;

public class Q4MathAvgMedian {
    public static void main(String[] args) {

        try {
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            int c = Integer.parseInt(args[2]);

            int max = MathsOperations.maxOfThree(a, b, c);
            int min = MathsOperations.minOfThree(a, b, c);

            StatsOperations statsOperations = new StatsOperations();
            float avg = statsOperations.average(a, b, c);
            int median = statsOperations.median(a, b, c);
            System.out.println(
                    "max : " + max +
                            "\nmin : " + min +
                            "\nAvg : " + avg +
                            "\nMedian : " + median


            );
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
