package corejava.nestedclass;

public class NestedClassExample {

    //simple inner class
    class InnerClass {

        void innerClassMethod() {
            System.out.println("im from inner class");
        }
    }

    public static void main(String[] args) {
        NestedClassExample nestedClassExample = new NestedClassExample();

      //  NestedClassExample.InnerClass innerClass=new NestedClassExample.InnerClass();

    }


}
