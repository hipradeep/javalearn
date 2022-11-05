import java.util.*;

public class Hello {

//    public static void main(String[] args) {
//
//
////        int n = 9;
////
////        System.out.print( minOperations(n));
//
////        try{
////            int a=10/0;
////
////        }catch(Exception e){
////            System.out.println("sdal");
////        }
//
//
////        HE aa=new HE();
////
////        aa.run();;
////
////        try{
////            Thread.sleep(0);
////        }catch (Exception e){
////          e.printStackTrace();
////        }
////
////        aa.stopRun();
//
//        List list = Arrays.asList(1, 2, 3, 4);
//        list.forEach(i -> {
//
//            System.out.println(i);
//        });
//
//    }


    static int minOperations(int n) {

        // Storing the minimum operations
        // to obtain all numbers up to N
        int dp[] = new int[n + 1];

        // Initilal state
        dp[1] = 0;

        // Iterate for the remaining numbers
        for (int i = 2; i <= n; i++) {
            dp[i] = Integer.MAX_VALUE;

            // If the number can be obtained
            // by multiplication by 2
            if (i % 2 == 0) {
                int x = dp[i / 2];
                if (x + 1 < dp[i]) {
                    dp[i] = x + 1;
                }
            }

            // If the number can be obtained
            // by multiplication by 3
            if (i % 3 == 0) {
                int x = dp[i / 3];
                if (x + 1 < dp[i]) {
                    dp[i] = x + 1;
                }
            }

            // Obtaining the number by adding 1
            int x = dp[i - 1];
            if (x + 1 < dp[i]) {
                dp[i] = x + 1;
            }
        }

        // Return the minm operations
        // to obtain n
        return dp[n];
    }

}

class YTY{
    public static void main(String[] args) {

    }
}
class CVFT{
    public static void main(String[] args) {
        int[] p = { 1,3,2};
        System.out.println(solution(p));
    }

    private static int solution(int[] a) {

        int count = 0;

        if(a.length==1){
            return 0;
        }
        for (int i = 0; i < a.length; i++) {

            if (i == 0) {
                if ((float) a[i] == (a[i + 1] / 2f)) {
                    count++;
                }

            }

            if (i == a.length - 1) {
                if ((float) a[i] ==( a[i - 1] / 2f)) {
                    count++;
                }
            }

            if (i >= 1 && i < a.length - 1)
                if ((float) a[i] == ((a[i - 1] + a[i + 1]) / 2f)) {
                    count++;
                }
        }

        return count;

    }
}

//class Boka{
//    public static void main(String[] args) {
//        String [] arr = {"Daisy", "Rose", "Poppy"};
//
//        System.out.println(solution(arr));
//    }
//
//    private static String solution(String[] arr) {
//        String str="";
//        int i=0;
//        while(true){
//
//            for (int j = 0; j < arr.length; j++) {
//                str=str+arr[0].substring(i, 1);
//            }
//
//
//            i++;
//
//            if (i> arr[])
//        }
//        return str;
//    }
//}


class BoardWord3{
    public static void main(String[] args) {

        char[][] board = {

                {'s', 'o', 's', 'o'},

                {'s', 'o', 'o', 's'},

                {'s', 's', 's', 's'}

        };
      //  System.out.println(check(board, "sos"));
    }
}

class BoardWord2 {
    public static void main(String[] args) {

        char[][] board = {

                {'s', 'o', 's', 'o'},

                {'s', 'o', 'o', 's'},

                {'s', 's', 's', 's'}

        };
        System.out.println(exist(board, "sos"));

    }

    public static boolean exist(char[][] board, String word) {
        if (board.length == 0) {
            return false;
        }
        if (board.length * board[0].length < word.length()) {
            return false;
        }

        int rows = board.length;
        int columns = board[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                boolean[][] mem = new boolean[rows][columns];
                if (exist(i, j, board, mem, word, 0))
                    return true;
            }
        }
        return false;
    }

    public static boolean exist(int x, int y, char[][] board, boolean[][] visited, String word, int charIndex) {
        if (word.length() == charIndex)
            return true;
        if (x < 0 || y < 0 || x >= board.length || y >= board[0].length)
            return false;
        if (visited[x][y])
            return false;
        char currentChar = word.charAt(charIndex);
        if (board[x][y] != currentChar)
            return false;
        visited[x][y] = true;
        boolean result = exist(x - 1, y, board, visited, word, charIndex + 1) ||
                exist(x + 1, y, board, visited, word, charIndex + 1) ||
                exist(x, y - 1, board, visited, word, charIndex + 1) ||
                exist(x, y + 1, board, visited, word, charIndex + 1);
        if (result == false)
            visited[x][y] = false;

        return result;
    }
}

