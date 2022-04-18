package dsanotes.basic.arrays.twopointers;

public class TwoElementsSumIsX {
    //Given a sorted array A (sorted in ascending order), having N integers,
    // find if there exists any pair of elements (A[i], A[j]) such that their sum is equal to X.

    public static void main(String[] args) {
        int[] arr = {10, 20, 35, 50, 75, 80};
        int n = arr.length;
        int x = 70;
        //System.out.println("Is sum of two elements is x found " + withoutTwoPinter(arr, n, x));
        System.out.println("Is sum of two elements is x found " + withTwoPointer(arr, n, x));

    }

    private static boolean withTwoPointer(int[] arr, int n, int x) {
        int i = 0, j = n - 1;
        while (i < j) {
            if ((arr[i] + arr[j] == x)) return true;
            else if ((arr[i] + arr[j]) < x) i += 1;
            else j -= 1;
        }
        return false;
    }

    private static boolean withoutTwoPinter(int[] arr, int n, int x) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) continue;
                // if ((arr[i] + arr[j]) < x) continue; //not necessary
                if ((arr[i] + arr[j]) == x) return true;
                if ((arr[i] + arr[j]) > x) break;
            }
        }
        return false;
    }

}
