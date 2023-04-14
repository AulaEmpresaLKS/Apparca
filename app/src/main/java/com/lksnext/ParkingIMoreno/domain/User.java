package com.lksnext.ParkingIMoreno.domain;

import com.google.firebase.auth.FirebaseUser;

import java.util.ArrayList;
import java.util.Date;

public class User{
    private String name;
    private String surname;
    private String uid;
    private String email;
    private ArrayList<Vehicle> vehicles;

    public User(String name, String surname, String uid, String email){
        this.uid = uid;
        this.name = name;
        this.surname = surname;
        this.email = email;
        vehicles = new ArrayList<>();
    }

    public void addVehicle(Vehicle v){
        this.vehicles.add(v);
    }

    public ArrayList<Vehicle> getVehicles(){
        return this.vehicles;
    }

    public void makeReservation(Date start, Date end, ParkingLot pl){
        /*display user's vehicles*/
        /*choose vehicle*/
        pl.makeReservation(this.uid, this.vehicles.get(0),start, end);
    }
}
