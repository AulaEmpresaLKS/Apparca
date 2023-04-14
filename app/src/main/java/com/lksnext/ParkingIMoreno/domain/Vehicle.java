package com.lksnext.ParkingIMoreno.domain;

public class Vehicle {
    private String plateNumber;

    public Vehicle(String plateNumber){
        this.plateNumber = plateNumber;
    }

    public String getPlateNumber(){
        return this.plateNumber;
    }

    public void setPlateNumber(String plateNumber){
        this.plateNumber = plateNumber;
    }
}
