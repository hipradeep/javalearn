package assignment.apr7constructorandstatic;

public class Q6Employee {
    //Q 6 Write a program by creating an 'Employee' class having the following methods and print the final salary.
    //1 - 'getInfo()' which takes the salary, number of hours of work per day of employee as parameter
    //2 - 'AddSal()' which adds 10000 to salary of the employee if it is less than 50000.
    //3 - 'AddWork()' which adds 5000 to salary of employee if the number of hours of work per day is more than 6 hours.
    int salary, hPerDay;

    void getInfo(int salary, int hPerDay) {
        this.salary = salary;
        this.hPerDay = hPerDay;
    }

    void addSalary() {
        if (salary < 50000) {
            salary = salary + 10000;
        }
    }

    void addWork() {
        if (hPerDay > 6) {
            salary = salary + 5000;
        }
    }

    public int getSalary() {
        return salary;
    }

    public static void main(String[] args) {
        Q6Employee employee = new Q6Employee();
        employee.getInfo(40000, 7);
        employee.addSalary();
        employee.addWork();
        System.out.println("Final Salary - " + employee.getSalary());
    }
}
