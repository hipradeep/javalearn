package dacclass.assignment.mar25SEvaLab1;

public class Q14DivisibleBy3_5 {
    //Q 14  wap  to print numbers between 1 to 100 which are divisible by 3, 5 and by both.

    public static void main(String[] args) {

        System.out.println("\nDivisible by 3 : ");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) System.out.print(i + ", ");
        }

        System.out.println("\nDivisible by 5 : ");
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0) System.out.print(i + ", ");
        }
        System.out.println("\nDivisible by both 3 & 5 : ");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) System.out.print(i + ", ");
        }

    }
}
