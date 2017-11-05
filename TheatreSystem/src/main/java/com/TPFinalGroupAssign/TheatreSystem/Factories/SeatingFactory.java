package com.TPFinalGroupAssign.TheatreSystem.Factories;

import TheatreSystem.Domain.Seating;

public class SeatingFactory {

    public static Seating getUser(Map<String, Object> values){
        Seating seatingFact = new Seating.Builder()
                .seating_id((Long)values.get("seating_id"))
                .bookings((int) values.get("bookings"))
                .avail((int) values.get("surname"))
                .seatNumber((ArrayList<Integer>)values.get("seatNumber"))
                .line((String)values.get("line"))
                .price((double)values.get("price"))
                .build();
        return seatingFact;
    }
}