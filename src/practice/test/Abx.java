package practice.test;

public class Abx extends Sch.std{
    public void marks(){
        i=1;
    }
    public static void main(String a[]) {
        Sch.std st = new Abx();
        st.marks();
        Sch.display();
    }

}
abstract class Sch{
    abstract static class std{
        static int i =0;
        public void marks(){

        };
    }

    static void display(){
        System.out.println(Sch.std.i);
    }
}
