package practice.arvind;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MinimumAbsoluteDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the array elements (space-separated): ");
        String input = scanner.nextLine();

        String[] numStrings = input.split(" ");
        Integer[] heights = new Integer[numStrings.length];

        for (int i = 0; i < numStrings.length; i++) {
            heights[i] = Integer.parseInt(numStrings[i]);
        }

        int minDiff = minimumAbsoluteDifference(Arrays.asList(heights));
        System.out.println("Minimal absolute difference: " + minDiff);

        scanner.close();
    }

    public static int minimumAbsoluteDifference(List<Integer> heights) {
        Integer[] sortedHeights = heights.toArray(new Integer[0]);
        Arrays.sort(sortedHeights);
        int minDiff = Integer.MAX_VALUE;

        for (int i = 1; i < sortedHeights.length; i++) {
            int diff = sortedHeights[i] - sortedHeights[i - 1];
            minDiff = Math.min(minDiff, diff);
        }

        return minDiff;
    }
}
