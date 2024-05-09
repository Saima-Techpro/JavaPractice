package batch239_dt.miniprojects.vehicleinsurancecalculation;

import java.util.Scanner;

public class VehicleInsuranceCalculation {

    /*
    Project: Auto Insurance Payment Calculator
       Vehicle types: car, truck, bus, motorcycle
                     -bus: 18-30 seats or 31 and above seats
      Tariff period: June 2023, December 2023
      1st term: June 2023                      2nd term: December 2023
         cars: 2000                            cars: 2500
         truck: 3000                           truck: 3500
         bus: type1: 4000 type2: 5000          bus: type1: 4500,  type2: 5500
         motorcycle: 1500                      motorcycle: 1750
       In case of incorrect entry, the "Calculation failed" warning should be given to the user and the menu should be shown again.
       To be able to let user restart, we should present option to restart
     */

    public static void main(String[] args) {

        startCalculation();

    }

    public static void startCalculation(){

        Scanner input = new Scanner(System.in);
        boolean isFailed;


        do {
            isFailed = false;
            System.out.println("--Calculation for Vehicle Insurance--"+ "\nChoose a term for payment calculation ");
            System.out.println("1: June 2023 ");
            System.out.println("2: December 2023");
            int term = input.nextInt();

            // if user enters term correctly, the calculation process should start
            if (term == 1 || term == 2){
                Vehicle objVehicle = new Vehicle();
                System.out.println("Enter the type of the Vehicle");
                System.out.println("Car, Truck, Bus, Motorcycle");
                objVehicle.type = input.next().toUpperCase();
                objVehicle.payment = objVehicle.countPayment(term);

                String termType = term==1 ? "June 2023" : "December 2023";
                int select;
                // check if payment is negative
                if (objVehicle.payment > 0){

                    System.out.println(" Insurance details: ");
                    System.out.println("Vehicle type: "+ objVehicle.type);
                    System.out.println("Term: " + termType );
                    System.out.println("Insurance Payment due: " + objVehicle.payment);

                    // if user wants to calculate insurance for another vehicle
                    System.out.println("Press 1 to continue; press 0 to exit");
                    select = input.nextInt();

                    if (select==1){
                        isFailed = true;
                    }else {
                        isFailed = false;
                    }


                }else {  // if payment is negative
                    System.out.println("Calculation incorrect! ");
                    System.out.println("Press 1 to continue; press 0 to exit");
                    select = input.nextInt();

                    if (select==1){
                        isFailed = true;
                    }else {
                        isFailed = false;
                    }

                }

            }else {  // if user enters term incorrectly
                System.out.println("Incorrect data. Calculation failed!!");
                isFailed=true;

            }

        }while(isFailed);

    }

}