class BoardWord {
    public static void main(String[] args) {

        char[][] board = {

                {'s', 'o', 's', 'o'},

                {'s', 'o', 'o', 's'},

                {'s', 's', 's', 's'}

        };
        System.out.println(filterBoard(board, "sos"));

    }

    static int filterBoard(char[][] board, String word) {
        int matches = 0;


        for (int i = 0; i < board.length; i++) {

            for (int j = 0; j < board[i].length; j++) {

                List<String> h = new ArrayList<>();
                List<String> v = new ArrayList<>();
                List<String> d = new ArrayList<>();

                for (int letterWord = 0; letterWord < word.length(); letterWord++) {

                    if ((i + letterWord) < board[i].length)
                        if (board[i] != null && board[i][j + letterWord] != 0) {

                            h.add(String.valueOf(board[i][j + letterWord])); // run through the array horizontally

                        }

                    if ((i + letterWord) < board[i].length)
                        if (board[i + letterWord] != null && board[i + letterWord][j] != 0) {

                            v.add(String.valueOf(board[i + letterWord][j])); // run through the array vertically

                        }

                    if ((i + letterWord) < board[i].length)
                        if (board[i + letterWord] != null && board[i + letterWord][j + letterWord] != 0) {

                            d.add(String.valueOf(board[i + letterWord][j + letterWord])); // run through the array diagonally

                        }

                }


                StringBuilder str = new StringBuilder();
                for (String s : h) {
                    str.append(s);// join the found letters into a word
                    if (str.toString().equalsIgnoreCase(word)) { // check if the formed word matches with the word parameter
                        matches++; // add into the matches
                    }
                }
                for (String s : h) {
                    str.append(s);// join the found letters into a word
                    if (str.toString().equalsIgnoreCase(word)) { // check if the formed word matches with the word parameter
                        matches++; // add into the matches
                    }
                }
                for (String s : h) {
                    str.append(s);// join the found letters into a word
                    if (str.toString().equalsIgnoreCase(word)) { // check if the formed word matches with the word parameter
                        matches++; // add into the matches
                    }
                }


            }
        }

        return matches;
    }
}

class InputStringPla {
    public static void main(String[] args) {

        System.out.println(noOfAppends("abbb"));

    }

    static boolean isPalindrome(char[] str) {
        int len = str.length;

        // single character is always palindrome
        if (len == 1)
            return true;

        // pointing to first character
        int ptr1 = 0;

        // pointing to last character
        int ptr2 = len - 1;

        while (ptr2 >= ptr1) {
            if (str[ptr1] != str[ptr2])
                return false;
            ptr1++;
            ptr2--;
        }

        return true;
    }

    // Recursive function to count number of appends
    static int noOfAppends(String s) {
        if (isPalindrome(s.toCharArray()))
            return 0;

        // Removing first character of string by
        // incrementing base address pointer.
        s = s.substring(1);

        return 1 + noOfAppends(s);
    }

}


class CountOccurence {
    public static void main(String[] args) {
        int[] nums = {25, 2, 357, 38, 41};


        System.out.println(Arrays.toString(countOccurance(nums)));

    }

    public static int[] countOccurance(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();


        for (int i = 0; i < nums.length; i++) {

            while (nums[i] > 0) {
                int x = nums[i] % 10;
                int p = map.get(x) != null ? map.get(x) : 0;
                p++;
                map.put(x, p);

                nums[i] = nums[i] / 10;
            }
        }

        List<Integer> list = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1)
                list.add(entry.getKey());
        }

        int[] ans = new int[list.size()];
        int k = 0;
        for (Integer x : list)
            ans[k++] = x;


        return ans;
    }


}


class Abcpp {
    public static void main(String[] args) {
        int[] nums = {1, 7, 4, 5, 6, 3, 2};
        int k = 7;

        System.out.println(number(nums, k, 3));

    }

    public static int number(int[] arr, int k, int c) {
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int i = 0;
        int answer = 0;

        while (i < c - 1) {

            if (arr[i] < k)
                answer++;

            i++;
        }
        return answer;
    }


}

