package practice;

public class PolyExample {

    //13.Write a program to create a class named shape. In this classwe have three sub classes circle,
    // triangle and square eachclasshas two member function
    //named draw () and erase (). Create these using polymorphismconcepts.
    public static void main(String[] args) {
        Circle circle=new Circle();
        circle.draw();
        circle.erase();
        Triangle triangle=new Triangle();
        triangle.draw();
        triangle.erase();
        Square square=new Square();
        square.draw();
        square.erase();
    }
}

class Shape {
    void draw() {
        System.out.println("Shape draw()");
    }

    void erase() {
        System.out.println("Shape erase()");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("Circle draw()");
    }

    void erase() {
        System.out.println("Circle erase()");
    }
}

class Triangle extends Shape {
    void draw() {
        System.out.println("Triangle erase()");
    }
}

class Square extends Shape {
    void draw() {
        System.out.println("Square draw()");
    }

    void erase() {
        System.out.println("Square erase()");
    }
}