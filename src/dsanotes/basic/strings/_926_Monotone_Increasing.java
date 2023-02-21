package dsanotes.basic.strings;

public class _926_Monotone_Increasing {
    public static void main(String[] args) {
        String str="00110";

       // System.out.println(minFlipsMonoIncr(str));
        System.out.println(addDigits(38));
    }

    private static int minFlips(String str) {
        int ans =0;
        int count1 = (int)str.chars().filter(ch -> ch == '1').count();
        int count0=str.length()-count1;
        int flip=0;
        ans=count0;
        for (char x: str.toCharArray() ) {
            if(x=='1'){
                flip++;
                count1--;
            }
            ans=Math.min(ans, flip + (str.length()-count1));
        }

        return ans;
    }

    public  static int minFlipsMonoIncr(String s) {
        int flips = 0;
        int ones = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0') {
                if (ones == 0) continue;
                else {
                    flips++;
                }
            } else {
                ones++;
            }

            if (flips > ones) {
                flips = ones;
            }
        }
        return flips;
    }

    public static int addDigits(int num) {

        int sum=0;
        int n=num;
        int s=0;
        while(true){

            while(n<0){
                int r=n%10;
                s+=r;
                n=n/10;
            }
            System.out.print(s);
            n=s;
            if(s>10) break;
        }

        return s;
    }
}
