package practice;

public class Box {
    //16.Create class box and box3d. box3d is extended class of box. The above two classes going to pull fill following requirement
    //a)Include constructor.
    //b)set value of length, breadth, height
    //c)Find out area and volume.
    private double l, b;

    public Box(double l, double b) {
        this.l = l;
        this.b = b;

    }
    public void setL(double l) {
        this.l = l;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getL() {
        return l;
    }

    public double getB() {
        return b;
    }
    void area(){
        System.out.println("Area of Box : "+ (l*b));
    }

}

class Box3d extends Box{
    private double h;
    public Box3d(double l, double b, double h) {
        super(l, b);
        this.h=h;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    void volume(){
        System.out.println("Volume of Box3D: "+ (getL()*getB()*h));
    }

    public static void main(String[] args) {
        Box box=new Box(4,6);
        box.area();
        Box3d box3d=new Box3d(6,4 ,2);
        box3d.volume();
    }
}
