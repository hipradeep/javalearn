package practice.java42q;

public class CmdArgumentsInt {
    //19.write a program To find the sum of command line argumentsand count the invalid integers entered.

    public static void main(String[] args) {
        int sum=0;
        int countInvalid=0;
        for(String str: args) {

            try{
               sum =sum+ Integer.parseInt(str);
            }catch (Exception e){
                countInvalid=countInvalid+1;
            }
        }
        System.out.println("sum of args int is "+sum);
        System.out.println("invalid int args is "+countInvalid);

    }
}
