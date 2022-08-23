package com.katpaulsen.salon.dao;

import com.katpaulsen.salon.model.Appointment;

import java.time.LocalDate;
import java.util.List;

public interface AppointmentDao {

    Appointment getAppointment(int apptId);

    List<Appointment> getAppointmentsByDate(LocalDate dateOfAppt);

    Appointment createAppointment(Appointment appointment);

    void updateAppointment(Appointment appointment);

    void deleteAppointment(Appointment appointment);
}
