package practice;

public class PatternRightTriangle {
    //3.Write a Java program to Print Right Triangle Number PatternType
    //34890
    //476
    //34
    //1
    public static void main(String[] args) {

        for (int i = 0; i < 9; i=i+2) {
            for (int j = 0; j < 9-(i+2); j++) {
                System.out.print(i+j);
            }
            System.out.println();
        }

    }
}
