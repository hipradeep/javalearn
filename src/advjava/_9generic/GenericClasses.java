package advjava._9generic;

public class GenericClasses {
    public static void main(String[] args) {

        MyGen<Integer> myGen=new MyGen<>();
        myGen.add(45);
        System.out.println(myGen.get());

        MySimple mySimple=new MySimple();
        mySimple.add(5);
        System.out.println(mySimple.get());
    }
}

class MySimple {
    int n;

    void add(int n) {
        this.n = n;
    }

    int get() {
        return n;
    }
}


class MyGen<T> {
    T obj;

    void add(T obj) {
        this.obj = obj;
    }

    T get() {
        return obj;
    }
}