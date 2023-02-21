package dsanotes.basic.matrix;

public class DiagonalSum {
    public static void main(String[] args) {
        int[][] mat={{1,2,1},{4,5,6},{7,8,9}};

        System.out.println(primaryDiagonalSum(mat));
        System.out.println(secondaryDiagonalSum(mat));
    }

    private static int primaryDiagonalSum(int[][] mat) {
        int sum=0;
        for (int j = 0; j < mat.length; j++)
            sum += mat[j][j];
        return sum;
    }

    private static int secondaryDiagonalSum(int[][] mat) {
        int sum=0;
        int s = mat.length-1;
        for (int[] ints : mat) sum += ints[s--];
        return sum;
    }
}
