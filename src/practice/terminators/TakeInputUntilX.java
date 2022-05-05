package practice.terminators;

import java.util.Scanner;

public class TakeInputUntilX {
    public static void main(String[] args) {
        int flag=1;
        int sum=0;
        do{
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter number : ");
            String str=sc.next();
            System.out.println("You entered : "+str);
             if (!checkNumber(str)){
                 if (str.equals("x") || str.equals("X") ){
                     flag=0;
                     System.out.println("finished!");
                 } else
                     System.out.println("Not a number");
             }else{
                 if ( Integer.parseInt(str)==0 ){
                     flag=0;
                     System.out.println("finished!");
                 }
                 int i=Integer.parseInt(str);
                 sum+=i;
             }
        }while (flag!=0);
        System.out.println(sum);
    }

    private static boolean checkNumber(String str) {
        try {
            int i=Integer.parseInt(str);
        }catch (Exception e){
            return false;
        }
        return true;
    }
}
