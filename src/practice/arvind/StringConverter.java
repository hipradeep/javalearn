package practice.arvind;

public class StringConverter {
    public static void main(String[] args) {
        String input = "ThisIsAnExampleString";
        String output = addHyphenAndConvertToLowercase(input);
        System.out.println(output);
    }

    public static String addHyphenAndConvertToLowercase(String input) {
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (Character.isUpperCase(currentChar) && i > 0) {
                output.append('-');
            }
            output.append(Character.toLowerCase(currentChar));
        }
        return output.toString();
    }
}
