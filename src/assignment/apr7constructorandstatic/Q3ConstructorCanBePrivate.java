package assignment.apr7constructorandstatic;

public class Q3ConstructorCanBePrivate {
    //Q 3 Can we declare class constructor as private
    int id;

    private Q3ConstructorCanBePrivate(int id) {
        this.id = id;
    }

    public static void main(String[] args) {

        //Yes, we can declare a constructor as private. If we declare a constructor
        // as private we are not able to create an
        // object of a class. We can use this private constructor in the Singleton Design Pattern.

        Q3ConstructorCanBePrivate obj=new Q3ConstructorCanBePrivate(12);

       // Alpha alpha=new Alpha(12);  //'Alpha(int)' has private access in 'Alpha'
    }
}
class Alpha{
    int x;

    private Alpha(int x) {
        this.x = x;
    }
}
