package dacclass.apr9;

import dacclass.apr12.Person;

public class EmployeeOrg extends Person {
    int salary=50000;
    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public int getAgr() {
        return super.getAgr();
    }

    public int getSalary() {
        return salary;
    }
}
