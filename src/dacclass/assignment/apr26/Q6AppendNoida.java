package dacclass.assignment.apr26;

import java.util.Scanner;

public class Q6AppendNoida {

    public static void main(String[] args) {
        System.out.print("Enter a String : ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        System.out.println(appendNoida(input));
    }

    private static String appendNoida(String input) {
        return input+" noida";
    }
}
