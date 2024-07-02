package dacclass.assignment.mar25SEvaLab1;

public class Q11EvenNumbers {
    //Q 11  print  total of even number between 1300 to 2300

    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1300; i <= 2300; i++) {
            if (i % 2 == 0) sum += i;
        }

        System.out.println("Total of even number between 1300 to 2300 : " + sum);
    }
}
