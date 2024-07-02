package dacclass.assignment.jul27;

public class Q1LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1, 20, 14, 5, 12, 14, 45, 7};

        findElements(arr, 14);
    }

    private static void findElements(int[] arr, int e) {
        if (isElementPresentInArray(arr, e, 0)) {
            System.out.println(e + " is present in array");
        } else {
            System.out.println(e + " is NOT present in array");
        }
    }

    private static boolean isElementPresentInArray(int[] arr, int e, int i) {
        if (i == arr.length) {
            return false;
        }

        return arr[i] == e || isElementPresentInArray(arr, e, i + 1);
    }
}
