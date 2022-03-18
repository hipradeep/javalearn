package basic.sorting;

public class BubbleSort {

    //also known as sinking sort, exchange sort
    // with each iteration the largest element goes at end
    public static void main(String[] args) {
        int[] arr={4, 3, 1, 2, 5};
        int n= arr.length;
        printArr(arr);
        for (int i=0; i<n; i++){
            for (int j=0; j<n-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        printArr(arr);
    }
    static void printArr(int[] array){
        for (int a: array ) {
            System.out.print(a+", ");
        }
        System.out.println();
    }
}
