package practices_dt.miniprojects.vehicleinsurancecalculation;

import java.util.Scanner;

public class Vehicle {
    /*
    Vehicle types: car, truck, bus, motorcycle
                     -bus: 18-30 seats or 31 and above seats
      Tariff period: June 2023, December 2023
      1st term: June 2023                      2nd term: December 2023
         cars: 2000                            cars: 2500
         truck: 3000                           truck: 3500
         bus: type1: 4000 type2: 5000          bus: type1: 4500,  type2: 5500
         motorcycle: 1500                      motorcycle: 1750
     */

    public String type;
    public int payment;
    int busType;

    public int countPayment(int term){

        if (term==1){

            switch (type){
                case "CAR":
                    payment = 2000;
                    break;
                case "TRUCK":
                    payment = 3000;
                    break;
                case "BUS":
                    // calculation depends on the type of the bus
                    countBusPayment(term);
                    break;
                case "MOTORCYCLE":
                    payment= 1500;
                    break;
            }

        }else if (term==2){

            switch (type){
                case "CAR":
                    payment = 2500;
                    break;
                case "TRUCK":
                    payment = 3500;
                    break;
                case "BUS":
                    // calculation depends on the type of the bus
                    countBusPayment(term);
                    break;
                case "MOTORCYCLE":
                    payment = 1750;
                    break;
            }

        }else{
            System.out.println("Incorrect data!");
            payment = 0;
        }
        return payment;
    }

    // Create a method for bus payment separately
    public int countBusPayment(int term){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the type of the bus");
        System.out.println("1: 18-30 seats" + "\n2: 31 and above seats");
        // int busType = input.nextInt();  // create a local variable at the method level or decalre it at class level
        busType = input.nextInt(); // this variable is declared at class level and initiated here with user input

        switch (busType){
            case 1:        // bus type 1: 18-30 seats
                if (term==1){
                    payment= 4000;
                }else {
                    payment=4500;
                }
                break;
            case 2:         // bus type 2: 31 and above seats
                if (term==2){
                    payment=5500;
                }else {
                    payment = 5000;
                }
                break;

        }
        return payment;
    }

}
