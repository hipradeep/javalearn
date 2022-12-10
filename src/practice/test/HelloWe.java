package practice.test;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HelloWe {

    public static void main(String[] args) {

        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements: ");
        n = sc.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("Elements are: ");
        for (int i = 0; i < n; i++) {
            //System.out.print(array[i] + "\t");
            System.out.println(array[i]);
        }

        // Scanner mode = new Scanner(System.in);
        //  System.out.println(sc.toString());
        System.out.println("Choose sorting mode: ");
        //String path="";
        String hit = sc.next();
        System.out.println("Your selection: " + hit);

        Arrays.sort(array);
        if (hit.equalsIgnoreCase("asc")) {
            System.out.println("\nAscending series is: ");
            for (int i = 0; i < n; i++) {
                System.out.print(array[i] + "\t");
            }
        } else if (hit.equalsIgnoreCase("desc")) {
            System.out.println("\nDescending series is: ");
            for (int i = n - 1; i >= 0; i--) {
                System.out.print(array[i] + "\t");
            }
        }

        //diffTime();
        // fun();
    }

    private static void diffTime() {
        Time t1 = new Time();
        t1.input();
        ;
        t1.print();

        Time t2 = new Time();
        t2.input();
        t2.print();

        long totalSec1 = t1.h * 60 * 60 + t1.m * 60 + t1.s;
        long totalSec2 = t2.h * 60 * 60 + t2.m * 60 + t2.s;

        long diffSec;
        if (totalSec1 > totalSec2)
            diffSec = totalSec1 - totalSec2;
        else diffSec = totalSec2 - totalSec1;

        // convert
        int h = (int) (diffSec / 3600);
        int m = (int) ((diffSec % 3600) / 60);
        int s = (int) ((diffSec % 3600) % 60);

        System.out.println("Diff - " + h + " : Hour, " + m + " : Min, " + s + " : Sec ");
    }

    static void fun() {
        int n = 18;
        int flag = 0;
        while (n != 0) {
            if (n % 2 == 1) {
                flag = 1;
                break;
            }

            n = n / 2;
        }
        if (flag == 1) {
            System.out.println("No");
        } else System.out.println("yes");

    }
}

class Zodiac {
    static void zodiacc(int d, String month) {
        String Sign = "";
        System.out.println(month);
        if (month == "jan") {
            if (d >= 20)
                Sign = "Aquarius";
            else
                Sign = "Capricorn";
        } else if (month.equals("feb")) {
            if (d >= 19)
                Sign = "Pisces";
            else
                Sign = "Aquarius";
        } else if (month == "mar") {
            if (d >= 21)
                Sign = "Aries";
            else
                Sign = "Pisces";
        } else if (month == "apr") {
            if (d >= 20)
                Sign = "Taurus";
            else
                Sign = "Aries";
        } else if (month == "may") {
            if (d >= 21)
                Sign = "Gemini";
            else
                Sign = "Taurus";
        } else if (month == "jun") {
            if (d >= 21)
                Sign = "Cancer";
            else
                Sign = "Gemini";
        } else if (month == "jul") {
            if (d >= 23)
                Sign = "Leo";
            else
                Sign = "Cancer";
        } else if (month == "aug") {
            if (d >= 23)
                Sign = "Vigro";
            else
                Sign = "Leo";
        } else if (month == "sep") {
            if (d >= 23)
                Sign = "Libra";
            else
                Sign = "Vigro";
        } else if (month == "oct") {
            if (d >= 23)
                Sign = "Scorpio";
            else
                Sign = "Libra";
        } else if (month == "nov") {
            if (d >= 22)
                Sign = "Sagittarius";
            else
                Sign = "Scorpio";
        } else if (month == "dec") {
            if (d >= 22)
                Sign = "Capricorn";
            else
                Sign = "Sagittarius";
        }

        System.out.println(Sign);
    }

