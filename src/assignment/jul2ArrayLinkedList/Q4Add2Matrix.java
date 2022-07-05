package assignment.jul2ArrayLinkedList;

public class Q4Add2Matrix {
    //Write a program for addition of two matrix.

    public static void main(String[] args) {
        int[][] mat1 =
                {
                        {4, 3, 5, 6},
                        {6, 5, 1, 3},
                        {4, 2, 3, 9},
                        {2, 7, 5, 6}
                };

        int[][] mat2 =
                {
                        {7, 2, 1, 4},
                        {6, 1, 1, 3},
                        {7, 4, 9, 1},
                        {1, 6, 5, 2}
                };

        int[][] mat3 =
                {
                        {1, 4},
                        {2, 6}
                };
        int[][] mat4 =
                {
                        {2, 5},
                        {6, 2}
                };

        System.out.println("Matrix 1 ");
        printMatrix(mat1);
        System.out.println("Matrix 2 ");
        printMatrix(mat2);
        int[][] sum1 = matrixSum(mat1, mat2);
        System.out.println("Matrix Sum ");
        printMatrix(sum1);

        System.out.println("Matrix 3 ");
        printMatrix(mat3);
        System.out.println("Matrix 4 ");
        printMatrix(mat4);
        int[][] sum2 = matrixSum(mat3, mat4);
        System.out.println("Matrix Sum ");
        printMatrix(sum2);


    }

    private static int[][] matrixSum(int[][] mat1, int[][] mat2) {

        if (mat1[0].length != mat2[0].length && mat1.length != mat2.length) {
            System.out.println("Sum not possible");
            return new int[][]{{0}};
        }
        int[][] c = new int[mat1.length][mat1[0].length];

        for (int i = 0; i < mat1.length; i++) {

            for (int j = 0; j < mat1[0].length; j++) {

                c[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
        return c;
    }

    private static void printMatrix(int[][] arr) {
        int rows = arr.length;
        int column = arr[0].length;
        System.out.println("["+rows+"x"+column+"]");
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
