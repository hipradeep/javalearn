import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;

public class Hello {

    public static void main(String[] args) {


//        int n = 9;
//
//        System.out.print( minOperations(n));

//        try{
//            int a=10/0;
//
//        }catch(Exception e){
//            System.out.println("sdal");
//        }


//        HE aa=new HE();
//
//        aa.run();;
//
//        try{
//            Thread.sleep(0);
//        }catch (Exception e){
//          e.printStackTrace();
//        }
//
//        aa.stopRun();

        List list= Arrays.asList(1,2,3,4);
        list.forEach(i-> {

            System.out.println(i);
        });

    }




    static int minOperations(int n)
    {

        // Storing the minimum operations
        // to obtain all numbers up to N
        int dp[] = new int[n + 1];

        // Initilal state
        dp[1] = 0;

        // Iterate for the remaining numbers
        for(int i = 2; i <= n; i++)
        {
            dp[i] = Integer.MAX_VALUE;

            // If the number can be obtained
            // by multiplication by 2
            if (i % 2 == 0)
            {
                int x = dp[i / 2];
                if (x + 1 < dp[i])
                {
                    dp[i] = x + 1;
                }
            }

            // If the number can be obtained
            // by multiplication by 3
            if (i % 3 == 0)
            {
                int x = dp[i / 3];
                if (x + 1 < dp[i])
                {
                    dp[i] = x + 1;
                }
            }

            // Obtaining the number by adding 1
            int x = dp[i - 1];
            if (x + 1 < dp[i])
            {
                dp[i] = x + 1;
            }
        }

        // Return the minm operations
        // to obtain n
        return dp[n];
    }

}



class  HE extends  Thread{
    private volatile boolean aa=true;
    public  void stopRun(){
        aa=false;
    }

    @Override
    public void run() {
        while (aa){
            System.out.println("rin....");
        }
    }
}