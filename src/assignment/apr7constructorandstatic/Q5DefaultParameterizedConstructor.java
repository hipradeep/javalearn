package assignment.apr7constructorandstatic;

public class Q5DefaultParameterizedConstructor {
    //Q 5 Can we have both Default Constructor and Parameterized Constructor in the same class?

    int id;

    //default constructor
    public Q5DefaultParameterizedConstructor() {
    }

    //Parameterized Constructor
    public Q5DefaultParameterizedConstructor(int id) {
        this.id = id;
    }

    public static void main(String[] args) {
        System.out.println("Yes, we can hava both Default Constructor and Parameterized Constructor in the same class");
    }
}
