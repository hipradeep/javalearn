package dsanotes.utils;

public class Utils {

    public static int simpleMultidimensionalArray[][] = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};

    public static void printArrayElement(int a) {
        if (String.valueOf(a).length() == 1)
            System.out.print(a + "   ");
        else System.out.print(a + "  ");
    }

    public static void printMultidimensionalArray(int[][] arr) {
        int rows = arr.length;
        int column = arr[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < column; j++) {
                if (String.valueOf(arr[i][j]).length() == 1)
                    System.out.print(arr[i][j] + "   ");
                else System.out.print(arr[i][j] + "  ");
            }
            System.out.println(" ");
        }
    }
}
