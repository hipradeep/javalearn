package dsanotes.basic.arrays.geeks50;

public class PeakElement {

    public static void main(String[] args) {
        int[] arr = {0, 6, 8, 5, 7, 9};
        int n = arr.length;


        peakElement1(arr, n);
        System.out.println("index : " + peakElement3(arr, 0, n - 1, n));


    }

    private static int peakElement3(int[] arr, int l, int h, int n) {
        int mid = l + (h - l) / 2;

        if ((mid == 0 || arr[mid - 1] <= arr[mid]) && (mid == n - 1 || arr[mid + 1] <= arr[mid])) {
            return mid;
        } else if (mid > 0 && arr[mid - 1] > arr[mid]) {
            return peakElement3(arr, l, mid - 1, n);
        } else return peakElement3(arr, mid + 1, h, n);

    }

    private static int peakElement2(int[] arrr) {
        //?
        int n = arrr.length;
        int l = 0, r = n - 1;
        while (l < r) {
            int mid = (l + r + 1) / 2;
            if (arrr[mid - 1] > arrr[mid]) {
                r = mid - 1;
            } else l = r;
        }
        return l;
    }

    private static void peakElement1(int[] a, int n) {
        //O(n)
        for (int i = 0; i < n; i++) {

            if ((i == 0 || a[i] > a[i - 1]) && (i == n - 1 || a[i] > a[i + 1])) {
                System.out.println("s " + a[i]);
            }

        }
    }
}
