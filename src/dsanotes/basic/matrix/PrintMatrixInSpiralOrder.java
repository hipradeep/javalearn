package dsanotes.basic.matrix;

public class PrintMatrixInSpiralOrder {
    //Print matrix in spiral order

    public static void main(String[] args) {
        int[][] mat =
                {
                        {1, 2, 3, 4, 5},
                        {16, 17, 18, 19, 6},
                        {15, 24, 25, 20, 7},
                        {14, 23, 22, 21, 8},
                        {13, 12, 11, 10, 9}
                };

        printInSpiralOrder(mat);


    }

    private static void printInSpiralOrder(int[][] mat) {

        int top = 0, bottom = mat.length, left = 0, right = mat[0].length;

        while (true) {

            if (left > right) break;

            for (int i = top; i < right; i++) {
                System.out.print(mat[top][i] + " ");
            }
            top += 1;
            if(top>bottom) break;

            for (int i = top; i < bottom; i++) {
                System.out.print(mat[i][right - 1] + " ");
            }
            right -= 1;
            if (left > right) break;

            for (int i = right ; i >= bottom-1; i--) {
                System.out.print(mat[bottom - 1][i] + " ");
            }
            bottom -= 1;
            if(top>bottom) break;
            for (int i = bottom - 1; i >= top; i--) {
                System.out.print(mat[i][left] + " ");
            }
            left += 1;


        }


    }

    private static void printSpiralOrder(int[][] mat) {
        // base case
        if (mat == null || mat.length == 0) {
            return;
        }

        int top = 0, bottom = mat.length - 1;
        int left = 0, right = mat[0].length - 1;

        while (true) {
            if (left > right) {
                break;
            }

            // print top row
            for (int i = left; i <= right; i++) {
                System.out.print(mat[top][i] + " ");
            }
            top++;

            if (top > bottom) {
                break;
            }

            // print right column
            for (int i = top; i <= bottom; i++) {
                System.out.print(mat[i][right] + " ");
            }
            right--;

            if (left > right) {
                break;
            }

            // print bottom row
            for (int i = right; i >= left; i--) {
                System.out.print(mat[bottom][i] + " ");
            }
            bottom--;

            if (top > bottom) {
                break;
            }

            // print left column
            for (int i = bottom; i >= top; i--) {
                System.out.print(mat[i][left] + " ");
            }
            left++;
        }
    }


}