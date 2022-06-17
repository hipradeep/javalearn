package basicjava.accessodifiers;

//top level classes
public class Alpha {
    public static void main(String[] args) {
        //access within package
        Bio bio = new Bio();
        //default member
        String name = bio.name;
        //private member
        //int age = bio.age;
        //public member
        int roll = bio.roll;
        //protected member
        int pin = bio.pin;
        System.out.println(name);
    }

}
