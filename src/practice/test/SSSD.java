package practice.test;

public class SSSD extends SSB{
    void spi(){
        System.out.println("dd");
    }

    public static void main(String[] args) {
        SSB nn= new SSSD();
        nn.spi();
    }


}

class SSB{
    void spi(){
        System.out.println("JI");
    }
}