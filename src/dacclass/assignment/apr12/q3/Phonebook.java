package dacclass.assignment.apr12.q3;

import java.util.Scanner;

public class Phonebook {
    private String name, address, phone;

    class Personal {
        private String relation;

        public void getInput() {
            System.out.println("Details +" +
                    "\n  Name : " + name +
                    "\n  phone : " + phone +
                    "\n Address : " + address +
                    "\n relation : " + relation
            );

        }

        public void putInput() {

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Personal Details ");
            System.out.println("Enter Your name : ");
            name = sc.next();
            System.out.println("Enter Your address : ");
            address = sc.next();
            System.out.println("Enter Your phone : ");
            phone = sc.next();

            System.out.println("Enter Your relation : ");
            relation = sc.next();
        }
    }

    class Business {
        private String organization, dept, mobile;

        public void accept() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Business Details ");
            System.out.println("Enter Your name : ");
            name = sc.next();
            System.out.println("Enter Your address : ");
            address = sc.next();
            System.out.println("Enter Your phone : ");
            phone = sc.next();
            System.out.println("Enter organization : ");
            organization = sc.next();
            System.out.println("Enter dept : ");
            dept = sc.next();
            System.out.println("Enter mobile : ");
            mobile = sc.next();

        }

        public void show() {

            System.out.println("Details +" +
                    "\n  Name : " + name +
                    "\n  phone : " + phone +
                    "\n Address : " + address +
                    "\n  Organization : " + organization +
                    "\n  dept : " + dept +
                    "\n mobile : " + mobile
            );

        }

    }
}
