package dsanotes.basic.searching.binarysearch;

public class SmallestLetter {
    public static void main(String[] args) {
        char[] ltr={'c', 'f', 'g'};
        char target='g';
        char c=smallestLetter(ltr, target);
        System.out.println(c);
    }

    private static char smallestLetter(char[] letters, char target) {

        int start=0, end=letters.length-1;
        int  mid = start + (end - start) / 2;

        while(start<=end){
           if(target < letters[mid]){
                end = mid - 1;
            }else {
                start=mid+1;
            }
            mid = start + (end - start) / 2;
        }
        //when while loop is break start=end +1;
        return letters[start % letters.length]; // returning floor
    }
}
