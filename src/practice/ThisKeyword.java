package practice;

public class ThisKeyword {
    //18.Write a program to give the example for ‘this’ operator. Andalso use the ‘this’ keyword as return statement.
    public static void main(String[] args) {
        XYZ xyz=new XYZ(4,6);
        xyz=xyz.newObj();
        xyz.display();
    }

}
class XYZ{
    int a, b;

    public XYZ(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public XYZ newObj(){

        return this;
    }
    void display(){
        System.out.println("a : "+a);
        System.out.println("b : "+b);
    }
}
