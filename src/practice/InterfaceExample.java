package practice;

public class InterfaceExample {
}

class ToTestInt{
    public static void main(String[] args) {
        Arithmetic arithmetic=new Arithmetic();
     int s=   arithmetic.square(5);
        System.out.println(s);
    }
}

interface test{
    public int square(int a);
}
class Arithmetic implements test {

    @Override
    public int square(int a) {
        return a*a;
    }
}