class CheckStringArray {
    public static void main(String[] args) {
        String[] str1 = {"ab", "c"};
        String[] str2 = {"a", "bc"};

        System.out.println(arrayStringsAreEqual(str1, str2));

    }

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        int i1, i2;
        return false;
    }

    public static boolean arrayStringsAreEqual2(String[] word1, String[] word2) {
        int idx1 = 0, idx2 = 0, arrIdx1 = 0, arrIdx2 = 0;
        while (arrIdx1 < word1.length && arrIdx2 < word2.length) {
            if (word1[arrIdx1].charAt(idx1) != word2[arrIdx2].charAt(idx2)) return false;
            if (idx1 == word1[arrIdx1].length() - 1) {
                idx1 = 0;
                arrIdx1++;
            } else idx1++;
            if (idx2 == word2[arrIdx2].length() - 1) {
                idx2 = 0;
                arrIdx2++;
            } else idx2++;
        }
        return arrIdx1 == word1.length && arrIdx2 == word2.length;
    }
}

class CheckDuplicateChar {
    public static void main(String[] args) {
        String[] arr = {"un", "iq", "ue"};
        for (String s : arr) {
            System.out.println(isUnique(s));

        }

    }

    public static boolean isUnique(String str) {
        Set<String> set = new HashSet<>();
        for (char c : str.toCharArray()) {
            if (set.contains(c)) {
                return false;
            }
            set.add(String.valueOf(c));
        }
        return true;
    }
}

class MissingNumber {
    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 4};

        int[] ans = findErrorNums(nums);
        System.out.println(Arrays.toString(ans));

    }

    public static int[] findErrorNums(int[] nuns) {
        int[] arr = new int[nuns.length];
        int[] result = new int[2];
        for (int i : nuns) {
            arr[i - 1]++;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2)
                result[0] = i + 1;

            if (arr[i] == 0)
                result[1] = i + 1;
        }
        return result;
    }

    public static int[] findErrorNums0(int[] nums) {
        int[] res = new int[2];
        for (int i : nums) {
            if (nums[Math.abs(i) - 1] < 0) res[0] = Math.abs(i);
            else nums[Math.abs(i) - 1] *= -1;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) res[1] = i + 1;
        }
        return res;
    }

    public static int[] findErrorNums2(int[] nums) {

        int[] result = new int[2];

        HashSet<Integer> set = new HashSet();

        for (int i = 0; i < nums.length; i++) {
            if (!set.add(nums[i])) {
                result[0] = nums[i];

            }
        }
        for (int j = 1; j <= set.size(); j++) {
            if (!set.contains(j))
                result[1] = j;
        }

        return result;

    }
}

class MinimumOperations {
    public static void main(String[] args) {
        //int[] nums={1,5,0,3,5};
        int[] nums = {1};
        System.out.println(minimumOperations(nums));

    }

    public static int minimumOperations(int[] nums) {
        int x = getX(nums);
        int count = 0;

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != 0) {
                for (int i = j; i < nums.length; i++) {
                    nums[i] = nums[i] - x;
                }
                count++;
                x = getX(nums);
            }
        }
        System.out.println(count);

        return count;
    }

    private static int getX(int[] nums) {
        Arrays.sort(nums);
        int x = 0;
        for (int num : nums) {
            if (num != 0) {
                x = num;
                break;
            }
        }
        return x;
    }
}

class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = {1, 0, 1, 1};
        //int[] nums = {1,2,3,1,2,3};
        //int[] nums = {1,2,3,1};
        boolean b = containsNearbyDuplicate2(nums, 1);


        System.out.println(b);
    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j])
                    if (Math.abs(i - j) <= k) return true;
            }

        }
        return false;

    }

    public static boolean containsNearbyDuplicate2(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                int j = map.get(nums[i]);
                if (Math.abs(i - j) >= k) {
                    return true;
                }
            }
            map.put(nums[i], i);

        }

        return false;

    }
}

class SquareOrCube {
    public static void main(String[] args) {

    }

    static int SquareOrCube(int c, int num) {
        if (c == 1) {
            return num * num;
        } else if (c == 2) return num * num * num;

        return -1;
    }

    static int MinSizeOfMemory(int[] arr) {
        if (arr.length == 0) return -1;
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum = sum + arr[i];
        }

        return sum;
    }

}

class KSmallestLargest {
    public static void main(String[] args) {

        List<Integer> arr = Arrays.asList(10, 20, 31, 5, 15, 12, 45);

        int[] arr1 = new int[]{10, 20, 31, 5, 15, 12, 45};

        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));
        System.out.println(multOfKSmallestLargest(arr1, 2, 2));
    }

    private static int multOfKSmallestLargest(int[] arr, int s, int l) {
        return findKthSmallestBySorting(arr, s) * findKthLargestBySorting(arr, l);

    }

    public static int findKthLargestBySorting(int[] arr, int k) {
        Arrays.sort(arr);
        int targetIndex = arr.length - k;
        return arr[targetIndex];
    }

    public static int findKthSmallestBySorting(int[] arr, int m) {
        Arrays.sort(arr);
        int smallestIndex = m - 1;
        return arr[smallestIndex];
    }

