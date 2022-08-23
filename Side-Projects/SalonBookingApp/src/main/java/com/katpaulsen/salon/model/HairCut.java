package com.katpaulsen.salon.model;

import org.springframework.cglib.core.Local;


import java.time.LocalDate;
import java.time.LocalTime;

public class HairCut extends Appointment{

    private boolean isMensCut;
    private boolean isShortHair;
    private boolean isMediumHair;
    private boolean isLongHair;

    public HairCut(LocalTime startTime, LocalDate dateOfAppt, int duration) {
        super(startTime, dateOfAppt, duration);
    }

}
