package practice.java42q;

import dacclass.april.apr9.EmployeeOrg;

public class HROrg extends EmployeeOrg {
    int salaryIncreasedBy=10000;
    @Override
    public String getName() {
        return super.getName();
    }
    @Override
    public int getAgr() {
        return super.getAgr();
    }
    @Override
    public int getSalary() {
        return super.getSalary() + salaryIncreasedBy;
    }

    public static void main(String[] args) {
        HROrg hrOrg=new HROrg();
        System.out.println("HR salary : "+hrOrg.getSalary());
        EmployeeOrg employeeOrg=new EmployeeOrg();
        System.out.println("Employee salary : "+employeeOrg.getSalary());
    }
}
