package practice.test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Abc {
    public static void main(String[] args) {
        String[] names = {"Cecilio Johnes", "Cordell Acott", "Curtice Bleue", "Dalis Menary",
                "Emanuele Barstock", "Emmy Bradane", "Gian Cossington", "Jamaal Danilevich"};

        String searchStr = "co";

        int sl = searchStr.length();
        //String[] result =new String[names.length];

        List<String> result = new ArrayList<>();
        int k = 0;
        for (String value : names) {
            String[] name = value.split(" ");

            for (String s : name) {
                if (s.substring(0, sl).equalsIgnoreCase(searchStr)) {
                    //result[k++] = value;
                    result.add(value);
                }
            }
        }

        System.out.println(result);

    }

}

class Bob123 {
    public static void main(String[] args) {

    }

}
class StringTest
{
    public static void main(String[] args)
    {
        String originalString = "Lorem Ipsum is. simply dummy text of the printing is typesetting industry. Lorem Ipsum is been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.";


        String replacedString = replaceMethod(originalString, "is", "");
        System.out.println(replacedString);
    }

    static String replaceMethod(String str, String from, String to)
    {
        String[] arr = str.split(from);
        StringBuilder output = new StringBuilder();

        int i = 0;
        for (; i < arr.length - 1; i++)
            output.append(arr[i]).append(to);

        output.append(arr[i]);
        if (str.substring(str.lastIndexOf(" ")).equalsIgnoreCase(" " + from))
            output.append(to);

        return output.toString();
    }
}


class GFG {

    // Function to find the minimum sum
    public static int findMinRec(int arr[], int i, int sumCalculated, int sumTotal) {

        if (i == 0)
            return Math.abs((sumTotal - sumCalculated) - sumCalculated);


        return Math.min(
                findMinRec(arr, i - 1, sumCalculated + arr[i - 1],  sumTotal),
                findMinRec(arr, i - 1, sumCalculated, sumTotal));
    }


    public static int findMin(int arr[], int n) {
        // Compute total sum of elements
        int sumTotal = 0;
        for (int i = 0; i < n; i++)
            sumTotal += arr[i];

        // Compute result using recursive function
        return findMinRec(arr, n, 0, sumTotal);
    }

    /* Driver program to test above function */
    public static void main(String[] args) {
        int arr[] = {3, 1, 4, 2, 2, 1};
        int n = arr.length;
        System.out.print("The minimum difference"
                + " between two sets is "
                + findMin(arr, n));
    }
}

// This code is contributed by Arnav Kr. Mandal.
