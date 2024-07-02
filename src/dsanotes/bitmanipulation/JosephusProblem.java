package dsanotes.bitmanipulation;

public class JosephusProblem {
    public static void main(String[] args) {
        int n=12;
        System.out.println(solution(n));
    }

    private static int solution(int n) {
        int hp=powerOf2(n);
        System.out.println("-- "+hp);
        int l= n - hp;
        return 2*l+1;
    }
    public static  int powerOf2(int n) {
        int i=1;
        while(i*2<=n){
            i*=2;
        }
        return i;
    }
}
