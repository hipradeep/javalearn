package assignment.mar21Lab;

public class Question2 {
    public static void main(String[] args) {
        Question2 question2=new Question2();
        question2.greater(2, 5);
        question2.greater(2, 5, 6);

    }

    void greater(int a, int b) {
        System.out.println("Greater a- " +a+" b- "+ b );
    }
    void greater(int a, int b, int c) {
        System.out.println("Greater a- " +a+" b- "+ b +" c- "+c);
    }
}
