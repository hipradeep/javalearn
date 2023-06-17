package practice.test;

public class Hack {

    int hack_mtd(int h1, int h2){
        return h1+h2;
    }
    int hack_mtd(int h1, int h2, int h3){
        return h1+h2+h3;
    }
    void heck_op(){
        System.out.println(hack_mtd(10,10));
    }

    public static void main(String[] args) {
        new Hack().heck_op();
    }
}
