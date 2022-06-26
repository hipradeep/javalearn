package dacclass.april.apr25;

public class LocalClassExample {
    String name;
    int Id;

    public void koyla(){

        class LocalClassA{
            String address;
            void print11() {
                System.out.println("print from local class A");
            }
        }

        LocalClassA a=new LocalClassA();
        a.print11();
    }
    public void gold(){

        class LocalClassB implements LolInterface{
            String address;
            void print12() {
                System.out.println("print from local class B");
            }

            @Override
            public void hi() {
                System.out.println("print from local class B, it is implemented method");
            }
        }

        LocalClassB b=new LocalClassB();
        b.print12();
        b.hi();
    }

    public static void main(String[] args) {
         LocalClassExample localClassExample=new LocalClassExample();
         localClassExample.koyla();
         localClassExample.gold();
    }


}

interface LolInterface{
    public void hi();
}
