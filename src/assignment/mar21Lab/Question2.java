package assignment.mar21Lab;

public class Question2 {
    public static void main(String[] args) {
        Question2 question2=new Question2();
        question2.greater(2, 5);
        question2.greater(2, 5, 6);

    }

    void greater(int a, int b) {
        if(a>b)
            System.out.println("Greater is : " +a);
        else
            System.out.println("Greater is : " +b);
    }
    void greater(int a, int b, int c) {
        if(a>b && a>c)
            System.out.println("Greater is : " +a);
        if(b>a && b>c)
            System.out.println("Greater is : " +b);
        if(c>a && c>b)
            System.out.println("Greater is : " +c);
    }
}
