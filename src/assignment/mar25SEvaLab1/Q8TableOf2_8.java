package assignment.mar25SEvaLab1;

public class Q8TableOf2_8 {
    //Q 8 wap to print table of number between 2 to 8;

    public static void main(String[] args) {


        for (int i=2; i<=8; i++){
            System.out.println("\nTable of "+i);
            for (int j=1; j<=10; j++){
                System.out.println(i+" X "+j+" = "+(i*j));
            }
        }
    }

}
