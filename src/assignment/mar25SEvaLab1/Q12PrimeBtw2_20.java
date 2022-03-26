package assignment.mar25SEvaLab1;

public class Q12PrimeBtw2_20 {
    //Q 12  print prime numbers between 2 to 20
    public static void main(String[] args) {

        int flag;
        for (int i = 2; i <= 20; i++) {

            flag = i == 2 ? 1 : 0;

            for (int j = 2; j < i; j++) {

                if (i % j == 0) {
                    flag = 1;
                    break;
                }
            }

            if (flag == 0) System.out.print(i + ", ");

        }
    }
}
