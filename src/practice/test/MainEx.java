package practice.test;

public class MainEx {

    public static void main(String[] args) {

        int p = 100;

        SystemEx.out.printx(p);

//        SystemEx systemEx=new SystemEx();
//        systemEx.out.printx();


        ScannerEx scannerEx = new ScannerEx(SystemEx.in);

        int pp = scannerEx.nextInput();

        System.out.println(pp);


    }
}


class SystemEx {
    public static PrintStreamOutEx out = new PrintStreamOutEx();

    public static PrintStreamInEx in = new PrintStreamInEx();
}


class ScannerEx {

    int scannerInput;

    public ScannerEx(PrintStreamInEx in) {
        scannerInput = in.takeInput();
    }

    int nextInput() {
        return scannerInput;
    }
}


class PrintStreamOutEx {

    public void printx(int consoleInput) {
        System.out.println(consoleInput + "");
    }

}

class PrintStreamInEx {
    int consoleInput = 133;

    public int takeInput() {
        return consoleInput;
    }

}
