package dsanotes.basic.arrays;

public class MergeTwoArrays {
    public static void main(String[] args) {
        int[] a={1,4,5,7,11,19};
        int[] b={2, 6,8,12,17,20,25,30};
        int m=a.length;
        int n=b.length;
        int[] c=new int[m+n];
        int i=0, j=0, k=0;

        while(i< m && j<n){
            if(a[i]<b[j])
                c[k++]=a[i++];
            else c[k++]=b[j++];
        }

        for(;i<=m; i++){
            c[k++]=a[i++];
        }
    }
}
