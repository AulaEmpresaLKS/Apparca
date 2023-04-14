package com.lksnext.ParkingIMoreno.domain;

import java.util.ArrayList;
import java.util.Date;

public class Slot {
    private int id;

    private String type;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(ArrayList<Reservation> reservations) {
        this.reservations = reservations;
    }

    private ArrayList<Reservation> reservations;

    public Slot(int id, String type){
        this.id = id;
        this.type = type;
        this.reservations = new ArrayList<>();
    }

    public void addReservation(Reservation r){
        this.reservations.add(r);
    }

    public boolean isAvailable(Date start, Date end){
        boolean result = true;
        for(Reservation r:reservations){
            if (r.matches(start,end)){
                result = false;
            }
        }
        return result;
    }

}
