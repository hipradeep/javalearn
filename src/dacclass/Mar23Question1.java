package dacclass;

import java.util.Scanner;

public class Mar23Question1 {
    public static void main(String[] args) {

        VehicleManagement vm=new VehicleManagement();
        vm.inputDetails();
        vm.displayVehicleDetails();
        if (vm.discount()> 10000){
            System.out.println("gifthamper");
        }else {
            System.out.println("try next time");
        }
    }
}

class VehicleManagement {

    String vehicleName;
    float vehiclePrice;
    int vehicleRegNumber;

    void inputDetails() {
        System.out.println("Enter Vehicle details ");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Vehicle Name : ");
        vehicleName = sc.nextLine();
        System.out.print("Enter Vehicle Price : ");
        vehiclePrice = sc.nextFloat();
        System.out.print("Enter Vehicle Registration Number : ");
        vehicleRegNumber = sc.nextInt();

    }

    void displayVehicleDetails() {
        System.out.println("Vehicle details ");
        System.out.println("Vehicle Name " + vehicleName);
        System.out.println("Vehicle Registration Number " + vehicleRegNumber);
        System.out.println("Vehicle Price " + vehiclePrice);
        System.out.println("Discount on Price " + discount());
    }

    float discount() {
        if (vehiclePrice > 10000)
            return vehiclePrice * (0.1f);
        else return vehiclePrice * (0.15f);
    }

}




