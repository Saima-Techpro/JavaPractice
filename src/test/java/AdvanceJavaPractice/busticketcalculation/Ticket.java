package AdvanceJavaPractice.busticketcalculation;


public class Ticket {
    // create a ticket class to print all the values that you want to see on the ticket
    // distance, journeyType, price, seatNo

    public double distance;
    public int journeyType;
    public double price;
    public int seatNo;

    public void printTicket(Bus bus){
        System.out.println("Total Price: " + this.price);
        System.out.println(" ---Ticket Details--- ");
        System.out.println("Bus No: " + bus.busNum);
        System.out.println("Distance: " +this.distance);
        System.out.println("Type of Journey: " + (this.journeyType==1 ? "One Direction": "Round Trip"));
        System.out.println("Seat No: " + this.seatNo);
        System.out.println("Have a nice trip!");
    }




}
