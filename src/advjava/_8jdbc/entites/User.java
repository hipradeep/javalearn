package advjava._8jdbc.entites;

public class User {
    private String name;
    private String rollNo;
    private String subject;
    private String course;

    public User() {
    }

    public User(String name, String rollNo, String subject, String course) {
        this.name = name;
        this.rollNo = rollNo;
        this.subject = subject;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", rollNo='" + rollNo + '\'' +
                ", subject='" + subject + '\'' +
                ", course='" + course + '\'' +
                '}';
    }
}
