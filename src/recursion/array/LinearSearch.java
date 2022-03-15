package recursion.array;

import java.util.ArrayList;

public class LinearSearch {
    // Find the elements is Array
    public static void main(String[] args) {

        int arr[] = {1, 20, 14, 5, 12,14, 45, 7};

        findElements(arr, 14);
        findIndexOfElementsFromStart(arr, 14);
        findIndexOfElementsFromEnd(arr, 14);

        System.out.println(returnElements(arr, 14, 0, new ArrayList<>()));

    }

    private static void findElements(int[] arr, int e) {
        if (isElementPresentInArray(arr, e, 0)) {
            System.out.println(e + " is present in array");
        } else {
            System.out.println(e + " is NOT present in array");
        }
    }

    private static void findIndexOfElementsFromStart(int[] arr, int e) {

        System.out.println(e + " is present in array at " + findIndexFromStart(arr, e, 0) + " from start");
    }

    private static void findIndexOfElementsFromEnd(int[] arr, int e) {

        System.out.println(e + " is present in array at " + findIndexFromEnd(arr, e, arr.length - 1) + " from end");

    }

    private static boolean isElementPresentInArray(int[] arr, int e, int i) {
        if (i == arr.length) {
            return false;
        }

//        if (arr[i] == e){
//            return true;
//        }else {
//            return isElementPresentInArray(arr, e, i+1);
//        }

        return arr[i] == e || isElementPresentInArray(arr, e, i + 1);
    }

    private static int findIndexFromStart(int[] arr, int e, int i) {
        if (i == arr.length) { // if array index is over
            return -1;
        }
        if (arr[i] == e) {
            return i;
        }
        return findIndexFromStart(arr, e, i + 1);
    }

    private static int findIndexFromEnd(int[] arr, int e, int i) {
        if (i == -1) {
            return -1;
        }
        if (arr[i] == e) {
            return i;
        }
        return findIndexFromEnd(arr, e, i - 1);
    }

    private static ArrayList<Integer> returnElements(int[] arr, int e, int i, ArrayList<Integer> list) {
        if (i == arr.length) {
            return list;
        }
        if (arr[i] == e) {
            list.add(e);
        }
        System.out.println(arr[i]);
        return returnElements(arr, e, i + 1, list);
    }
}
