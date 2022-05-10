package dacclass.labfinaltest;

import java.util.Scanner;

public class HospitalManagementSystem {

    public static void main(String[] args) {
        int NUM_PATIENT = 5;

        //patient array
        Patient[] patients = new Patient[NUM_PATIENT];

        for (int i = 0; i < patients.length; i++) {
            //taking patient details from user
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter details for patient " + (i + 1));

            System.out.print("Name : ");
             String name=(new Scanner(System.in)).nextLine();

            System.out.print("Age : ");
            int age=(new Scanner(System.in)).nextInt();

            System.out.print("Address : ");
            String address=(new Scanner(System.in)).nextLine();

            System.out.print("Mobile : ");
            String mobile=(new Scanner(System.in)).nextLine();


            patients[i] = new Patient(name, age, address, mobile);

        }

        System.out.println("---------------------------------------");
        //showing hospital details
        Hospital.show();

        System.out.println("---------------------------------------");

        //showing patient details

        for (int i = 0; i < patients.length; i++) {
            System.out.println("Patient " + (i+1)+" details - ");
            patients[i].display();

        }

    }

}

class Patient {
    private String name;
    private int age;
    private String address;
    private String mobile;

    public Patient() {
        name = "Patient 1";
        age = 25;
        address = "Address 1";
        mobile = "0123456789";
    }

    public Patient(String name, int age, String address, String mobile) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.mobile = mobile;
    }

    public void display() {
        System.out.println(
                        " Name : " + name +
                        "\n Age : " + age +
                        "\n Address : " + address +
                        "\n Mobile : " + mobile+" \n"

        );


    }
}

class Hospital {
    static final String hospitalName = "Raja Krishnamurti Hospital Lucknow";
    static final String hospitalAddress = "D-34, Rajajipuram Lucknow UP India";

    static void show() {
        System.out.println("Hospital details");
        System.out.println("Name : " + hospitalName);
        System.out.println("Address : " + hospitalAddress);
    }
}
