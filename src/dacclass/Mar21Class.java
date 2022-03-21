package dacclass;

import java.util.Scanner;

public class Mar21Class {
    public static void main(String[] args) {

        Password password=new Password();
        password.checkPassword();
    }
}


class Password{
    String password;
    int count=0;

    void checkPassword(){
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            password=sc.next();
            count+=1;
            if (password.equals("1234")){
                System.out.println("Password correct");
                break;
            }
        }

        if (count==4) System.out.println("Card Block");
    }



}
