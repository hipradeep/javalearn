package practice.strings50;

import java.util.HashMap;

public class MaximumOccuringCharacter {

    public static void main(String[] args) {
        String str = "sample string";
        System.out.println("Max occurring character is " + getMaxOccurringChar(str));
    }

    public static char getMaxOccurringChar(String line) {

        int[] count = new int[256];


        for (int i = 0; i < line.length(); i++) {
            count[line.charAt(i)]++;
        }

        int max = -1;
        char result = ' ';

        for (int k = 0; k < line.length(); k++) {
            if (max < count[line.charAt(k)]) {
                max = count[line.charAt(k)];
                result = line.charAt(k);
            }
        }


        return result;
    }
}
