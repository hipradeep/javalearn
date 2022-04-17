package practice.java42q;

public class Distance {
    //23. Define a class of type Distance that has Feet and Inches as members.
    //-Define a function that adds two Distances passed as argument and returns the sum as another Distance object.
    int Feet;
    int Inch;

    public Distance(int feet, int inch) {
        Feet = feet;
        Inch = inch;
    }

    public static void main(String[] args) {
        Distance dis1 = new Distance(4, 6);
        System.out.println("First distance ");
        System.out.print("Feet : " + dis1.Feet);
        System.out.print(" Inch : " + dis1.Inch);

        Distance dis2 = new Distance(6, 8);
        System.out.println("\nSecond distance ");
        System.out.print("Feet : " + dis2.Feet);
        System.out.print(" Inch : " + dis2.Inch);

        Distance distance = getDistance(dis1, dis2);
        System.out.println("\nTotal distance ");
        System.out.print("Feet : " + distance.Feet);
        System.out.print(" Inch : " + distance.Inch);
    }

    private static Distance getDistance(Distance d1, Distance d2) {
        int in = d1.Inch + d2.Inch;
        int f = 0;
        if (in > 12) {
            f = in / 12;
            in = in % 12;
        }
        int f2 = f + d1.Feet + d2.Feet;
        return new Distance(f2, in);
    }
}