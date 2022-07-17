import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;

public class Hello {

    public static void main(String[] args) {


        int f = f(1);
        System.out.println(f);

    }
       static int  f(int n){
         int i = 1;
        if(n >= 5)
            return n;
        n = n + i;
        i++;
        return(f(n));
    }
}

class H{

}

