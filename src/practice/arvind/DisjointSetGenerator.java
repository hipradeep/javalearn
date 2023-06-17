package practice.arvind;

import java.util.*;

public class DisjointSetGenerator {
    public static String canGenerateDisjointSets(int[] arr) {
        int n = arr.length;
        if (n % 2 != 0) {
            return "No";
        }

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int num : arr) {
            if (set1.contains(num) || set2.contains(num)) {
                return "No"; // Duplicate number found, cannot form disjoint sets
            }
            if (num % 2 == 0) {
                set1.add(num);
            } else {
                set2.add(num);
            }
        }

        return (set1.size() > 0 && set2.size() > 0) ? "Yes" : "No";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt(); // Number of test cases

        for (int t = 0; t < T; t++) {
            int n = scanner.nextInt(); // Number of inputs
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt(); // Read input values
            }

            String canGenerate = canGenerateDisjointSets(arr);
            System.out.println(canGenerate);
        }

        scanner.close();
    }
}