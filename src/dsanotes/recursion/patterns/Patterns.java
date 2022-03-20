package dsanotes.recursion.patterns;

public class Patterns {
    public static void main(String[] args) {

        triangleUpward(4, 0);
    }

    static void triangleDownward(int row, int col){
        if (row < 0) return;
        if(col < row){
            System.out.print(" *");
            triangleDownward(row, col+1);
        }else {
            System.out.println("");
            triangleDownward(row-1, 0);
        }
    }
    static void triangleUpward(int row, int col){
        if (row < 0) return;

        if(col < row){
            triangleUpward(row, col+1);
            System.out.print(" *");
        }else {
            triangleUpward(row-1, 0);
            System.out.println("");
        }
    }

}
