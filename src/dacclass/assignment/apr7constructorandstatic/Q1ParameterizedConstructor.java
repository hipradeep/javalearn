package dacclass.assignment.apr7constructorandstatic;

public class Q1ParameterizedConstructor {
    //Q 1  WAP using parameterized constructor with two parameters id and name. While creating the objects obj1 and obj2
    //passed two arguments so that this constructor gets invoked after creation of obj1 and obj2
    int id;
    String name;

    public Q1ParameterizedConstructor(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static void main(String[] args) {
        Q1ParameterizedConstructor obj1=new Q1ParameterizedConstructor(12, "pradeep");
        Q1ParameterizedConstructor obj2=new Q1ParameterizedConstructor(13, "maurya");
    }
}
