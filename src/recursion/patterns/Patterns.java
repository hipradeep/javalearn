package recursion.patterns;

public class Patterns {
    public static void main(String[] args) {

        triangle(10, 0);
    }



    static void triangle(int col, int row){
        if (col==0) return;
        if(row < col){
            System.out.print(" *");
            triangle(col, row+1);
        }else {
            System.out.println("\n");
            triangle(col-1, 0);
        }
    }

}
