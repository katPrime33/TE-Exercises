package com.katpaulsen.salon.model;

import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;

public class Appointment {

    private int apptId;
    private LocalTime startTime;
    private LocalDate dateOfAppt;
    private int duration;
    boolean isAvailable;

    public Appointment(LocalTime startTime, LocalDate dateOfAppt, int duration){
        this.startTime = startTime;
        this.dateOfAppt = dateOfAppt;
        this.duration = duration;
    }

    public int getApptId() {
        return apptId;
    }

    public void setApptId(int apptId) {
        this.apptId = apptId;
    }

    public LocalDate getDateOfAppt() {
        return dateOfAppt;
    }

    public void setDateOfAppt(LocalDate dateOfAppt) {
        this.dateOfAppt = dateOfAppt;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}
