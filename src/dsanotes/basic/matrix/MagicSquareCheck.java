package dsanotes.basic.matrix;

public class MagicSquareCheck {

    static int N = 3;

    public static void main(String[] args) {
        int mat[][] = {{2, 7, 6},
                {9, 5, 1},
                {4, 3, 8}};

        if (isMagicSquare(mat))
            System.out.println("MAGIC");
        else
            System.out.println("NO SQUARE");
    }

    static boolean isMagicSquare(int mat[][]) {

        int sumd1 = 0, sumd2 = 0;
        for (int i = 0; i < N; i++) {
            sumd1 += mat[i][i]; //FIRST DIAGONALS SUM
            sumd2 += mat[i][N - 1 - i]; //SECOND DIAGONAL SUM
        }
        //check dum of diagonals are equals
        if (sumd1 != sumd2)
            return false;

        for (int i = 0; i < N; i++) {
            int rowSum = 0, colSum = 0;
            for (int j = 0; j < N; j++) {
                rowSum += mat[i][j]; //sum of row
                colSum += mat[j][i]; //sum of column
            }
            //checking sum of row, column, and diagonals are equals
            if (rowSum != colSum || colSum != sumd1)
                return false;
        }
        return true;
    }
}