//    private static long multOfKSmallestLargest(List<Integer> arr) {
//        Collections.sort(arr);
//        int n=arr.size();
//        LinkedHashSet<Integer> uniqueItems = new LinkedHashSet<Integer>(arr);
//        List<Integer> result = new ArrayList<>(uniqueItems);
//
//        Integer kSmallest=result.get()
//    }
}

class DivisorX {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(4);
        arr.add(10);
        arr.add(16);
        arr.add(25);
        arr.add(100);

        System.out.println(common_divisor(arr));

    }

    private static long gcd(long a, long b) {
        while (b > 0) {
            long temp = b;
            b = a % b; // % is remainder
            a = temp;
        }
        return a;
    }

    private static int common_divisor(List<Integer> input) {
        long result = input.get(0);
        for (int i = 1; i < input.size(); i++) result = gcd(result, input.get(i));
        return (int) result;
    }

}

class PalindromeX {
    public static void main(String[] args) {
        String str1 = "abcdezz",
                str2 = "rtueedty";


        System.out.println(check(str1, str2));

    }

    public static int check(String str1,
                            String str2) {

        // Boolean array to mark
        // presence of characters
        boolean[] mark = new boolean[26];
        Arrays.fill(mark, false);

        int n = str1.length(),
                m = str2.length();

        for (int i = 0; i < n; i++) {
            mark[str1.charAt(i) - 'a'] = true;
        }

        // Check if any of the character
        // of str2 is already marked
        int result = -1;
        for (int i = 0; i < m; i++) {

            // If a common character
            // is found
            if (mark[str2.charAt(i) - 'a']) result++;

        }

        // If no common character
        // is found
        return result;
    }


}

class HE extends Thread {
    private volatile boolean aa = true;

    public void stopRun() {
        aa = false;
    }

    @Override
    public void run() {
        while (aa) {
            System.out.println("rin....");
        }
    }
}

class Abc implements Runnable {

    public static void main(String[] args) throws Exception {

        Thread t = new Thread(new Abc());
        t.run();
        t.run();
        t.start();


    }

    @Override
    public void run() {
        System.out.println("a");
    }
}

class BCX {
    public static void main(String[] args) {
        int S = 56, T1 = 4, T2 = 7;
        System.out.println("The speed of boat in still water = " + SpeedOfBoat(S, T1, T2) + " km/ hr ");
    }

    static int SpeedOfBoat(int d, int T1, int T2) {
        int dSpeed = d / T1;
        int uSpeed = d / T2;
        return (dSpeed + uSpeed) / 2;
    }
}

class SCS {
    public static void main(String[] args) {


    }

    public static int findLargest(int N, int[] A, int x, int y) {
        int result = -404;
        int xHighsst = findKthLargestBySorting(A, x);
        int yHighsst = findKthLargestBySorting(A, y);

        result = xHighsst - yHighsst;
        return result;
    }

    public static int findKthLargestBySorting(int[] arr, int k) {
        Arrays.sort(arr);
        int targetIndex = arr.length - k;
        return arr[targetIndex];
    }

}

class Robo {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(1);
        arr.add(2);
        arr.add(2);
        arr.add(2);
        List<Integer> ans = RemoveDuplicates(arr);
        for (int b : ans) {
            System.out.println(b);
        }
    }

    public static List<Integer> RemoveDuplicates(List<Integer> arr) {
        Collections.sort(arr);
        LinkedHashSet<Integer> set = new LinkedHashSet<Integer>(arr);
        List<Integer> result = new ArrayList<>(set);
        return result;

    }


}

class Robo2 {
    public static void main(String[] args) {
        String str = "Pneumonoultramicroscopicsilicovolcanoconiosis"; //lung disease
//function calling
        getOccuringChar(str);
    }

    static final int MAX_CHAR = 256;

    static void getOccuringChar(String str) {
//creating an array of size 256 (ASCII_SIZE)
        int count[] = new int[MAX_CHAR];
//finds the length of the string
        int len = str.length();
//initialize count array index
        for (int i = 0; i < len; i++)
            count[str.charAt(i)]++;
//create an array of given String size
        char ch[] = new char[str.length()];
        for (int i = 0; i < len; i++) {
            ch[i] = str.charAt(i);
            int find = 0;
            for (int j = 0; j <= i; j++) {
//if any matches found
                if (str.charAt(i) == ch[j])
                    find++;
            }
            if (find == 1)
//prints occurrence of the character
                System.out.println("The occurrence of " + str.charAt(i) + " is: " + count[str.charAt(i)]);
        }
    }
}