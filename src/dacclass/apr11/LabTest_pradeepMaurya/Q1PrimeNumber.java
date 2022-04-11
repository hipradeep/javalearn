package dacclass.apr11.LabTest_pradeepMaurya;

public class Q1PrimeNumber {


    //Q 1  write a program to print prime number between 2 and 30.


    public static void main(String[] args) {

        System.out.println("Prime number between 2 to 30");
        for (int i = 2; i <=30; i++) {
            int flag=0;
            if (i==2) continue;
            for (int j =2 ; j <i ; j++) {
                if (i % j == 0) {
                    flag = 1;
                    break;
                }
            }
            if (flag==0) System.out.print(i +",\t");

        }

    }

}
