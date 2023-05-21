package leetcode.blind;

public class CanPlaceFlowers {
    public static void main(String[] args) {
        //int[] f={1,0,0,0,0,1};
        int[] f={1,0,0,0,1};
        int n=1;
        System.out.println(canPlaceFlowers(f,n));
    }
    private static boolean canPlaceFlowers(int[] f, int n) {
        if (n == 0)
            return true;
        int c=0;
        for(int i=0; i<f.length-1; i++){
            if(i%2==0){
                if( f[i]==1 && f[i+1] ==1){

                }else{
                    c++;
                }
            }


        }

//        for (int i = 0; i < flowerbed.length; ++i)
//            if (flowerbed[i] == 0 && (i == 0 || flowerbed[i - 1] == 0) &&
//                    (i == flowerbed.length - 1 || flowerbed[i + 1] == 0)) {
//                flowerbed[i] = 1;
//                if (--n == 0)
//                    return true;
//            }


        return c==n;
    }
}
