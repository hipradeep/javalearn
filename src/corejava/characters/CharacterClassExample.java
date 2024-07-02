package corejava.characters;

public class CharacterClassExample {

    public static void main(String[] args) {

        System.out.println(Character.isLetter('A'));

        System.out.println(Character.isLetter('0'));

        System.out.println(Character.isDigit('A'));
        System.out.println(Character.isDigit('0'));

        System.out.println(Character.isWhitespace('A'));
        System.out.println(Character.isWhitespace(' '));
        System.out.println(Character.isWhitespace('\n'));
        System.out.println(Character.isWhitespace('\t'));

        // ASCII value of tab
        System.out.println(Character.isWhitespace(9));

        System.out.println(Character.isWhitespace('9'));

        System.out.println(Character.isUpperCase('A'));
        System.out.println(Character.isUpperCase('a'));
        System.out.println(Character.isUpperCase(65));

        System.out.println(Character.isLowerCase('A'));
        System.out.println(Character.isLowerCase('a'));
        System.out.println(Character.isLowerCase(97));

        System.out.println(Character.toUpperCase('a'));
        System.out.println(Character.toUpperCase(97));
        System.out.println(Character.toUpperCase(48));

        System.out.println(Character.toLowerCase('A'));
        System.out.println(Character.toLowerCase(65));
        System.out.println(Character.toLowerCase(48));

        System.out.println(Character.toString('x'));
        System.out.println(Character.toString('Y'));

    }

}
