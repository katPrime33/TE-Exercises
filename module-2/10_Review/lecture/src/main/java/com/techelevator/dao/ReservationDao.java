package com.techelevator.dao;

import com.techelevator.model.Reservation;

import java.util.List;

public interface ReservationDao {

    Reservation createReservation(Reservation reservation);

    Reservation getReservation(int reservationId);

    List<Reservation> getReservations();

    void updateReservation(Reservation reservation);

    void deleteReservation(int reservationId);
}
