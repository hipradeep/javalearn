package corejava.nestedclass;

public class NestedClassExample {

    //simple inner class
    class InnerClass {
        void innerClassMethod() {
            System.out.println("im from inner class");
        }
    }


    //static inner class
    static class InnerStaticClass {
        void innerStaticClassMethod() {
            System.out.println("innerStaticClassMethod");
        }
    }

    public static void main(String[] args) {
        //NestedClassExample nestedClassExample = new NestedClassExample();
        NestedClassExample.InnerClass innerClass=  new NestedClassExample().new InnerClass();
        innerClass.innerClassMethod();

        //nested static inner class
        NestedClassExample.InnerStaticClass innerStaticClass = new NestedClassExample.InnerStaticClass();
        innerStaticClass.innerStaticClassMethod();

        Alpha alpha=new Alpha();
        alpha.methodX();
        alpha.methodY();
        alpha.methodZ();

    }

}


class Alpha{

    public void methodX(){
        //inner class
        class  Beta{
            public void printX(){
                System.out.println("printX");
            }
        }

        new Beta().printX();
    }

    public void methodY(){
        //anonymous class
       Gama g= new Gama(){
            @Override
            public void pontiff() {
                System.out.println("pontiff");
            }
        };

        g.pontiff();
    }

    public void methodZ(){
        //anonymous class
        Theta t=new Theta() {
            @Override
            void retrofit() {
                System.out.println("retrofit");
            }
        };
        t.retrofit();
    }
}



interface Gama{
    void pontiff();
}

abstract class Theta{
    abstract void retrofit();
}