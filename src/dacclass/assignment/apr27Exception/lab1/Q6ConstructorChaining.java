package dacclass.assignment.apr27Exception.lab1;

public class Q6ConstructorChaining {

    int x;

    public Q6ConstructorChaining() {
        this(5);
        System.out.println("Not parameterize constructor");
    }
    public Q6ConstructorChaining(int p) {
        this(p, 4);
        x=p;
        System.out.println("single parameterize constructor");
    }
    public Q6ConstructorChaining(int p, int q) {
        System.out.println("double parameterize constructor");
    }

    public static void main(String[] args) {
        Q6ConstructorChaining obj=new Q6ConstructorChaining();
        System.out.println(obj.x);

    }
}
