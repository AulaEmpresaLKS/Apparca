package com.lksnext.ParkingIMoreno.domain;

import java.util.Date;

public class Reservation {

    private Date start;
    private Date end;
    private String uid;

    private Vehicle vehicle;

    public Reservation(Date start, Date end, String uid, Vehicle v) throws Exception{
        if(start.before(end)){
            this.start = start;
            this.end = end;
            this.uid = uid;
            this.vehicle = v;
        }else{
            throw new Exception();
        }

    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public boolean matches(Date beginning, Date end){
        return beginning.before(this.end);
    }



}
