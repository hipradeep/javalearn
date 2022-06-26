package dacclass.april.apr25;

public class AnonymousClassExa {



    public static void main(String[] a){

        //Anonymous Class
        new Parrot(){
            @Override
            public void method() {
                System.out.println("Parrot ");
                System.out.println("Parrot ");
            }
        }.method();

    }


}


interface Parrot{

    void method();
}