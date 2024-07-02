package dacclass.assignment.mar17lab4_loop;

public class Lab4PrintPrimeNumber {
    //print prime number between 2 and 20
    public static void main(String[] args) {

        for (int i=2; i<=20; i++){
            int flag=0;
            for (int j=2; j<i; j++ )
                if (i % j == 0) {
                    flag = 1;
                    break;
                }
            if (flag==0)
                System.out.println(i);
        }
    }
}
