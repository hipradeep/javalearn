package dsanotes.basic.matrix;

import dsanotes.utils.Utils;

public class MatrixSum {

    public static void main(String[] args) {
        int[][] m1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] m2 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] m3 = {
                {1,},
                {2,},
                {3,}
        };

        Utils.printMatrix(matrixMultiplication(m1, m3));

    }

    private static int[][] matrixMultiplication(int[][] m1, int[][] m2){
        int m1r=m1.length;
        int m1c=m1[0].length;

        int m2r=m2.length;
        int m2c=m2[0].length;

        int[][] result =new int[m1r][m2c];

        for (int i = 0; i <m1r ; i++) {
            for (int j = 0; j < m2c; j++) {
                for (int k = 0; k < m1c; k++) {
                    result[i][j] += m1[i][k] * m2[k][j];
                }
            }

        }
        return result;
    }

    private static int[][] matrixSum(int[][] m1, int[][] m2){
        int[][] result=new int[m1.length][m1[0].length];

        for (int i = 0; i < m1.length ; i++) {
            for (int j = 0; j <m1[0].length ; j++) {
                result[i][j]=m1[i][j]+m2[i][j];
            }
        }
        return  result;
    }
}
