package dsanotes.basic.matrix;

public class SpiralOrderPrint {
    //Print matrix in spiral order

    public static void main(String[] args) {
        int[][] mat =
                {
                        //top, left           //top,right
                        {1, 2, 3, 4, 5},
                        {16, 17, 18, 19, 6},
                        {15, 24, 25, 20, 7},
                        {14, 23, 22, 21, 8},
                        {13, 12, 11, 10, 9}
                        //bottom, left      //bottom, right
                };
        printInSpiralOrder(mat);
    }

    private static void printInSpiralOrder(int[][] mat) {
        //row size = mat[0].lenght
        //col size = mat.length

        int top = 0, left = 0;
        int bottom = mat.length - 1; //col size
        int right = mat[0].length - 1;  //row size

        int total = mat.length * mat[0].length;
        int count = 0;


        while (count < total) {

            //print row,  from top-left to top-right
            for (int i = top, j = left; j <= right && count < total; j++) {
                System.out.print(mat[i][j] + " ");
                count++;
            }
            //go for next row
            top += 1;

            //print col, from top-right to bottom-right
            for (int i = top, j = right; i <= bottom && count < total; i++) {
                System.out.print(mat[i][j] + " ");
                count++;
            }
            //go for (n-1) col from right
            right -= 1;

            //print row, from bottom-right to bottom-left
            for (int  i = bottom, j = right; j >= left && count < total; j--) {
                System.out.print(mat[i][j] + " ");
                count++;
            }
            bottom -= 1;

            //print col, from left-bottom to left-top
            for (int i = bottom, j = left; i >= top && count < total; i--) {
                System.out.print(mat[i][j] + " ");
                count++;
            }
            left += 1;


        }


    }

    private static void printSpiralOrder122(int[][] mat) {
        // base case
        if (mat == null || mat.length == 0) {
            return;
        }

        int top = 0, left = 0;
        int bottom = mat.length - 1; //col size
        int right = mat[0].length - 1;  //row size

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
