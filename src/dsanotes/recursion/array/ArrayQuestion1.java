package dsanotes.recursion.array;

public class ArrayQuestion1 {
         // Checking the array shorted or not

    public static void main(String[] args) {
         int[] arr= {1,2,3,4,5} ;

        checkArraySortedOrNot(arr);
    }

    private static void checkArraySortedOrNot(int[] arr) {

        if (isShorted(arr, 0)){
            System.out.println("Array is shorted");
        }else {
            System.out.println("Array is NOT shorted");
        }
    }

    private static boolean isShorted(int[] arr, int i) {
        if (i==arr.length-1) {
            return true;
        }
//        if(a[i]< a[i+1]){
//            return isShorted(a, i+1);
//        }else {
//          return false;
//        }
        return  arr[i] < arr[i+1] && isShorted(arr, i+1);
    }

}
