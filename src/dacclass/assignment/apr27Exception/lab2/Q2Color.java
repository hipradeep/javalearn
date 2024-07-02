package dacclass.assignment.apr27Exception.lab2;

public class Q2Color {

void displayColor(char s) throws ColorAlphabetException {

    if (Character.isDigit(s)) throw new ColorAlphabetException();


    switch (s){
        case 'y':
            System.out.println("yellow");
            break;
        case 'r':
            System.out.println("Red");
            break;
        case 'o':
            System.out.println("Orange");
            break;
        case 'g':
            System.out.println("green");
            break;
        case 'b':
            System.out.println("blue");
            break;
        case 'i':
            System.out.println("indigo");
            break;
        case 'v':
            System.out.println("violet");
            break;
        default:
            System.out.println("Not color code");
    }
}


    public static void main(String[] args) {

        Q2Color color=new Q2Color();
        try{
            color.displayColor('y');
        }catch (Exception e){
            System.out.println(e.getMessage());
        }


    }

}

class ColorAlphabetException extends Exception{

    public ColorAlphabetException() {
        super("ColorAlphabetException");
    }
}