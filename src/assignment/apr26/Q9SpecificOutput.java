package assignment.apr26;

public class Q9SpecificOutput {
    public static void main(String[] args) {



        String str1 = "";
        String str2 = "";

        for (int i = 0; i < args.length; i++) {

            if (i == 0) str1 = args[0];
            if (i == 1) str2 = args[1];
        }

        String outputStr=str1+" technology "+ str2;
        System.out.println(outputStr);

    }
}
