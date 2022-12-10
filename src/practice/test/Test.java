package practice.test;

public class Test {
    public static void main(String[] args) {
        String foo = args[1];
        String bar = args[2];
        String baz = args[3];
        System.out.println("Baz = " + bar);

    }
}

class X {
    public static void main(String[] args) {

        String name[] = new String[5];
        for (int x = 0; x < args.length; x++) {
            name[x] = args[x];
        }
        System.out.println(name[2]);

    }
}

//dataType[][] arrayRefVar; (or)
//dataType [][]arrayRefVar; (or)
//dataType arrayRefVar[][]; (or)
//dataType []arrayRefVar[];

class GO {
    public static void main(String[] args) {
        switch ('B') {
            case 'A':
                System.out.println("A");
            case 'B':
                System.out.println("B");
            case 'C':
                System.out.println("C");
                break;
            case 'D':
                System.out.println("D");
            default:
                System.out.println("F");
        }
    }

}