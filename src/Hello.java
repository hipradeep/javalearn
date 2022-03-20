public class Hello {
    public static void main(String[] args) {
     fun();
    }

    static void fun(){
        int n=18;
        int flag=0;
        while(n!=0){
            if (n%2==1){
                flag=1;
                break;
            }

            n=n/2;
        }
        if(flag==1){
            System.out.println("No");
        }else System.out.println("yes");

    }
}