    public static void main(String[] args) {
        // System.out.print(args[0]);
        // int d = Integer.parseInt(args[0]);
        int d = 19;
        Scanner sc = new Scanner(System.in);
        System.out.print("\tEnter the month: ");
        String month = sc.nextLine();//args[1];
        //String month = "dec";
        zodiacc(d, month);
    }

}


class Time {
    int h, m, s;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter hour : ");
        h = sc.nextInt();
        System.out.print("enter min : ");
        m = sc.nextInt();
        System.out.print("enter sec : ");
        s = sc.nextInt();

    }

    void print() {
        System.out.println("\n " + h + " : Hour, " + m + " : Min, " + s + " : Sec ");
    }
}


class Account {

    private int accountNumber;
    private String name;
    private String accountType;
    private int balance;
    private final int minbalance = 1000;

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter accountNumber : ");
        accountNumber = sc.nextInt();
        System.out.print("enter name : ");
        name = sc.next();
        System.out.print("enter accountType : ");
        accountType = sc.next();

        System.out.print("enter balance : ");
        balance = sc.nextInt();

    }


    public boolean withdraw(int w) {
        System.out.println("Amount withdrawn: " + w);

        if (balance < w) {
            System.out.println("Sorry!!! No enough balance");
            return false;
        } else {
            if ((balance - w) < minbalance) {
                System.out.println("Pleas Maintain Min Balance : " + balance);
                return false;
            } else {
                balance = balance - w;
                System.out.println("Balance amount after withdraw: " + balance);
            }
            return true;
        }
    }

    public void display() {
        System.out.println("\nAcount Number: " + accountNumber);
        System.out.println("Name: " + name);
        System.out.println("Account Type: " + accountType);
        System.out.println("Balance: " + balance);
        System.out.println("Minimum Balance: " + minbalance);
    }

    public void deposit(int z) {
        balance = balance + z;
        System.out.println("Deposit Balance: " + z);
        System.out.println("Final Balance: " + balance);
    }

    public static void main(String[] args) {
        Account account = new Account();

        account.input();
        account.display();
        int flage = 1;
        while (flage == 1) {
            System.out.println("Enter your choice: ");
            System.out.println("1. Input ");
            System.out.println("2. Display Details ");
            System.out.println("3. Deposit ");
            System.out.println("4. Withdraw ");
            System.out.println("5. Exit ");
            Scanner scanner = new Scanner(System.in);
            int x = scanner.nextInt();
            switch (x) {
                case 1: {
                    account.input();
                    break;
                }
                case 2: {
                    account.display();
                    break;
                }
                case 3: {
                    System.out.print("Enter deposit amount : ");
                    int p = scanner.nextInt();
                    account.deposit(p);
                    break;
                }
                case 4: {
                    System.out.print("Enter withdraw amount : ");
                    int p = scanner.nextInt();
                    account.withdraw(p);
                }
                case 5: {
                    flage = 0;
                    break;
                }
            }
        }


    }
}


class Sort {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements: ");
        n = sc.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("Elements are: ");
        System.out.println(Arrays.toString(array));

        System.out.println("Choose sorting mode: ");
        String hit = sc.next();
        System.out.println("Your selection: " + hit);

        Arrays.sort(array);
        if (hit.equalsIgnoreCase("Ascending")) {
            System.out.println("\nAscending series is: ");
            System.out.println(Arrays.toString(array));
        } else if (hit.equalsIgnoreCase("Descending")) {
            System.out.println("\nDescending series is: ");
            for (int i = n - 1; i >= 0; i--) {
                System.out.print(array[i] + "\t");
            }
        }

    }
}

class Duplicate {
    public long duplicateDigits(long n) {
        long d = 0;
        if (n < 0) {
            System.out.println("Number must be positive");
            System.out.println("your number is : ");
            return n;

        } else {

            int c = (int) Math.floor(Math.log10(n) + 1);
            d = (long) (n * Math.pow(10, c) + n);
        }
        return d;
    }

