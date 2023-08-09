package AdvanceJavaPractice.busticketcalculation;

/*
             Project: app that calculates bus ticket price based on distance and conditions
Distance from User (KM), age and trip type (One-Way OR  Round-trip (Going&Returning )
Get seat number information.
All buses should have a seat number in total "32".

Take the payment as 1 USD / km per distance. (*2 for Round-trip trip)
First, calculate the total price of the trip and then apply the following rules to the customer according to the conditions;

Values received from the user must be valid (distance and age are positive numbers, trip type is 1 or 2).
Otherwise, "You Have Entered Wrong Data!" or Any warning should be given.

1- If the person has chosen the "Journey Type" Round-trip trip, 20% discount is applied on the ticket price.

2- Single Seat Fee:
If the seat number is 3 or a multiple of 3, the ticket price is increased by 20%.

3- Age discount:
If the person is younger than 12 years old, 50% discount is applied on the ticket price.
If the person is between the ages of 12-24, a 10% discount is applied on the ticket price.
If the person is over 65 years old, a 30% discount is applied on the ticket price.

*/

import java.util.Scanner;

public class TicketReservation {
    public static void main(String[] args) {
      //  Create a bus object
        Bus bus = new Bus("34 IST 34"); // this bus object has a list of seats at the backend => ["1","2", "3", ..."32"]

        // create a ticket object
        Ticket ticket = new Ticket();

        start(bus, ticket);

    }
    // to get the input from the user
    public static  void start(Bus bus, Ticket ticket){
        Scanner scan = new Scanner(System.in);
        int select;

        do{
            System.out.println("----- Welcome to our Ticket Reservation Service ----- ");
            System.out.println("Enter the distance as KM: ");
            double distance= scan.nextDouble();
            System.out.println("Enter the Type Of Journey: ");
            System.out.println("1-One Direction \n2-Round Trip");
            int type= scan.nextInt();

            System.out.println("Enter your age please");
            int age=scan.nextInt();
            System.out.println("Please select the Seat No");
            System.out.println("Single Seats are 20% more expensive than the other seats");
            System.out.println(bus.seats); // it's red => add Bus bus in method as parameter

            int seat = scan.nextInt();

            // remove the seat chosen by the user
            bus.seats.remove(String.valueOf(seat));  // coz seat given by the user is int ... and our seats list is String type

            // check if the user enters valid data
            // for journeyType
            boolean check = type==1 || type==2;

            // for distance and age
            if (distance>0 && age>0 && check){
                // calculate the ticket price
                ticket.distance = distance;  // assign the values given by the user to ticket object to be printed on the ticket
                ticket.journeyType = type;
                ticket.seatNo = seat;
                ticket.price = calculatePrice(ticket, age);
                ticket.printTicket(bus);


            }else {
                System.out.println("You Have Entered Wrong Data!");
            }


            // to restart the app in case of valid or invalid entry
            System.out.println("Press Any Number to Restart or Press 0 to Quit");
            select= scan.nextInt();


        }while (select!=0);



    }

    // create a method to calculate ticket price
    private static double calculatePrice(Ticket ticket, int age){
        double dist = ticket.distance;
        int type = ticket.journeyType;
        int seat = ticket.seatNo;

        double total = 0;

        switch (type){
            case 1: // if one way
                // to increase value for single seats
                if (seat%3==0){
                    total=dist*1.2;  // 20% increase
                }else {
                    total = dist*1;
                }
                System.out.println("Total Price: "+total);
                break;
            case 2: // if round trip
                if (seat%3==0){
                    total=dist*2.4; // 20% increase for round trip
                }else {
                    total=dist*2;
                }
                System.out.println("Total Price: "+total);
                total=total*0.8;  // 20% discount for round trip ==> double of one way journey
                System.out.println("Total Price after discount: "+total);
                break;
        }

        if (age<12){
            total = total*0.5;  // 50% discount
            System.out.println("Total Price after Discount:" + total);
        }else if(age>=12 && age<25){
            total = total*0.9;  // 10% discount
            System.out.println("Total Price after Discount:" + total);
        }else if(age>65 && age<120){  //  120 maximum age possible
            total = total*0.7;
            System.out.println("Total Price after Discount:" + total);
        }

        return total;


    }



}
