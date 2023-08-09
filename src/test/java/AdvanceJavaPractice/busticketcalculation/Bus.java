package AdvanceJavaPractice.busticketcalculation;

import java.util.ArrayList;
import java.util.List;

public class Bus {
    //busNum or display, seatNo etc.

    public String busNum;

    public List<String> seats = new ArrayList<>();  // coz if List has Integer datatype, when we apply remove(), it will
                                                   // re-index the whole list and make that seat (which is already booked) show in the available seats list)

    // when we create Bus object, numberPlate and seatNo should be provided

    public Bus(String busNum){
        this.busNum = busNum;
        for (int i=1; i<=32; i++){  // OR i<33
            this.seats.add(i + "");  // OR String.valueOf(i)
        }

    }

}