    public static void main(String[] args) {
        Duplicate duplicate = new Duplicate();
        long n = duplicate.duplicateDigits(1500);
        System.out.println(n);
    }
}

class HighLowGuessingGame {

    public static void main(String[] args) {


        Random random = new Random();

        Scanner scanner = new Scanner(System.in);

        int number = random.nextInt(100);
        int guess = -1;

        while (guess != number) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            if (guess < number) {
                System.out.println("Too low, please try again");
            } else if (guess > number) {
                System.out.println("Too high, please try again");
            } else {
                System.out.println("Correct, the number was " + number);
            }
        }
    }

}

class StringChar{
    public static void main(String[] args) {
        String str;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a string : ");
        str=sc.nextLine();

        countOccrence(str);
        findIndex(str);


    }

    private static void findIndex(String str) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a index : ");
        int a=sc.nextInt();
        int l= str.length();

        if (a< (l-1) && a>=0){
            System.out.println("Character at "+a+ " is "+str.charAt(a));
        }else {
            System.out.println("Index is not valid");
        }


    }

    private static void countOccrence(String str) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Character to find its occurrence : ");
        char a=(sc.nextLine()).charAt(0);

        int l= str.length();

        int count=0;
        for (int i = 0; i < l; i++) {
            if (str.charAt(i)==a){
                count=count+1;
            }
        }

        System.out.println("Character "+a+" Occurs "+count+" times");
    }

}

class Q22{
    public static void main(String[] args) {

        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements: ");
        n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Elements are: ");
        for (int i = 0; i < n; i++) {
            //System.out.print(array[i] + "\t");
            System.out.println(a[i]);
        }


        findLargestAndSmalest(a);
        evenOrOdd(a);
        numPosiNegZero(a);
        sumAndAvg(a);

    }

    private static void sumAndAvg(int[] a) {
        int sum=0;
        for (int i = 0; i < a.length; i++) {
            sum=sum+a[i];
        }

        System.out.println("sum is "+ sum);
        System.out.println("Avg is "+ (float)(sum/a.length));
    }

    private static void numPosiNegZero(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0){
                System.out.println(a[i]+"element Is Zero");
            }else if (a[i] > 0)System.out.println(a[i]+"element Is positive");
            else System.out.println(a[i]+"element Is positive");

        }
    }

    private static void evenOrOdd(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] %2==0){
                System.out.println(a[i]+"element Is even");
            }else  System.out.println(a[i]+"element Is odd");

        }
    }

    private static void findLargestAndSmalest(int[] a) {
        int max=0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > a[max])
                max=i;
        }
        int min=0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < a[min])
                min=i;
        }

        System.out.println("Max Is "+ a[max]);
        System.out.println("Min Is "+ a[max]);
    }


}

class Q19{
    String registerNuber;
    String name;
    int sub1;
    int sub2;
    int sub3;
    float avg;
    String result;
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter registerNuber : ");
        registerNuber = sc.nextLine();
        System.out.print("enter name : ");
        name = sc.next();
        System.out.print("enter sub1 : ");
        sub1 = sc.nextInt();

        System.out.print("enter sub2 : ");
        sub2 = sc.nextInt();

        System.out.print("enter sub3 : ");
        sub3 = sc.nextInt();

        avg=(float) (sub1+sub2+sub3)/3;

        if (avg> 49) result="Pass";
        else result="Fail";
    }

    public void printDatails(){
        System.out.print(
                "\n Name : "+name+
                        "\n Register Number : "+registerNuber+
                        "\n Sub1  : "+sub1+
                        "\n Sub2  : "+sub2+
                        "\n Sub3  : "+sub3+
                        "\n Average  : "+avg+
                        "\n Result  : "+result);
    }
    public String getResult(){
        return result;
    }
    public float getAvarage(){
        return  avg;
    }

    public static void main(String[] args) {
        Q19 a=new Q19();

        a.input();
        a.printDatails();
    }

}