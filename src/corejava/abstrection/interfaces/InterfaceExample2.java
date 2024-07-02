package corejava.abstrection.interfaces;

import corejava.outer.BigBag;

public class InterfaceExample2 {
    public static void main(String[] args) {
        Red r=new Red();

        int cout = r.cout;

        //accessing default method
        r.defaultMethod();

        BigBag.staticMethod();

        //create reference of Red class in BigBag interface
        BigBag rd=new Red();
        //rd.shape; //- error
        rd.defaultMethod();
    }
}

class Red implements BigBag {

    String shape;

    @Override
    public void interfaceMethod() {

    }
}
