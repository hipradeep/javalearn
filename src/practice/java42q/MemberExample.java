package practice.java42q;

public class MemberExample {
    public static void main(String[] args) {
        Employeee employeee=new Employeee();
        employeee.name="Ragav";
        employeee.age=45;
        employeee.phone="0123456789";
        employeee.address="Lucknow";
        employeee.salary=1000;
        employeee.specialization="Android";

        Manager manager=new Manager();
        manager.name="Ragav";
        manager.age=35;
        manager.phone="0123456789";
        manager.address="Lucknow";
        manager.salary=2000;
        manager.department="Development";

        System.out.println("Employee details \n");
        System.out.println("Name - "+employeee.name);
        System.out.println("Age - "+employeee.age);
        System.out.println("phone - "+employeee.phone);
        System.out.println("address  - "+employeee.address);
        System.out.println("specialization - "+employeee.specialization);
        System.out.println("Salary - "+employeee.printSalary());

        System.out.println("Manager details \n");
        System.out.println("Name - "+manager.name);
        System.out.println("Age - "+manager.age);
        System.out.println("phone - "+manager.phone);
        System.out.println("address  - "+manager.address);
        System.out.println("department - "+manager.department);
        System.out.println("Salary - "+manager.printSalary());

    }
}

class Employeee extends Member {
    String specialization;
}

class Manager extends Member {
    String department;
}


class Member {
    String name;
    int age;
    String phone;
    String address;
    int salary;
    public int printSalary() {
      return salary;
    }
}