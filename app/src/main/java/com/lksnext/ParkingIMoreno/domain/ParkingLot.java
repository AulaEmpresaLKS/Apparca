package com.lksnext.ParkingIMoreno.domain;

import java.util.ArrayList;
import java.util.Date;

import com.google.firebase.auth.FirebaseUser;

public class ParkingLot {
    private ArrayList<Slot> slots;
    private ArrayList<User> allowedUsers;

    public ParkingLot(ArrayList<Slot> slots, ArrayList<User> allowedUsers){
        this.slots = slots;
        this.allowedUsers = allowedUsers;
    }

    public void makeReservation(String uid, Vehicle v, Date start, Date end){
        ArrayList<Slot> availableSlots = this.getAvailability(start, end);
        /*Display the available slots*/
        /*choose an available slot*/
        try{
            availableSlots.get(0).addReservation(new Reservation(start, end, uid, v));
        }catch(Exception e){}
    }

    public ArrayList<Slot> getAvailability(Date start, Date end) {
        ArrayList<Slot> result = new ArrayList<>();
        for(Slot s:slots){
            if(s.isAvailable(start,end)){
                result.add(s);
            }
        }
        return result;
    }
}
