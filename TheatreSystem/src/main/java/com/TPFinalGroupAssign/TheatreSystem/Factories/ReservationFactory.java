package com.TPFinalGroupAssign.TheatreSystem.Factories;

import TheatreSystem.Domain.Reservation;

public class ReservationFactory {

    public static Reservation getReservation(Map<String, Object> values){
        Reservation reservationFact = new Reservation.Builder()
                .rId((Long)values.get("rId"))
                .seatNumber((ArrayList<Integer>)values.get("seatNumber"))
                .total_price((int) values.get("total_price"))
                .show_id((int) values.get("show_id"))
                .userId((int)values.get("userId"))
                .build();
        return reservationFact;
    }
}