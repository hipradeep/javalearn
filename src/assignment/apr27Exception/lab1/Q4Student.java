package assignment.apr27Exception.lab1;

public class Q4Student {
    int rollNumber;
    String name;
    int age;
    String course;

    public Q4Student(int rollNumber, String name, int age, String course)  {
        try {
            this.rollNumber = rollNumber;
            if(!checkName(name)) throw new NameNotValidException("Name Not Valid Exception");
            this.name = name;
            if(!checkAge(age)) throw new AgeNotWithinRangeException("Age Not Within Range Exception");
            this.age = age;
            this.course = course;

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    private boolean checkAge(int age) {
        return age >= 15 && age <= 21;
    }

    private boolean checkName(String name) {
        char[] chaArr=name.toCharArray();

        for (char c : chaArr) {
            if (Character.isDigit(c)) return false;
        }
        return true;
    }


    public static void main(String[] args) {

        Q4Student student=new Q4Student(45,"pradeep", 22, "math" );
    }
}

class  AgeNotWithinRangeException extends Exception{

    public AgeNotWithinRangeException(String msg) {
        super(msg);
    }
}
class   NameNotValidException extends Exception{

    public NameNotValidException(String msg) {
        super(msg);
    }
}
